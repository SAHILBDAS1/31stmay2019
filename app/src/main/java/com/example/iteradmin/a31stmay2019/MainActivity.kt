package com.example.iteradmin.a31stmay2019

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i =findViewById<ImageView>(R.id.image)
        val zin =findViewById<Button>(R.id.zoomin)
        val zout =findViewById<Button>(R.id.zoomout)
        val ch =findViewById<Button>(R.id.change)
        val im2 ="https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2018/10/17/Pictures/_9d910eb0-d214-11e8-9a37-2776cb441552.jpg"
        zin.setOnClickListener {
            val x:Float = image.scaleX
            val y:Float = image.scaleY

            image.scaleX=x+1
            image.scaleY=y+1


        }
        zout.setOnClickListener {
            val x:Float = image.scaleX
            val y:Float = image.scaleY
            image.scaleX=x-1
            image.scaleY=y-1


        }
        ch.setOnClickListener {
            Glide.with(this).load(im2).into(image)
        }

    }
}
