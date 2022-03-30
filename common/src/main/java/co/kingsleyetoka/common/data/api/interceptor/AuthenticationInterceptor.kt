package co.kingsleyetoka.common.data.api.interceptor

import co.kingsleyetoka.common.data.api.ApiConstants.KEY
import co.kingsleyetoka.common.data.api.ApiParameters.AUTH_HEADER
import co.kingsleyetoka.common.data.api.ApiParameters.TOKEN_TYPE
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class AuthenticationInterceptor @Inject constructor(): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val interceptedRequest :Request = chain.createAuthenticatedRequest()
        return  chain.proceed(interceptedRequest)
    }

    private fun Interceptor.Chain.createAuthenticatedRequest(): Request {
        return request().newBuilder().addHeader(AUTH_HEADER, TOKEN_TYPE + KEY ).build()
    }
}