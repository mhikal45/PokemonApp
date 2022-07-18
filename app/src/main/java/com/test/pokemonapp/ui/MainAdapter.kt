package com.test.pokemonapp.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.pokemonapp.data.local.pokemonlist.DataItem
import com.test.pokemonapp.databinding.PokemonGridListBinding

class MainAdapter (val pokemonList: ArrayList<DataItem?>?) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    inner class ViewHolder (val binding : PokemonGridListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (pokemon : DataItem?) {
            binding.tvNoPokemon.text = pokemon?.number
            binding.tvPokemonName.text = pokemon?.name

            Glide.with(itemView.context)
                .load(pokemon?.avatar)
                .into(binding.imgPokemon)

            val listElement = pokemon?.types
            binding.rvElement.adapter = ElementAdapter(listElement)
            binding.rvElement.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PokemonGridListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokemonList?.get(position)
        Log.d("Pokemon",pokemon.toString())
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int = pokemonList!!.size
}