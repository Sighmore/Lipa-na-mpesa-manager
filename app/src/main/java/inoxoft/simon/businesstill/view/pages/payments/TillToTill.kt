package inoxoft.simon.businesstill.view.pages.payments

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inoxoft.simon.businesstill.ui.theme.green
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun TillToTillScreen(modifier: Modifier) {

    var tillNumber by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }

    Column(modifier.padding(30.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Till to Till",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color=green
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Enter Till Number")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = tillNumber,
            onValueChange = { tillNumber = it },
            label = { Text(text = "Till Number") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Enter Amount")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text(text = "Amount") }
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = green // Set the background color to green
            )
        ) {
            Text(text = "Make Payment")
        }
    }

}
