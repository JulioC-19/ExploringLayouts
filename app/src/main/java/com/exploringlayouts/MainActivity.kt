package com.exploringlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is setting up the UI for app from main_menu
        setContentView(R.layout.main_menu)
    }

    // This function will load the UI from activity_main, a constraint layout
    fun loadConstrainLayout(v: View){
        setContentView(R.layout.activity_main)
    }

    // This function will load the UI from  my_table_layout, a table layout
    fun loadTableLayout(v: View){
        // TODO: create table layout
        // setContentView(R.layout.my_table_layout)
    }
}