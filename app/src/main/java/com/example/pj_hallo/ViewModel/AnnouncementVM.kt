package com.example.pj_hallo.ViewModel

import androidx.lifecycle.ViewModel
import com.example.pj_hallo.Class.Announcement

class AnnouncementVM : ViewModel() {

    val announcement: ArrayList<Announcement>

    init {
        announcement = ArrayList()
    }

    fun dataAnnouncement(guid: String, subject: String, message: String, image:String){
        val item = Announcement(guid, subject, message, image)
        announcement.add(item)
    }
}