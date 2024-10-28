package inoxoft.simon.businesstill.view.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(modifier: Modifier, navController: NavHostController) {
    Column(modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "LIPA NA MPESA",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Green)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Till manager",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            color = Color.Green)
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate("login") },
            modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth()
            ) {
            Text(text = "Sign In")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("Signup") },
            modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth()
        ) {
            Text(text = "Sign Up")
        }
    }
}
