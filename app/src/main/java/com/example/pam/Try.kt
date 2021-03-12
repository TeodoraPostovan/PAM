package com.example.pam

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

class Try : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        findViewById<View>(R.id.imageMenu).setOnClickListener {
            drawerLayout.openDrawer(
                GravityCompat.START
            )
        }
        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        navigationView.itemIconTintList = null
        val navController = Navigation.findNavController(this, R.id.NavHostFragment)
        NavigationUI.setupWithNavController(navigationView, navController)
        val textTitle = findViewById<TextView>(R.id.textTitle)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            textTitle.text = destination.label
        }
    }
}