package com.example.mvvmantonioleivayoutube


import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel():ViewModel(){

    val progressVisibility=MutableLiveData<Boolean>()
    val message=MutableLiveData<String>()

    fun onBottonClick(user:String,pass:String){
        viewModelScope.launch(){
            progressVisibility.value=true
            message.value=withContext(Dispatchers.IO){
                Thread.sleep(2000)
                if(user.isNotEmpty()||pass.isNotEmpty())"Success" else "Failure"
            }
            progressVisibility.value=false

        }
    }


}