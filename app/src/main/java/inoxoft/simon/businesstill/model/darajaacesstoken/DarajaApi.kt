package inoxoft.simon.businesstill.model.darajaacesstoken

import inoxoft.simon.businesstill.model.paymentrequest.StkPushRequest
import inoxoft.simon.businesstill.model.paymentrequest.StkPushResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface DarajaApi {

    @GET("oauth/v1/generate?grant_type=client_credentials")
    fun getAuthToken(
            @Header("Authorization") auth: String
    ): Call<AuthTokenResponse>

    @POST("mpesa/stkpush/v1/processrequest")
    fun pushStk(
            @Header("Authorization") authHeader: String,
            @Body stkPushRequest: StkPushRequest
    ): Call<StkPushResponse>

}
