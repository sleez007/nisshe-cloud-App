package co.kingsleyetoka.common.data.api

import retrofit2.http.*

interface CloudApi {
    @POST(value=ApiConstants.LOGIN_ENDPOINT)
    @FormUrlEncoded
    suspend fun login(@Field("email") email: String, @Field("password") password: String)

    @GET(value=ApiConstants.PRODUCT_ENDPOINT)
    suspend fun getProducts()

    @GET(value=ApiConstants.PRODUCT_ENDPOINT)
    suspend fun getProductById(@Query(ApiParameters.ID) id: String)
}