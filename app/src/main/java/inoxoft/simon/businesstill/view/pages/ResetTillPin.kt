package inoxoft.simon.businesstill.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import inoxoft.simon.businesstill.ui.theme.green

@Composable
fun ResetTillPin(modifier: Modifier, navController: NavHostController) {
    Column(modifier.padding(10.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var storeNo by remember { mutableStateOf("") }
        var tillNo by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }

        Image(
            modifier = Modifier
                .padding(10.dp)
                .size(150.dp),
            imageVector = Icons.Default.Person,
            contentDescription = null,

            )
        Spacer(modifier= Modifier.height(16.dp))
        Text(text = "WELCOME BACK", color= green, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = tillNo,
            onValueChange = { tillNo = it },
            label = { Text(text = "Till Number") },
            shape = RoundedCornerShape(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = storeNo,
            onValueChange = { storeNo = it },
            label = { Text(text = "store Number") },
            shape = RoundedCornerShape(16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Account Email") },
            shape = RoundedCornerShape(16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(horizontalArrangement = Arrangement.Center) {
            Button(onClick = { }) {

                Text(text = "Reset Pin")

            }
        }

        Spacer(modifier = Modifier.height(30.dp))


        Row(horizontalArrangement = Arrangement.Center,verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Have a  Pin?")
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { navController.navigate("Signup") }) {
                Text(text = "Login")
            }

        }
    }
}













