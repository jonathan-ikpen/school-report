package com.example.kotlinprojects

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PortfolioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio)

        val skills = findViewById<Button>(R.id.skills)
        val cv = findViewById<Button>(R.id.cv)
        val projects = findViewById<Button>(R.id.projects)
        val gallery = findViewById<Button>(R.id.gallery)

        skills.setOnClickListener() {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        cv.setOnClickListener() {
            val intent = Intent(this, CvActivity::class.java)
            startActivity(intent)
        }

        projects.setOnClickListener() {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }

        gallery.setOnClickListener() {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}