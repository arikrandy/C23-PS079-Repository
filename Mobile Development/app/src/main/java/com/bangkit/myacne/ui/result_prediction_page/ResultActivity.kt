package com.bangkit.myacne.ui.result_prediction_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.myacne.R
import com.bangkit.myacne.data.skincareProducts
import com.bangkit.myacne.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var adapter: SkincareAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val level = intent.getStringExtra(LEVEL)
        binding.tvAcneLevel.text = level
        binding.rvSkinCare.layoutManager = LinearLayoutManager(this)
        adapter = SkincareAdapter()
        binding.rvSkinCare.adapter = adapter
        when (level) {
            "level_1" -> {
                getData(1)
            }
            "level_2" -> {
                getData(2)
            }
            "level_3" -> {
                getData(3)
            }
            "level_4" -> {
                getData(4)
            }
        }
    }

    companion object {
        const val LEVEL = "level"
    }

    private fun getData(level: Int) {
        val products = skincareProducts.filter { it.level == level}
        adapter.setData(products)
    }
}