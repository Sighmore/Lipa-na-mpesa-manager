package inoxoft.simon.businesstill

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import inoxoft.simon.businesstill.view.pages.auth.HomeScreen
import inoxoft.simon.businesstill.view.pages.auth.ResetTillPin
import inoxoft.simon.businesstill.view.pages.Transactions.ReverseTransactionScreen
import inoxoft.simon.businesstill.view.pages.auth.SignInScreen
import inoxoft.simon.businesstill.view.pages.main.TillHomeScreen
import inoxoft.simon.businesstill.view.pages.payments.TillToTillScreen
import inoxoft.simon.businesstill.view.pages.Transactions.TransactionHistory
import inoxoft.simon.businesstill.view.pages.Transactions.TransactionInitScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(modifier: Modifier = Modifier, scrollBehavior: TopAppBarScrollBehavior){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home", builder = {
        composable("home"){ HomeScreen(modifier,navController) }
        composable("ResetTillPin"){ ResetTillPin(modifier,navController) }
        composable("Signup"){ SignInScreen(modifier,navController) }
        composable("homeTill"){ TillHomeScreen(modifier,navController,scrollBehavior) }
        composable("TillToTill"){ TillToTillScreen(modifier) }
        composable("TransactionHistory"){ TransactionHistory(modifier) }
        composable("transactionInit"){ TransactionInitScreen(modifier) }
        composable("reverseTransaction"){ ReverseTransactionScreen(modifier) }
    })
}

