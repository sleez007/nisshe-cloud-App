package co.kingsleyetoka.common.data.di

import android.content.Context
import androidx.room.Room
import co.kingsleyetoka.common.data.cache.AppDatabase
import co.kingsleyetoka.common.data.cache.Cache
import co.kingsleyetoka.common.data.cache.RoomCache
import co.kingsleyetoka.common.data.cache.daos.CartDao
import co.kingsleyetoka.common.data.cache.daos.ProductDao
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CacheModule {
    @Binds
    abstract fun bindCache(cache: RoomCache): Cache

    companion object{

        @Provides
        @Singleton
        fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "appDb.db").build()
        }

        @Provides
        fun provideCartDao(appDatabase: AppDatabase): CartDao = appDatabase.cartDao()

        @Provides
        fun provideCohortPaymentDao(appDatabase: AppDatabase): ProductDao = appDatabase.productDao()
    }
}