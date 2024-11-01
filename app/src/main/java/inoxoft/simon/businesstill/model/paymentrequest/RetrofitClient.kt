package inoxoft.simon.businesstill.model.paymentrequest

import inoxoft.simon.businesstill.model.darajaacesstoken.DarajaApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    //Instance of retrofit a singleton class

    private const val BASE_URL = "https://sandbox.safaricom.co.ke/" // or "https://api.safaricom.co.ke/" for production


    val instance: DarajaApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())//json converter factory
            .build()

        retrofit.create(DarajaApi::class.java)

    }
}