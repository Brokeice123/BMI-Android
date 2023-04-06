package com.example.bmi_calculator_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_bmi:TextView
    private lateinit var kilo_input:EditText
    private lateinit var meter_input:EditText
    private lateinit var button_calculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_bmi = findViewById(R.id.display_result)
        kilo_input = findViewById(R.id.weight_input)
        meter_input = findViewById(R.id.height_input)
        button_calculate = findViewById(R.id.bmi_calculate)

        button_calculate.setOnClickListener {

            var weight = kilo_input.text.toString().trim()
            var height = meter_input.text.toString().trim()

            if (weight.isEmpty() || height.isEmpty()){
                Toast.makeText(this, "Please Enter Valid Inputs", Toast.LENGTH_SHORT).show()
            } else{

                var height2 = height.toDouble() * height.toDouble()
                var result = weight.toDouble() / height2
                display_bmi.text = result.toString()
                
            }

        }

    }
}