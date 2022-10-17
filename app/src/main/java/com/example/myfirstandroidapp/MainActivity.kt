package com.example.myfirstandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstandroidapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


     lateinit var binding: ActivityMainBinding
     val nothing = 0
     val multiply = 5
     val plus = 1
     val minus = 2
     val div = 3
     val percent = 4


     var mode = nothing
    val resultCalculator = 0
     private var inMint = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.Buttonx.setOnClickListener {
            if (mode!=nothing && inMint.isNotEmpty()) equalize()
            mode = multiply
        }

        binding.Button0.setOnClickListener {

             val filteredString=binding.display.text.toString().substringAfter(".").map { "0" }
            val subString=binding.display.text.toString().substringAfter(".")

            if (filteredString.size==subString.length){
                if (binding.display.text != "0")

                    binding.display.append("0")
                else {
                    binding.display.text = "0"
                }
            }



        }

        binding.btnEqual.setOnClickListener {



            if (inMint.isNotEmpty()) equalize()



        }

        binding.Button1.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("1")
                    else {
                        binding.display.text = "1"
                    }

                }

                else -> inMint = inMint.plus(1)

            }


        }

        binding.Button2.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("2")
                    else {
                        binding.display.text = "2"
                    }

                }

                else -> inMint = inMint.plus(2)

            }


        }

        binding.Button3.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("3")
                    else {
                        binding.display.text = "3"
                    }

                }

                else -> inMint = inMint.plus(3)

            }


        }

        binding.Button4.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("4")
                    else {
                        binding.display.text = "4"
                    }

                }

                else -> inMint = inMint.plus(4)

            }


        }

        binding.Button5.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("5")
                    else {
                        binding.display.text = "5"
                    }

                }

                else -> inMint = inMint.plus(5)

            }


        }

        binding.Button6.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("6")
                    else {
                        binding.display.text = "6"
                    }

                }

                else -> inMint = inMint.plus(6)

            }


        }

        binding.Button7.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString()  != "0")

                        binding.display.append("7")
                    else {
                        binding.display.text = "7"
                    }

                }

                else -> inMint = inMint.plus(7)

            }


        }

        binding.Button8.setOnClickListener {


            when (mode) {

                nothing -> {
                    if (binding.display.text.toString() != "0")

                        binding.display.append("8")
                    else {
                        binding.display.text = "8"
                    }

                }

                else -> inMint = inMint.plus(8)

            }


        }

        binding.Button9.setOnClickListener {


            when (mode) {

                nothing -> {


                    if (binding.display.text.toString() != "0")

                        binding.display.append("9")
                    else {
                        binding.display.text = "9"
                    }

                }

                else -> inMint = inMint.plus(9)

            }


        }

        binding.Buttonpoint.setOnClickListener {


            if (!binding.display.text.toString().contains(".")){

                binding.display.append(".")
            }

        }

        binding.Buttonclearall.setOnClickListener {
            binding.display.text = "0"
            mode = nothing
            inMint = ""
        }

        binding.Buttonpersent.setOnClickListener {
            if (mode!=nothing && inMint.isNotEmpty()) equalize()
            mode = percent
        }
        binding.Buttonmines.setOnClickListener {
            if (mode!=nothing && inMint.isNotEmpty()) equalize()

            mode = minus

        }
        binding.Buttonplus.setOnClickListener {
            if (mode!=nothing && inMint.isNotEmpty()) equalize()
            mode = plus
        }
        binding.Buttondiv.setOnClickListener {
            if (mode!=nothing && inMint.isNotEmpty()) equalize()
            mode = div
        }
        binding.Buttonclear.setOnClickListener {
            binding.display.text=binding.display.text.toString().dropLast(1)
        }






    }
    fun equalize(){
        val firstNumber = binding.display.text.toString().toDouble()
        val secondNumber = inMint.toLong()
        when(mode){
            multiply-> {

                binding.display.text = (firstNumber * secondNumber).toString()
            }
            minus ->{
                binding.display.text = (firstNumber - secondNumber).toString()

            }

            plus->{
                binding.display.text = (firstNumber + secondNumber).toString()

            }
            div->{

                binding.display.text = (firstNumber / secondNumber).toString()

            }
            percent->{

                binding.display.text = (firstNumber % secondNumber).toString()

            }
        }

        inMint=""

    }
}