package com.example.pj_hallo.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.pj_hallo.R
import com.example.pj_hallo.ViewModel.AnnouncementVM as AnnouncementVM

class ListActivity : AppCompatActivity() {
    private var announcementVM: AnnouncementVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        announcementVM = ViewModelProviders.of(this).get(announcementVM!!::class.java)
        announcementVM!!.dataAnnouncement(
            "Changed data",
            "alert mistake",
            "mistake has been detected",
            "")

    }
}
