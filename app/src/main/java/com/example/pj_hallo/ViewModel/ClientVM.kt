package com.example.pj_hallo.ViewModel

import androidx.lifecycle.ViewModel
import com.example.pj_hallo.Class.Client

class ClientVM : ViewModel(){
    val cliente: Client

    init {
        cliente = Client()
    }

    fun dataCliente(login:String, password:String){
        cliente.login = login
        cliente.password = password
    }
}