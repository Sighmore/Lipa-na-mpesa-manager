package inoxoft.simon.businesstill.view.pages.payments

import android.icu.text.SimpleDateFormat
import android.util.Base64
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inoxoft.simon.businesstill.ui.theme.green
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import inoxoft.simon.businesstill.model.darajaacesstoken.AuthTokenResponse
import inoxoft.simon.businesstill.model.darajaacesstoken.Constants
import inoxoft.simon.businesstill.model.darajaacesstoken.RetrofitClient
import inoxoft.simon.businesstill.model.darajaacesstoken.getAuthHeader
import inoxoft.simon.businesstill.model.paymentrequest.StkPushRequest
import inoxoft.simon.businesstill.model.paymentrequest.StkPushResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Date
import java.util.Locale

@Composable
fun TransactionInitScreen(modifier: Modifier) {
    var phoneNumber by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }

    Column(
        modifier = modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(20.dp).fillMaxWidth(),
            text = "INITIATE PAYMENT",
            color = green,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(modifier = Modifier.padding(20.dp).fillMaxWidth(), text = "Customer number")
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)),
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text(text = "Phone number") }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier = Modifier.padding(20.dp).fillMaxWidth(), text = "Enter amount")

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)),
            value = amount,
            onValueChange = { amount = it },
            label = { Text(text = "Amount") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { initiatePayment(phoneNumber, amount)
                      phoneNumber=""
                amount=""
                      },

            colors = ButtonDefaults.buttonColors(containerColor = green)
        ) {
            Text(text = "Initiate Payment")
        }
    }
}

private fun initiatePayment(phoneNumber: String, amount: String) {
    // Fetch access token first
    getAccessToken { token ->
        if (token != null) {
            initiateStkPush(phoneNumber, amount, token)
        } else {
            Log.e("Daraja", "Failed to retrieve access token")
        }
    }
}

private fun initiateStkPush(phoneNumber: String, amount: String, authToken: String) {
    val timestamp = SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Date())
    val tillNo = "174379"
    val passkey = "bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919"
    val password = Base64.encodeToString(
        (tillNo + passkey + timestamp).toByteArray(),
        Base64.NO_WRAP
    )

    val callbackUrl = "https://us-central1-your-project-id.cloudfunctions.net/handleDarajaCallback" // Replace with your actual callback URL


    val stkPushRequest = StkPushRequest(
        BusinessShortCode = tillNo,
        Password = password,
        Timestamp = timestamp,
        Amount = amount,
        PartyA = phoneNumber,
        PartyB = tillNo,
        PhoneNumber = phoneNumber,
        CallBackURL = callbackUrl,
        AccountReference = "Pay goods",
        TransactionDesc = "Payment"
    )

    val authHeader = "Bearer $authToken"
    RetrofitClient.instance.pushStk(authHeader, stkPushRequest).enqueue(object : Callback<StkPushResponse> {
        override fun onResponse(call: Call<StkPushResponse>, response: Response<StkPushResponse>) {
            if (response.isSuccessful) {
                val stkResponse = response.body()
                Log.d("Daraja", "STK Push Successful: ${stkResponse?.CustomerMessage}")
            } else {
                Log.e("Daraja", "STK Push Failed: ${response.errorBody()?.string()}")
            }
        }

        override fun onFailure(call: Call<StkPushResponse>, t: Throwable) {
            Log.e("Daraja", "STK Push Error: ${t.message}")
        }
    })
}

private fun getAccessToken(callback: (String?) -> Unit) {



    val authHeader = getAuthHeader(Constants().consumerKey, Constants().consumerSecret)

    RetrofitClient.instance.getAuthToken(authHeader).enqueue(object : Callback<AuthTokenResponse> {
        override fun onResponse(call: Call<AuthTokenResponse>, response: Response<AuthTokenResponse>) {
            if (response.isSuccessful) {
                val token = response.body()?.accesstoken
                Log.d("Daraja", "Access Token: $token")
                callback(token) // Pass token to callback
            } else {
                Log.e("Daraja", "Failed to get token: ${response.errorBody()?.string()}")
                callback(null)
            }
        }

        override fun onFailure(call: Call<AuthTokenResponse>, t: Throwable) {
            Log.e("Daraja", "Error: ${t.message}")
            callback(null)
        }
    })
}
