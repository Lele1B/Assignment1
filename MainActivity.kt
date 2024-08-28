package com.example.assigmentp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<TextView>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val results = when (age) {
                    in 20..25 -> "Tupac Shakur"
                    in 26..35 -> "Heath Ledger"
                    in 35..45 -> "Marilyn Monroe"
                    in 46..55 -> "Michael Jackson"
                    in 56..67 -> "Abraham Lincoln"
                    in 68..78 -> "Ida B. Wells"
                    in 79..85 -> "Jerry Springer"
                    in 86..90 -> "Dr Seuss "
                    in 91..95 -> "Harriet Tubman"
                    in 96..100 -> "Elizabeth ||.Queen"
                    else -> "Senior"
                }
                txtResults.text = "Age: $age\n${
                    when (results) {
                        "Tupac Shakur" -> "Tupac Shakur died at age of 25"
                        "Heath Ledger" -> "Heath Ledgere died at the age of 28"
                        "Marilyn Monroe" -> "Marilyn Monroe died at the age of 36"
                        "Michael Jackson" -> "Michael Jackson died at the age of 50"
                        "Abraham Lincoln" -> "Abraham Lincoln died at the age of 56"
                        "Ida B. Wells" -> "Ida B.Wells died at the age of 68"
                        "Jerry Springer" -> "Jerry Springer died at the age of"
                        "Dr Seuss" -> "Dr Seuss died at the age of 87"
                        "Harriet Tubman" -> "Harriet Tubman died at the age of 91"
                        "Elizabeth || Queen" -> "Elizabeth || Queen died at the age of 96"
                        else -> "Please enter the age between the age of 20 and 100"
                    }
                }"
            } else {
                txtResults.text = "Please enter valid age"
            }
        }
        btnClear.setOnClickListener {
            ageNumber.text.clear()
        }
    }
}
