package br.com.rectius.contactlist.model

import com.google.gson.annotations.SerializedName

data class Contact(
    @SerializedName("_id") val id: String? = null,
    val name: String,
    val email: String,
    @SerializedName("phone") val phone : Phone
)
