package com.example.mvvmantonioleivayoutube


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.*
import com.example.mvvmantonioleivayoutube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private lateinit var viewModel:MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.resultadoOpAsync

        viewModel=ViewModelProvider(this).get()

        binding.viewModel=viewModel
        binding.lifecycleOwner=this

        //This code is using view Binding that is commented with using databinding
//        viewModel.progressVisibility.observe(this, Observer {visible->
//            binding.progressBar?.visibility=if(visible) View.VISIBLE else View.GONE
//
//        })
//        viewModel.message.observe(this, Observer { message->
//            binding.resultadoOpAsync.text=message
//        })
//        with(binding){
//            validar.setOnClickListener(){
//                viewModel.onBottonClick(username.text.toString(),password.text.toString())
//            }
//        }

    }

}