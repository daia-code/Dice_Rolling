package com.example.dicerolling

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener {
          rollDiceMA()
        }
    }
    private fun rollDiceMA(){
        val diceMA=DiceMA(6)
        val cubeRoll=diceMA.rollMA()
        val diceImage:ImageView=findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice4)
       when(cubeRoll){
           1->diceImage.setImageResource(R.drawable.dice1)
           2->diceImage.setImageResource(R.drawable.dice2)
           3->diceImage.setImageResource(R.drawable.dice3)
           4->diceImage.setImageResource(R.drawable.dice4)
           5->diceImage.setImageResource(R.drawable.dice5)
           6->diceImage.setImageResource(R.drawable.dice6)
       }
    }
    class  DiceMA(val numSidesMA:Int){
        fun rollMA():Int{
            return(1..numSidesMA).random()
        }
    }
}