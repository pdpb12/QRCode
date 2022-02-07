package me.ruyeo.qrcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import net.glxn.qrgen.android.QRCode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        val qr_code_image = findViewById<ImageView>(R.id.qr_code)
        val qr_text = findViewById<TextView>(R.id.qr_text)
        val genereteBtn = findViewById<Button>(R.id.generete_btn)

        genereteBtn.setOnClickListener {

        }
    }
}