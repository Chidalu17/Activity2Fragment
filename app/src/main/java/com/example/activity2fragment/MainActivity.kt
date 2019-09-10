package com.example.activity2fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val editText:EditText = findViewById<EditText>(R.id.editText)
         val button:Button = findViewById<Button>(R.id.button)


        button.setOnClickListener{
            val name: String = editText.text.toString()
             val fragment = FragmentHome.newInstance(name)
             supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment,fragment, "frag")
                .commit()
        }

    }
}
