package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Category>();
        val apps1 = ArrayList<App>();
        val app11 = App( R.drawable.facebook, "Facebook", "5.0");
        val app12 = App( R.drawable.instagram, "Instagram", "5.0");
        val app13 = App(R.drawable.redit, "Reddit", "4.0");
        val app14 = App(R.drawable.x, "X", "4.0");
        apps1.add(app11);
        apps1.add(app12);
        apps1.add(app13);
        apps1.add(app14);
        val category1 = Category("Social Network", apps1);

        val apps2 = ArrayList<App>();
        val app21 = App( R.drawable.clashofclans, "Clash of clans", "5.0");
        val app22 = App( R.drawable.youtube, "Game1", "5.0");
        val app23 = App(R.drawable.redit, "Game2", "4.0");
        val app24 = App(R.drawable.facebook, "Game3", "4.0");

        apps2.add(app21);
        apps2.add(app22);
        apps2.add(app23);
        apps2.add(app24)
        val category2 = Category("Game", apps2);

        val apps3 = ArrayList<App>();
        val app31 = App( R.drawable.facebook, "Camera 1", "5.0");
        val app32 = App( R.drawable.facebook, "Camera 2", "5.0");
        val app33 = App(R.drawable.facebook, "Camera 3", "4.0");
        val app34 = App(R.drawable.facebook, "Camera 4", "4.0");
        apps3.add(app31);
        apps3.add(app32);
        apps3.add(app33);
        apps3.add(app34);
        val category3 = Category("Tools", apps3);

        data.add(category1);
        data.add(category2);
        data.add(category3);


        val categoryAdapter  = CategoryAdapter( data, this);
        val rvApp = findViewById<RecyclerView>(R.id.categories)
        val layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false)
        rvApp.layoutManager = layoutManager
        rvApp.adapter = categoryAdapter


    }



}