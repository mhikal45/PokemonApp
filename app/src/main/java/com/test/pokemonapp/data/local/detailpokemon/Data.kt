package com.test.pokemonapp.data.local.detailpokemon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.test.pokemonapp.data.local.pokemonlist.AbilityItem
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val uuid: String? = null,

	@field:SerializedName("abilities")
	val abilities : List<AbilityItem?>? = null
) : Parcelable