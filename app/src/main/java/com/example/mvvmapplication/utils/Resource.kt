package com.example.mvvmapplication.utils
import androidx.lifecycle.LiveData
import com.example.mvvmapplication.data.model.User
import com.example.mvvmapplication.utils.Status.*

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): Resource<T> = Resource(status = SUCCESS, data = data, message = null)

        fun <T> error(data: T?, message: String): LiveData<Resource<List<User>>> =
            Resource(status = ERROR, data = data, message = message)

        fun <T> loading(data: T?): Resource<T> = Resource(status = LOADING, data = data, message = null)
    }
}
