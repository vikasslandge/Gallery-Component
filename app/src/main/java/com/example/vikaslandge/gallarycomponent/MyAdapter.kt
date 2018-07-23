package com.example.vikaslandge.gallarycomponent

import android.app.ProgressDialog.show
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.indview.view.*
import java.io.File
import java.nio.file.Files
import android.widget.Toast

class MyAdapter : BaseAdapter{

        var files :Array<File>? = null
        var activity : MainActivity? = null
        constructor(activity: MainActivity){


                this.activity = activity

                var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Video/"
                var file = File(path)
                if (!file.exists()){
                     path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Video"
                        file = File(path)
                }
                //if (file.exists()){
                files = file.listFiles()

                //}else{
                        //Toast.makeText(this,"Path does`nt exists",Toast.LENGTH_LONG).show()
                //}

        }



        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

                val inflater = LayoutInflater.from(activity)
                var v = inflater.inflate(R.layout.indview,null)

                v.vview.setVideoURI(Uri.fromFile(files!![position]))
                return v
         }

        override fun getCount(): Int {
                return files!!.size
         }

        override fun getItem(position: Int): Any {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(position: Int): Long {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
}