package co.kingsleyetoka.common.data.di

import co.kingsleyetoka.common.data.api.ApiConstants
import co.kingsleyetoka.common.data.api.CloudApi
import co.kingsleyetoka.common.data.api.interceptor.AuthenticationInterceptor
import co.kingsleyetoka.common.data.api.interceptor.NetworkStatusInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class APIModule {

    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder): CloudApi {
        return builder.build().create(CloudApi::class.java)
    }

    @Provides
    fun provideGSON(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_ENDPOINT)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Provides
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        networkStatusInterceptor: NetworkStatusInterceptor,
        authenticationInterceptor: AuthenticationInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(networkStatusInterceptor)
            .addInterceptor(authenticationInterceptor)
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

}