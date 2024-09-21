package com.example.viewmodel.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val count= MutableLiveData<Int>()

    val counter:LiveData<Int> = count

    init {
        count.value=0
    }


    fun increment(){
        count.value=counter.value?.plus(1)
    }
    fun decrement(){
        count.value=counter.value?.minus(1)
    }
    fun reset(){
        count.value=0
    }
}