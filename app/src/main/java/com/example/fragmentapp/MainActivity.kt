package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFrag1 : Button = findViewById(R.id.frag1btn)
        val btnFrag2 : Button = findViewById(R.id.frag2btn)




        btnFrag1.setOnClickListener(){
            val frag1 : Fragment = Fragment1()


            val fragTransaction : FragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragTransaction.replace(R.id.frameLayout1,frag1).commit()

        }

        btnFrag2.setOnClickListener(){
            val frag2 : Fragment = Fragment2()
            val fragmentTransaction : FragmentTransaction =
                supportFragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frameLayout2,frag2).commit()
        }


    }
}