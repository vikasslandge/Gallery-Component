package com.example.vikaslandge.gallarycomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var files :Array<File>? = null
        var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Video/"
        var file = File(path)
        if (!file.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Video"
            file = File(path)
        }
        if (file.exists()){
            files = file.listFiles()
            gal1.adapter = MyAdapter(files,this)

        }else
            Toast.makeText(this,"path not found ",Toast.LENGTH_LONG).show()


    }
}
