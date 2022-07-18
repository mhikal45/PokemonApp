package com.test.pokemonapp.data.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.test.pokemonapp.data.local.detailpokemon.Data
import com.test.pokemonapp.data.local.detailpokemon.DetailPokemonResponse
import com.test.pokemonapp.data.local.pokemonlist.DataItem
import com.test.pokemonapp.data.local.pokemonlist.PokemonListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {

    fun getPokemonList () : LiveData<List<DataItem?>> {
        val pokemonList = MutableLiveData<List<DataItem?>>()
        val client = ApiConfig.getApiService().getPokemonList()
        client.enqueue(object : Callback<PokemonListResponse> {
            override fun onResponse(
                call: Call<PokemonListResponse>,
                response: Response<PokemonListResponse>
            ) {
                val result = response.body()?.data
                pokemonList.value = result
            }

            override fun onFailure(call: Call<PokemonListResponse>, t: Throwable) {
                Log.e("Pokemon List","${t.message}")
            }
        })
        return pokemonList
    }

    fun getDetailPokemon (uid : String) : LiveData<Data?> {
        val pokemonDetail = MutableLiveData<Data?>()
        val client = ApiConfig.getApiService().getDetailPokemon(uid)
        client.enqueue(object : Callback<DetailPokemonResponse> {
            override fun onResponse(
                call: Call<DetailPokemonResponse>,
                response: Response<DetailPokemonResponse>
            ) {
                val result = response.body()?.data
                pokemonDetail.value = result
            }

            override fun onFailure(call: Call<DetailPokemonResponse>, t: Throwable) {
                Log.e("Detail Pokemon","${t.message}")
            }
        })

        return  pokemonDetail
    }
}