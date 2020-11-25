package com.example.pj_hallo.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
        findViews()
        clientVM = ViewModelProviders.of(this).get(clientVM!!::class.java)  //da pau aqui porque ele ta recebendo null exception 
        clientVM!!.dataCliente("h", "1")


        loginButton.setOnClickListener {
            if (verifyLogin(login.text.toString(), passwordLogin.text.toString()) == true){
                txtError.visibility = View.GONE
            }else{
                txtError.visibility = View.VISIBLE
                Toast.makeText(applicationContext, clientVM?.cliente?.login, Toast.LENGTH_LONG).show()
            }
        }

    }


    fun findViews(){
        login = findViewById(R.id.edt_Login)
        passwordLogin = findViewById(R.id.edt_PasswordLogin)
        loginButton = findViewById(R.id.btn_Login)
        txtError = findViewById(R.id.txt_ErrorText)
    }

    fun verifyLogin(login: String, password:String) : Boolean{
        if(login.equals(clientVM?.cliente?.login) && password.equals(clientVM?.cliente?.password)){
            var algo = clientVM?.cliente?.login.toString()
            return true
        }

        var algo = login.equals(clientVM?.cliente?.login.toString())

        return false
    }

    override fun onStart() {
        super.onStart()

    }

}
