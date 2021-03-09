package com.funloft.navigationpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    var navController:NavController?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val findNavController = findNavController(R.id.nav_host_fragment)
//        setupActionBarWithNavController(findNavController)
//        val navController = findNavController(R.id.nav_host_fragment)
//        val appBarConfiguration = AppBarConfiguration(navController.graph)
//        findViewById<Toolbar>(R.id.toolbar)
//            .setupWithNavController(navController, appBarConfiguration)

//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navHostFragment =
          supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

         navController = navHostFragment.navController
        var appBarConfiguration = AppBarConfiguration(navController!!.graph)

        setupActionBarWithNavController(navController!!, appBarConfiguration)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e(MainActivity::class.simpleName, "onBackPressed: ")
    }

    override fun onSupportNavigateUp(): Boolean {
        Log.e(MainActivity::class.simpleName, "onSupportNavigateUp: ")
        return navController?.navigateUp() ?: false
    }

}