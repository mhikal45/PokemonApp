package com.test.pokemonapp.data.local.pokemonlist

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Links(

	@field:SerializedName("next_page")
	val nextPage: String? = null,

	@field:SerializedName("first_page")
	val firstPage: String? = null,

	@field:SerializedName("last_page")
	val lastPage: String? = null,

	@field:SerializedName("prev_page")
	val prevPage: String? = null
) : Parcelable