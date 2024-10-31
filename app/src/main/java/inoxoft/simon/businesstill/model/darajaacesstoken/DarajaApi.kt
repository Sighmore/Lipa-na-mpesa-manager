package inoxoft.simon.businesstill.model.darajaacesstoken

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface DarajaApi {
    @GET("oauth/v1/generate?grant_type=client_credentials")
    fun getAuthToken(
            @Header("Authorization") auth: String
    ): Call<AuthTokenResponse>
}
