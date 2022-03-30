package co.kingsleyetoka.common.data.api.model.mappers

/** AN INTERFACE TO HELP CONVERT API MODEL TO DOMAIN MODEL**/
interface ApiMapper<E, D> {
    fun mapToDomain(apiEntity: E): D
}