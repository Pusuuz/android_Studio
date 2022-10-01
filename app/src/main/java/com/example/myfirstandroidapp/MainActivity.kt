package com.example.myfirstandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstandroidapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val nothing = 0
    private val multiply = 5
    private val plus = 1
    private val minus = 2
    private val div = 3
    private val percent = 4


    var mode = nothing
    val resultCalculator = 0
    var secondNumber = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.Button0.setOnClickListener {

            if (binding.display.text.length != 1)

                binding.display.append("1")
            else {
                binding.display.text = "1"
            }
        }

        binding.btnEqual.setOnClickListener {
            when(mode){
                multiply-> {
                    val firstNumber = binding.display.text.toString().toLong()
                    val secondNumber = secondNumber.toLong()

                    binding.display.text = (firstNumber * secondNumber).toString()

                }
            }
        }

        binding.Button1.setOnClickListener {


            when (mode) {
                nothing -> {
                    if (binding.display.text != "0")

                        binding.display.append("1")
                    else {
                        binding.display.text = "1"
                    }

                }
                else -> secondNumber = secondNumber.plus(1)



            }
            binding.Buttonx.setOnClickListener {
                mode = multiply
            }


            fun allClearAction() {}
            fun backSpaceAction() {}
            fun equalAction() {}
        }
    }
}