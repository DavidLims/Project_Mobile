package com.example.project

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.project.databinding.ActivityDataProfilePerusahaanBinding

class DataProfilePerusahaanActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDataProfilePerusahaanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataProfilePerusahaanBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_data_profile_perusahaan)

        val sessionManagerPer = SessionManagerPer(applicationContext)

        val userIdPer = sessionManagerPer.getUserIdPer()
        val usernamePer = sessionManagerPer.getUserNamePer()
        val emailPer = sessionManagerPer.getUserEmailPer()
        val passwordPer = sessionManagerPer.getUserPasswordPer()

        binding.textViewNamaPerusahaanData.text = usernamePer
        binding.textViewEmailPerusahaanData.text = emailPer
        binding.textViewPassEmailPerusahaanData.text = passwordPer


    }

    fun btnKembaliLihatDataDiriPerusahaan(view: View) {
        val i = Intent(applicationContext, ProfilPerusahaanActivity::class.java)
        startActivity(i)
    }


}