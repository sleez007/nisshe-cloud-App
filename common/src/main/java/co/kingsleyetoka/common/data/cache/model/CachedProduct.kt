package co.kingsleyetoka.common.data.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class CachedProduct(
    @PrimaryKey(autoGenerate = true)
    val id: Long =0,
){
    companion object {
        fun fromDomain(): CachedProduct{
            return CachedProduct(id = 0)
        }
    }

    // fun toDomain():
}
