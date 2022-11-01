package com.example.princesssumayanursery

import android.R
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.princesssumayanursery.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val costTV: TextView = findViewById(id.cost)
        val btCost: Button = findViewById(id.costBT)
        val levelSP: Spinner = findViewById(id.spLevel)
        var flag: String = "KG1";
        val options = arrayOf("KG1" , "KG2")
        levelSP.adapter = ArrayAdapter<Any>(this, R.layout.simple_list_item_1,options)

        btCost.setOnClickListener { view ->


            if (flag == "KG1") {
                costTV.text = KG1(1000).toString();
            } else {
                costTV.text = KG2(1350).toString();
            }
        }
        levelSP.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2) //p2 is the index of selected item
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }


}


public fun KG1(kg1: Int):Int{
  return kg1;
}

public fun KG2(kg2: Int):Int{
    return kg2;
}