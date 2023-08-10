package com.example.profil_latifah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {

    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(SekolahData("TK Ranawa Kartika", "Pilangsari kec.Sayung kab.Demak prov.Jateng"))
        list.add(SekolahData("SDN PILANGSARI", "Pilangsari kec.Sayung kab.Demak prov.Jateng"))
        list.add(SekolahData("SMP N 2 SAYUNG", "Jl.Raya Semarang-Demak KM 14 Onggorawe"))
        list.add(SekolahData("SMK N 1 SAYUNG", "Jl.Raya Semarang-Demak KM 14 Onggorawe"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}