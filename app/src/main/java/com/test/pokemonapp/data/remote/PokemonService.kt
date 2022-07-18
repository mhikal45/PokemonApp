package com.test.pokemonapp.data.remote

import com.test.pokemonapp.data.local.detailpokemon.DetailPokemonResponse
import com.test.pokemonapp.data.local.pokemonlist.PokemonListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface PokemonService {

    @GET("pokemons?limit=10&page=1")
    fun getPokemonList () : Call<PokemonListResponse>

    @GET("pokemons/{uid}")
    fun getDetailPokemon(uid : String) : Call<DetailPokemonResponse>


}