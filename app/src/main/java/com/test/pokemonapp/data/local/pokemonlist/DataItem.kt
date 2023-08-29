package com.test.pokemonapp.data.local.pokemonlist

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataItem(

	@field:SerializedName("id")
	val number: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("sprites")
	val avatar: String? = null,

	@field:SerializedName("abilities")
	val abilities : List<AbilityItem?>? = null

) : Parcelable

@Parcelize
data class AbilityItem (

	@field:SerializedName("id")
	val number : String? = null,

	@field:SerializedName("name")
	val name: String? = null

) : Parcelable
