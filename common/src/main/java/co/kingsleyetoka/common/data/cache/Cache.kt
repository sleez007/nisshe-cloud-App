package co.kingsleyetoka.common.data.cache

import co.kingsleyetoka.common.data.cache.model.CachedProduct
import kotlinx.coroutines.flow.Flow

interface Cache {
    suspend fun storeProducts(product: List<CachedProduct>)
    suspend fun getProducts(): Flow<List<CachedProduct>>
    suspend fun addToCart(productId: String)
    suspend fun removeFromCart(productId: String)
}