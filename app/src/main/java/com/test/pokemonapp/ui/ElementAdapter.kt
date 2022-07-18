package com.test.pokemonapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.pokemonapp.data.local.pokemonlist.TypesItem
import com.test.pokemonapp.databinding.ElementListBinding

class ElementAdapter (val elementList : List<TypesItem?>?) : RecyclerView.Adapter<ElementAdapter.ViewHolder>() {
    inner class ViewHolder (val binding : ElementListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (element : TypesItem?) {
            with(binding) {
                tvElement.text = " ${element?.name} "
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ElementListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element : TypesItem? = elementList?.get(position)
        holder.bind(element)
    }

    override fun getItemCount(): Int = elementList!!.size
}