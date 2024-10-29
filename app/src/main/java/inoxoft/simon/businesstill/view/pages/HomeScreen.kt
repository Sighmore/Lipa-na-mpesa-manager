package inoxoft.simon.businesstill.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import inoxoft.simon.businesstill.R
import inoxoft.simon.businesstill.ui.theme.green


@Composable
fun HomeScreen(modifier: Modifier, navController: NavHostController) {
    Column(modifier = modifier.fillMaxSize()
        .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
            Column(modifier = Modifier.padding(start = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Welcome",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = green
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "To",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Mpesa Till",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp,
                    color = green)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.icon),
                contentDescription = "lipa",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Crop
            )
        }





        Spacer(modifier = Modifier.height(16.dp))



        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate("Signup") },
            modifier = Modifier.align(Alignment.CenterHorizontally).width(250.dp)

            ) {
            Text(text = "Manage Till"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
            ){
            Text(text = "Forgot Pin?")
            Spacer(modifier= Modifier.width(10.dp))
            Button (onClick = {navController.navigate("ResetTillPin")}){
                Text(text = "Reset")
            }
        }
    }
}
