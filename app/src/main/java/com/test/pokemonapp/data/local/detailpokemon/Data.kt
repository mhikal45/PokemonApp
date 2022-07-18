package com.test.pokemonapp.data.local.detailpokemon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("types")
	val types: List<TypesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("resistances")
	val resistances: List<ResistancesItem?>? = null,

	@field:SerializedName("avatar")
	val avatar: String? = null,

	@field:SerializedName("evolutions")
	val evolutions: List<EvolutionsItem?>? = null,

	@field:SerializedName("classification")
	val classification: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
) : Parcelable