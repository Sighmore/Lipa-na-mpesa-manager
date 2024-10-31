package inoxoft.simon.businesstill.view.pages.Transactions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inoxoft.simon.businesstill.ui.theme.green

@Composable
fun TransactionHistory(modifier: Modifier) {

    Column (
        modifier.padding(30.dp),
        verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            color = green,
            text = "Payment records",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Date")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Name")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Phone Number")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Amount")
        }
        Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
            //The data fetched from the ApI is displayed here
        }
    }
}
