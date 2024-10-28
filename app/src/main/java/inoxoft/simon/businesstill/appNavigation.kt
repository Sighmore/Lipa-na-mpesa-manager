package inoxoft.simon.businesstill

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import inoxoft.simon.businesstill.view.pages.HomeScreen
import inoxoft.simon.businesstill.view.pages.LoginScreen
import inoxoft.simon.businesstill.view.pages.ReverseTransactionScreen
import inoxoft.simon.businesstill.view.pages.SignInScreen
import inoxoft.simon.businesstill.view.pages.TillHomeScreen
import inoxoft.simon.businesstill.view.pages.TillToTillScreen
import inoxoft.simon.businesstill.view.pages.TransactionHistory
import inoxoft.simon.businesstill.view.pages.TransactionInitScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(modifier: Modifier = Modifier, scrollBehavior: TopAppBarScrollBehavior){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home", builder = {
        composable("home"){ HomeScreen(modifier,navController) }
        composable("login"){ LoginScreen(modifier,navController) }
        composable("Signup"){ SignInScreen(modifier,navController) }
        composable("homeTill"){ TillHomeScreen(modifier,navController,scrollBehavior) }
        composable("TillToTill"){ TillToTillScreen(modifier) }
        composable("TransactionHistory"){ TransactionHistory(modifier) }
        composable("transactionInit"){ TransactionInitScreen(modifier) }
        composable("reverseTransaction"){ ReverseTransactionScreen(modifier) }
    })
}

