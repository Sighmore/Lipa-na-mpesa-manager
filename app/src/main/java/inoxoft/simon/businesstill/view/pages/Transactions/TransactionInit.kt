package inoxoft.simon.businesstill.view.pages.Transactions

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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inoxoft.simon.businesstill.ui.theme.green

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
            color=green,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier= Modifier.padding(20.dp).fillMaxWidth(),
        text = "Customer number")

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            value = "",
            onValueChange = {},
            label = {Text(text = "Phone number")})

        Spacer(modifier = Modifier.height(16.dp))
        Text(modifier= Modifier.padding(20.dp).fillMaxWidth(),
            text = "Enter amount")
        OutlinedTextField(
            modifier=Modifier.fillMaxWidth().clip(RoundedCornerShape(10.dp)),
            value = "", onValueChange = {}, label = {Text(text = "Amount")})
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

        },
            colors=ButtonDefaults.buttonColors(
                containerColor=green
            )
            ) {
            Text(text = "Initiate Payment")
        }
    }
}
