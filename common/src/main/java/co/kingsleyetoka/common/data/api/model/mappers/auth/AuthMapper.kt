package co.kingsleyetoka.common.data.api.model.mappers.auth

import co.kingsleyetoka.common.data.api.model.ApiAuth
import co.kingsleyetoka.common.data.api.model.mappers.ApiMapper
import co.kingsleyetoka.common.data.api.model.mappers.MappingException
import co.kingsleyetoka.common.domain.model.auth.Auth
import javax.inject.Inject

class AuthMapper @Inject constructor(): ApiMapper<ApiAuth, Auth> {
    override fun mapToDomain(apiEntity: ApiAuth): Auth {
        return Auth(
            status = apiEntity.status.orEmpty(),
            message =  apiEntity.message ?: throw  MappingException("Message must be returned as part of payload")
        )
    }
}