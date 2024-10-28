package inoxoft.simon.businesstill.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SignInScreen(modifier: Modifier, navController: NavHostController) {
    Column(modifier.padding(10.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Image(modifier = Modifier
            .padding(10.dp)
            .size(150.dp),
            imageVector = Icons.Default.Person,
            contentDescription = null)
        Spacer(modifier = Modifier.height(40.dp))



        OutlinedTextField(value = email , onValueChange ={email = it})
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password , onValueChange ={password = it})
        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { }) {

            Text(text = "Create Account")

            Spacer(modifier = Modifier.height(16.dp))

            Text(modifier = Modifier.padding(10.dp).clickable { navController.navigate("login") },
                text = "Have an account? Login")

        }

    }
}