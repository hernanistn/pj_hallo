package com.example.pj_hallo.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.example.pj_hallo.R
import com.example.pj_hallo.ViewModel.ClientVM


class LoginActivity : AppCompatActivity() {

    private lateinit var login: EditText
    private lateinit var passwordLogin: EditText
    private lateinit var loginButton: Button
    private lateinit var txtError: TextView
    var clientVM : ClientVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFindViews()
        clientVM = ViewModelProviders.of(this).get(ClientVM::class.java)
        clientVM!!.dataCliente("hallo", "123")

        loginButton.setOnClickListener {
            if (verifyLogin(login.text.toString(), passwordLogin.text.toString()) == true){
                startActivity(Intent(this, AnnouncementListActivity::class.java))
            }else{
                txtError.visibility = View.VISIBLE
            }
        }
    }

    fun initFindViews(){
        login = findViewById(R.id.edt_Login)
        passwordLogin = findViewById(R.id.edt_PasswordLogin)
        loginButton = findViewById(R.id.btn_Login)
        txtError = findViewById(R.id.txt_ErrorText)
    }

    fun verifyLogin(login: String, password:String) : Boolean{
        if(login.equals(clientVM?.cliente?.login) && password.equals(clientVM?.cliente?.password)){
            return true
        }
        return false
    }
}
