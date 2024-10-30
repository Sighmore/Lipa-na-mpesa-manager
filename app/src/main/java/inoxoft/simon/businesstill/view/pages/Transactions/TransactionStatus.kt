package inoxoft.simon.businesstill.view.pages.Transactions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TransactionSuccess(){
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Payment status")
        Spacer(modifier = Modifier.height(16.dp))
        Icon(
            modifier = Modifier.size(100.dp),
            imageVector = Icons.Default.Check, contentDescription = "Payment status"

        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Payment successful")
    }
}

@Composable
fun TransactionFailed(){
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Payment status")
        Spacer(modifier = Modifier.height(16.dp))
        Icon(modifier = Modifier.size(100.dp),
            imageVector = Icons.Default.Check, contentDescription = "Payment status")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Payment failed")
    }
}

@Composable
fun TransactionPending(){
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Payment status")
        Spacer(modifier = Modifier.height(16.dp))
        Icon(modifier = Modifier.size(100.dp),
            imageVector = Icons.Default.Refresh, contentDescription = "Payment status")

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Payment pending")
    }
}

















