package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultRoll : TextView = findViewById(R.id.result_roll)
        val buttonRoll : Button = findViewById(R.id.btn_roll);
        val buttoCount : Button = findViewById(R.id.btn_countUp);
        buttonRoll.setOnClickListener{Roll(6,resultRoll)};
        buttoCount.setOnClickListener{countUp(resultRoll)};


    }
    private fun countUp(view: TextView){

        val resultRoll = view.text.toString();
        var resultCount = 0;
        if(resultRoll.equals("Hello World!"))
        {
            resultCount = 1;
            view.text = "${resultCount}";
        }else{
            if (resultRoll.toInt() < 6)
            {
                resultCount = 1 + resultRoll.toInt();
                view.text = "${resultCount}";
            }

        }


        Toast.makeText(this, "contador :${resultCount}",
                Toast.LENGTH_SHORT).show()
    }

    private fun Roll(sides: Int, view: TextView){
        val numRandom = (1..sides).random();

        view.text = "${numRandom}";


    }

}