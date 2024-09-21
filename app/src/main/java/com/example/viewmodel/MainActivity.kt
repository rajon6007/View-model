package com.example.viewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewmodel.Viewmodel.CounterViewModel
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding : ActivityMainBinding
    private val counterViewModel : CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        counterViewModel.counter.observe(this) {  binding.countTxt.text = it.toString() }

        binding.countBtn.setOnClickListener {
            counterViewModel.increment()


            binding.countBtn2.setOnClickListener {
                counterViewModel.decrement()


                binding.resetBtn.setOnClickListener {
                    counterViewModel.reset()

                }
            }
        }


    }
}