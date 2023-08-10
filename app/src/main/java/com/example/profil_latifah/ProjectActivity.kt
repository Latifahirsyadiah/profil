package com.example.profil_latifah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class
ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProjetc)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(
            ProjectData("Pendaftaran Siswa",
        "Aplikasi Pendaftaran Siswa", "https://github.com/Latifahirsyadiah/pendaftaran_siswaa")
        )

        list.add(
            ProjectData("Hotel", "Aplikasi Ujian D",
            "https://github.com/Latifahirsyadiah/UjianD-Latifah")
        )

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter
    }
}