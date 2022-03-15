package com.example.myfirstproject

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    private val random = Random()
    private val numbers = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<Button>(R.id.buttonNum1)
        val num2 = findViewById<Button>(R.id.buttonNum2)
        val num3 = findViewById<Button>(R.id.buttonNum3)
        val num4 = findViewById<Button>(R.id.buttonNum4)
        val num5 = findViewById<Button>(R.id.buttonNum5)
        val num6 = findViewById<Button>(R.id.buttonNum6)

        findViewById<FloatingActionButton>(R.id.floatingActionButton1).setOnClickListener{
          numbers.clear()
            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)

        }
    }
    private fun setLottoNum(lottoNum:Button){
       var num=0
       while(true){
           num=random.nextInt(45)+1
           if(!numbers.contains(num))
               numbers.add(num)
           break
       }
        lottoNum.text = "${num}"
        if (num <= 10) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(108, 44, 223))
        }
        else if (num <= 20) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(6, 138, 243))
        }
        else if (num <= 30) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(13, 236, 22))
        }
        else if (num <= 40) {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(237, 214, 12))
        }
        else {
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(253, 9, 92))
        }

    }
}