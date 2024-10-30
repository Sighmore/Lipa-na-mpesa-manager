package inoxoft.simon.businesstill.view.pages.Transactions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionInitScreen(modifier: Modifier) {
    Column(
        modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        var phoneNumber = remember {mutableStateOf("")}
        var amount = remember {mutableStateOf("")}

        Text(modifier= Modifier.padding(20.dp).fillMaxWidth(),
            text = "INITIATE PAYMENT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier= Modifier.padding(20.dp).fillMaxWidth(),
        text = "Enter Customer phone number")

        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = {Text(text = "Phone number")})

        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier= Modifier.padding(20.dp).fillMaxWidth(),
            text = "Enter amount")
        TextField(
            modifier=Modifier.fillMaxWidth(),
            value = "", onValueChange = {}, label = {Text(text = "Amount")})

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

        }) {
            Text(text = "Initiate Payment")
        }
    }
}
