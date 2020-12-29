package com.thirkazh.kamuskata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KamusAdapter(private val list: List<KamusModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ItemVH(LayoutInflater.from(p0.context).inflate(R.layout.adapter_kamus, p0, false))
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val itemVH = p0 as KamusAdapter.ItemVH
        itemVH.mNama.text = list.get(p1).nama
        itemVH.mJenis.text = list.get(p1).jenis
        itemVH.mArti.text = list.get(p1).arti
    }

    override fun getItemCount(): Int {
        return list.size
    }

    // Untuk View Holder
    inner class ItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mNama:TextView = itemView.findViewById<View>(R.id.txtNama) as TextView
        var mJenis:TextView = itemView.findViewById<View>(R.id.txtJenis) as TextView
        var mArti:TextView = itemView.findViewById<View>(R.id.txtArti) as TextView
    }
}