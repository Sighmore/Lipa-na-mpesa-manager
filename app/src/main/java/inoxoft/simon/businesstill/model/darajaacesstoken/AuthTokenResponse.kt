package inoxoft.simon.businesstill.model.darajaacesstoken

import com.google.gson.annotations.SerializedName

data class AuthTokenResponse(
        @SerializedName("access_token") val accesstoken: String,
        @SerializedName("expires_in") val expiresin: String
)
