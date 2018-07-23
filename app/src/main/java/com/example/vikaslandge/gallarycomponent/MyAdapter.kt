package com.example.vikaslandge.gallarycomponent

import android.app.ActionBar
import android.app.ProgressDialog.show
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.MediaController
import kotlinx.android.synthetic.main.indview.view.*
import java.io.File
import java.nio.file.Files
import android.widget.Toast
import android.media.MediaMetadataRetriever
import android.graphics.Bitmap



class MyAdapter : BaseAdapter{

        var files :Array<File>? = null
        var activity : MainActivity? = null
        constructor(files:Array<File>?,activity: MainActivity){

                this.activity = activity
                this.files = files


        }



        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

                val inflater = LayoutInflater.from(activity)
                var v = inflater.inflate(R.layout.indview,null)

                v.vview.setVideoURI(Uri.fromFile(files!![position]))
                v.cb1.text = files!![position].name

                val mc =MediaController(activity)
                mc.setMediaPlayer(v.vview)
                v.vview.setMediaController(mc)

                return v
         }


        override fun getCount(): Int {
                return files!!.size
         }

        override fun getItem(position: Int): Any {
                return 0
         }

        override fun getItemId(position: Int): Long {
                return 0
         }
}