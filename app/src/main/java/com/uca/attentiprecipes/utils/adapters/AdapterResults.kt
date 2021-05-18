package com.uca.attentiprecipes.utils.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.ResultsSearch
import kotlinx.android.synthetic.main.item_recipes.view.*

class AdapterResults() : RecyclerView.Adapter<AdapterResults.ViewHolder>() {

    lateinit var items: ResultsSearch

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recipes, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = items

        holder.namerecipe.text = model.totalResults.toString()
//
//        Picasso.get()
//            .load(model.image)
//            .into( holder.image)


    }

    override fun getItemCount(): Int {
        return if (::items.isInitialized){
            1
        }else{
            0
        }    }

    fun setResults(items: ResultsSearch){
        this.items = items as ResultsSearch
        notifyDataSetChanged()
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val namerecipe: TextView = view.recipename
        val image: ImageView = view.imagerecipe
    }

}