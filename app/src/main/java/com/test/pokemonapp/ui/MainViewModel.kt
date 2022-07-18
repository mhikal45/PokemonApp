package com.test.pokemonapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.test.pokemonapp.data.local.pokemonlist.DataItem
import com.test.pokemonapp.data.remote.RemoteDataSource

class MainViewModel : ViewModel() {

    fun getPokemonList () : LiveData<List<DataItem?>> = RemoteDataSource().getPokemonList()
}