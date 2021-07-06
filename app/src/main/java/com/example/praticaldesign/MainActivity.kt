package com.example.praticaldesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.praticaldesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private var aPerson :Person = Person("Ali","123","ali@gmail.com","123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.personData = aPerson

       /* binding.txtName.text= aPerson.name
        binding.txtEmail.text= aPerson.email
        binding.txtIc.text= aPerson.ic
        binding.txtAddress.text= aPerson.address
        */
        binding.btnUpdate.setOnClickListener(){

            aPerson.email = "xyz@gmail.com"
            binding.apply { invalidateAll() }
        }
    }
}