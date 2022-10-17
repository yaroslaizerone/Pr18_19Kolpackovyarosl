package com.example.sprawochnikpython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Korteji : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korteji)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_spr -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)}
                R.id.plagins -> {
                    val intent = Intent(this, Plagins::class.java)
                    startActivity(intent)}
                R.id.literature -> {
                    val intent = Intent(this, Literatyra::class.java)
                    startActivity(intent)}
                R.id.chicli -> {
                    val intent = Intent(this, Cikli::class.java)
                    startActivity(intent)}
                R.id.tipis -> {
                    val intent = Intent(this, Tips::class.java)
                    startActivity(intent)}
                R.id.korteji -> {
                    val intent = Intent(this, Korteji::class.java)
                    startActivity(intent)}
                R.id.mass -> {
                    val intent = Intent(this, Massivi::class.java)
                    startActivity(intent)}
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}