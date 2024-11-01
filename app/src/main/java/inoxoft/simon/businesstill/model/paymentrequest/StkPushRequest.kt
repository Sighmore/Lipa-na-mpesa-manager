package inoxoft.simon.businesstill.model.paymentrequest


//data class for the stk push request
data class StkPushRequest(
        val BusinessShortCode: String,
        val Password: String,
        val Timestamp: String,
        val TransactionType: String = "CustomerPayBillOnline",
        val Amount: String,
        val PartyA: String,
        val PartyB: String,
        val PhoneNumber: String,
        val CallBackURL: String,
        val AccountReference: String,
        val TransactionDesc: String
)
data class StkPushResponse(
        val MerchantRequestID: String?,
        val CheckoutRequestID: String?,
        val ResponseCode: String?,
        val ResponseDescription: String?,
        val CustomerMessage: String?
)
