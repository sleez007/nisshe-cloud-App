package co.kingsleyetoka.common.data.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart")
data class CachedCart(
    @PrimaryKey(autoGenerate = true)
    val id: Long =0,
){
    companion object {
        fun fromDomain():  CachedCart{
            return  CachedCart(id = 0)
        }
    }

    // fun toDomain():
}
