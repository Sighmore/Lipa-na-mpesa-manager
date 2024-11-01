package inoxoft.simon.businesstill.model.paymentrequest

import android.util.Log
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.ktx.Firebase

private lateinit var remoteConfig: FirebaseRemoteConfig

private fun initializeRemoteConfig() {
    remoteConfig = Firebase.remoteConfig
    val defaultConfigMap = mapOf("callback_url" to "https://your-default-url.com")
    remoteConfig.setDefaultsAsync(defaultConfigMap)

    remoteConfig.fetchAndActivate().addOnCompleteListener { task ->
        if (task.isSuccessful) {
            val callbackUrl = remoteConfig.getString("callback_url")
            Log.d("Firebase", "Callback URL: $callbackUrl")
            // Use this URL for your Daraja API callback
        } else {
            Log.e("Firebase", "Failed to fetch config.")
        }
    }
}
