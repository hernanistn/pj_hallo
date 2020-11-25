package com.example.pj_hallo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pj_hallo.Class.Announcement
import com.example.pj_hallo.R

class AnnouncementAdapter (val announcements: ArrayList<Announcement>) : RecyclerView.Adapter<AnnouncementAdapter.ViewHolder>(){

    inner class ViewHolder constructor(val view: View) : RecyclerView.ViewHolder(view) {
        val txt_guid = view.findViewById<TextView>(R.id.txt_Guid_Announcement)
        val txt_subject = view.findViewById<TextView>(R.id.txt_Subject_Announcement)
        val txt_message = view.findViewById<TextView>(R.id.txt_Message_Announcement)
        val imageview = view.findViewById<ImageView>(R.id.iv_Announcement)
    }

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
val itemAnnouncement = LayoutInflater.from(parent.context).inflate(R.layout.item_list_announcement, parent, false)
    return ViewHolder(itemAnnouncement)
}

    override fun getItemCount(): Int {
        return announcements.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview.setImageResource(holder.view.context.resources.getIdentifier(announcements.get(position).image, "drawable", holder.view.context.packageName))
        holder.txt_guid.setText(announcements.get(position).guid)
        holder.txt_subject.setText(announcements.get(position).subject)
        holder.txt_message.setText(announcements.get(position).message)

    }


}
