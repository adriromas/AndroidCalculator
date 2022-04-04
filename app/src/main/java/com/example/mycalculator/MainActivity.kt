package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calc_screen = findViewById<TextView>(R.id.calc_screen)
        val bt_1 = findViewById<Button>(R.id.bt_1)
        var text = ""
        calc_screen.text = text
        bt_1.setOnClickListener {
            text += "1"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_1.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_2 = findViewById<Button>(R.id.bt_2)
        bt_2.setOnClickListener {
            text += "2"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_2.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_3 = findViewById<Button>(R.id.bt_3)
        bt_3.setOnClickListener {
            text += "3"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_3.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_4 = findViewById<Button>(R.id.bt_4)
        bt_4.setOnClickListener {
            text += "4"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_4.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_5 = findViewById<Button>(R.id.bt_5)
        bt_5.setOnClickListener {
            text += "5"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_5.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_6 = findViewById<Button>(R.id.bt_6)
        bt_6.setOnClickListener {
            text += "6"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_6.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_7 = findViewById<Button>(R.id.bt_7)
        bt_7.setOnClickListener {
            text += "7"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_7.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_8 = findViewById<Button>(R.id.bt_8)
        bt_8.setOnClickListener {
            text += "8"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_8.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_9 = findViewById<Button>(R.id.bt_9)
        bt_9.setOnClickListener {
            text += "9"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_9.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_0 = findViewById<Button>(R.id.bt_0)
        bt_0.setOnClickListener {
            text += "0"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_0.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_clr = findViewById<Button>(R.id.bt_clr)
        bt_clr.setOnClickListener {
            text += ""
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_clr.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_division = findViewById<Button>(R.id.bt_division)
        bt_division.setOnClickListener {
            text += "/"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_division.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_product = findViewById<Button>(R.id.bt_product)
        bt_product.setOnClickListener {
            text += "*"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_product.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_substract = findViewById<Button>(R.id.bt_substract)
        bt_substract.setOnClickListener {
            text += "-"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_substract.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_sum = findViewById<Button>(R.id.bt_sum)
        bt_sum.setOnClickListener {
            text += "+"
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_sum.text}", Toast.LENGTH_SHORT).show()
        }
        val bt_del = findViewById<Button>(R.id.bt_del)
        bt_del.setOnClickListener {
            text = text.dropLast(1)
            calc_screen.text = text
            Toast.makeText(this, "You pressed${bt_del.text}", Toast.LENGTH_SHORT).show()
        }
    }
}