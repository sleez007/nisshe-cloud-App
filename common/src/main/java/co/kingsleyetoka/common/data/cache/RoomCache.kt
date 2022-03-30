package co.kingsleyetoka.common.data.cache

import co.kingsleyetoka.common.data.cache.daos.CartDao
import co.kingsleyetoka.common.data.cache.daos.ProductDao
import co.kingsleyetoka.common.data.cache.model.CachedProduct
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RoomCache @Inject constructor(private val cartDao: CartDao, private val productDao: ProductDao) : Cache{
    override suspend fun storeProducts(product: List<CachedProduct>) {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(): Flow<List<CachedProduct>> {
        TODO("Not yet implemented")
    }

    override suspend fun addToCart(productId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFromCart(productId: String) {
        TODO("Not yet implemented")
    }
}