package com.test.pokemonapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.GridLayoutManager
import com.test.pokemonapp.R
import com.test.pokemonapp.data.local.pokemonlist.DataItem
import com.test.pokemonapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    private val mainViewModel : MainViewModel = MainViewModel()
    private val pokemonList : ArrayList<DataItem?> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainViewModel.getPokemonList().observe(this) {
            Log.d("Data",it.toString())
            pokemonList.addAll(it)

            mainBinding.rvPokemonList.layoutManager = GridLayoutManager(this,2)
            mainBinding.rvPokemonList.adapter = MainAdapter(pokemonList)
        }
    }
}