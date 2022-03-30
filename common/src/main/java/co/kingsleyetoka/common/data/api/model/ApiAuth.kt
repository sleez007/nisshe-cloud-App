package co.kingsleyetoka.common.data.api.model

import com.google.gson.annotations.SerializedName

data class ApiAuth(
    @SerializedName("status")
    val status : String?,

    @SerializedName("message")
    val message: String?
)