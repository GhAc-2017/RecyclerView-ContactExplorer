package com.actech.contactlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.actech.contactlist.R
import com.actech.contactlist.viewholder.ContactViewHolder


class ContactsAdapter(data: ArrayList<String>?): RecyclerView.Adapter<ContactViewHolder>() {
    private val data: ArrayList<String>? = data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflator: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.list_item_layout, parent, false)

        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val title: String = data!!.get(position)
        holder.txt.text = title
    }

}