package inoxoft.simon.businesstill.view.pages.Transactions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inoxoft.simon.businesstill.ui.theme.green

@Composable
fun NotificationScreen(modifier: Modifier, navController: NavHostController) {
    Column (modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Notification Center",
            fontSize = 30.sp,
            color = green
        )

        Spacer(modifier = Modifier.height(10.dp))

    }
}