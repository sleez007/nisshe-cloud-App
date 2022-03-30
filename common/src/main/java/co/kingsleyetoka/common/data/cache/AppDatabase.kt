package co.kingsleyetoka.common.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import co.kingsleyetoka.common.data.cache.daos.CartDao
import co.kingsleyetoka.common.data.cache.daos.ProductDao
import co.kingsleyetoka.common.data.cache.model.CachedCart
import co.kingsleyetoka.common.data.cache.model.CachedProduct

@Database(
    entities = [CachedCart::class,CachedProduct::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun cartDao(): CartDao
    abstract fun productDao(): ProductDao
}