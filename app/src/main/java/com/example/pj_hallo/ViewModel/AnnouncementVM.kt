package com.example.pj_hallo.ViewModel

import androidx.lifecycle.ViewModel
import com.example.pj_hallo.Class.Announcement

class AnnouncementVM : ViewModel() {
        val announcement: Announcement

        init {
            announcement = Announcement()
        }

    fun dataAnnouncement(guild: String, subject: String, message: String, image:String){
        announcement.guild = guild
        announcement.subject = subject
        announcement.message = message
        announcement.image = image
    }
}