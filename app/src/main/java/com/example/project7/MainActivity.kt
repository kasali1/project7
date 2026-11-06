package com.example.project7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = listOf(
            DataItem("Android Development", "Building native apps with Kotlin, XML, and Jetpack"),
            DataItem("Custom Styling", "Using downloadable fonts, colors, and sizes in styles.xml"),
            DataItem("Dark Mode Support", "Seamlessly switching themes, colors, and drawable resources"),
            DataItem("RecyclerView Component", "Displaying efficient, scrollable list items in Android"),
            DataItem("View Binding", "Safe and direct layout view interactions"),
            DataItem("Material Design", "Modern UI components, cards, and elevation"),
            DataItem("Google Fonts", "Lobster font integration via Downloadable Fonts API"),
            DataItem("Project Requirements", "Meets all base requirements and stretch features")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ItemAdapter(itemList)
    }
}
