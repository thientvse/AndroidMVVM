package com.example.mvvmapplication.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvmapplication.data.repository.MainRepository
import com.example.mvvmapplication.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import okhttp3.Dispatcher
import java.lang.Exception

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}