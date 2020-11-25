package com.example.pj_hallo.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pj_hallo.Adapter.AnnouncementAdapter
import com.example.pj_hallo.R
import com.example.pj_hallo.ViewModel.AnnouncementVM as AnnouncementVM

class AnnouncementListActivity : AppCompatActivity() {
    private var announcementVM: AnnouncementVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val recyclerView = findViewById<RecyclerView>(R.id.rv_Announcement)

        announcementVM = ViewModelProviders.of(this).get(AnnouncementVM::class.java)
        announcementVM!!.dataAnnouncement(
            "Changed data",
            "alert mistake",
            "mistake has been detected",
            "download")

        announcementVM!!.dataAnnouncement(
            "Changed",
            "alert ",
            "Alert data change",
            "blumenau")

        announcementVM!!.dataAnnouncement(
            "Sucessful",
            "alert sucessful",
            "sucessful data update",
            "hallo")

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AnnouncementAdapter(announcementVM!!.announcement)
    }


}
