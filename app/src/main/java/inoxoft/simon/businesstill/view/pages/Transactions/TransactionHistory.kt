package inoxoft.simon.businesstill.view.pages.Transactions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TransactionHistory(modifier: Modifier) {

    Column {
        Text(text = "Payment records")
        Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
            Text(text = "Date")
            Text(text = "Amount")
            Text(text = "Status")
        }
        Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){


        }

    }

}
