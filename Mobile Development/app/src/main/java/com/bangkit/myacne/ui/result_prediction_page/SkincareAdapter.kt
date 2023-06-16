package com.bangkit.myacne.ui.result_prediction_page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.myacne.data.SkincareProduct
import com.bangkit.myacne.databinding.ItemSkincareBinding

class SkincareAdapter : RecyclerView.Adapter<SkincareAdapter.ViewHolder>() {

    private val listSkincare = ArrayList<SkincareProduct>()
    fun setData(items: List<SkincareProduct>) {
        listSkincare.clear()
        listSkincare.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemSkincareBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(skincare: SkincareProduct) {
            binding.apply {
                tvType.text = skincare.type
                tvName.text = skincare.type
                tvMainIngredient.text = skincare.mainIngredient
                tvDescription.text = skincare.description
                tvPrice.text = skincare.price.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemSkincareBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listSkincare.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listSkincare[position])
    }


}