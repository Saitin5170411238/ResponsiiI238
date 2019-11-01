package com.saitin.responsi238

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register2.*

class ActivityRegister2 : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPass: EditText
    private lateinit var btnRegis: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        edtUsername = findViewById(R.id.edt_username)
        edtPass = findViewById(R.id.edt_pass)
        btnRegis = findViewById(R.id.btn_regis)

        btn_regis.setOnClickListener{
            intent = Intent(this, ActivityAccount::class.java)
            intent.putExtra("Username", edtUsername.text)
            intent.putExtra("Password",edtPass.text)
            startActivity(intent)
        }
    }
}
