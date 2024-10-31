package inoxoft.simon.businesstill.model.darajaacesstoken

import android.util.Base64

fun getAuthHeader(consumerKey: String, consumerSecret: String): String {
    val credentials = "$consumerKey:$consumerSecret"
    val auth = Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)
    return "Basic $auth"
}