package inoxoft.simon.businesstill

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.google.firebase.FirebaseApp
import inoxoft.simon.businesstill.model.darajaacesstoken.AuthTokenResponse
import inoxoft.simon.businesstill.model.darajaacesstoken.RetrofitClient
import inoxoft.simon.businesstill.model.darajaacesstoken.getAuthHeader
import inoxoft.simon.businesstill.ui.theme.BusinesstillTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinesstillTheme {

                val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
                    state = rememberTopAppBarState()
                )

                Scaffold(modifier = Modifier.fillMaxSize().nestedScroll(scrollBehavior.nestedScrollConnection)
                ) { innerPadding ->
                    AppNavigation(modifier = Modifier.padding(innerPadding),scrollBehavior)
                }
            }
        }
    }
}

