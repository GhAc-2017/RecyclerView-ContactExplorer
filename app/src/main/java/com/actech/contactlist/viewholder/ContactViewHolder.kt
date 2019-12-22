package com.actech.contactlist.viewholder


import android.view.View
import android.widget.ImageView
import androidx.annotation.NonNull
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.actech.contactlist.R


class ContactViewHolder(itemView: View) : ViewHolder(itemView) {
    internal var m: ImageView
    internal var txt: TextView

    init {
        m = itemView.findViewById(R.id.ImgIcon)
        txt = itemView.findViewById(R.id.txt)
    }
}