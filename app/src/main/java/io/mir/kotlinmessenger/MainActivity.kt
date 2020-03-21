package io.mir.kotlinmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register_button_register.setOnClickListener {
            val email = email_editetext_register.text.toString()
            val password = password_edittext_register.text.toString()
            val userName = username_edittext_register.text.toString()
            //We will add firebase authontication with email and password
            Log.d("MainActivity","Email is" + email)
            Log.d("MainActivity","Password is  $password")
        }
        already_have_account_textView.setOnClickListener {
            Log.d("MainActivity","Try to show login Activity")
            //trying to launch to login activity somehow
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
