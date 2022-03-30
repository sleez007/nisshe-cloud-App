package co.kingsleyetoka.common.data.api

object ApiConstants {
    const val BASE_ENDPOINT = "https://kasppe.com.ng"
    const val BASE_PREFIX = "/farmsolhub/wp-json/wc/v3/"

    const val LOGIN_ENDPOINT = "${BASE_PREFIX}niishcloud_api/v1/login"
    const val PRODUCT_ENDPOINT ="${BASE_PREFIX}products"

    const val KEY = "ck_22d3eb1bf122b7122b521636f632f9b68fac9ea6"
    const val SECRET = "cs_472d58f2647f8b36dc364079ae3ccc6782cd710d"
}

object ApiParameters{
    const val TOKEN_TYPE = "Bearer "
    const val AUTH_HEADER = "Authorization"
    const val ID ="id"
}