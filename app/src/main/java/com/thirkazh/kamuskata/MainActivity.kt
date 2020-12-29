package com.thirkazh.kamuskata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var daftarKata: MutableList<KamusModel>
    private lateinit var adapter: KamusAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        //pengaturan layout
        rv_kamus.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL,false)

        //set data
        adapter = KamusAdapter(daftarKata)

        //set adapter
        rv_kamus.adapter = adapter
    }

    private fun initData() {
        daftarKata = mutableListOf()

        daftarKata.add(KamusModel("Ayam", "Kata Benda", " Unggas yang pada umumnya tidak dapat terbang, dapat dijinakkan dan dipelihara, berjengger, yang jantan berkokok dan bertaji, sedangkan yang betina berkotek"))
        daftarKata.add(KamusModel("Bubur", "Kata Benda", "Makanan lembek dan berair"))
        daftarKata.add(KamusModel("Terbang", "Kata Kerja", "Bergerak atau melayang di udara dengan tenaga sayap"))
        daftarKata.add(KamusModel("Surat", "Kata Benda", "kertas dan sebagainya yang bertulis "))
    }
}
