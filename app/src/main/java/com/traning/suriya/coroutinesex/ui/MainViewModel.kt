package com.traning.suriya.coroutinesex.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.traning.suriya.coroutinesex.model.Post
import com.traning.suriya.coroutinesex.repository.MainRepositoryImp
import kotlinx.coroutines.*
import retrofit2.HttpException

class MainViewModel : ViewModel() {

    private lateinit var job: Job
    private val mainRepository = MainRepositoryImp()
    private val _postLiveData = MutableLiveData<List<Post>>()
    val postLiveData: LiveData<List<Post>>
        get() = _postLiveData

    fun getPost() {
        job = CoroutineScope(Dispatchers.IO).launch {
            val result = mainRepository.getPost()
            withContext(Dispatchers.Main) {
                try {
                    if (result.isSuccessful) {
                        _postLiveData.postValue(result.body())
                    }
                } catch (e: HttpException) {

                } catch (e: Exception) {

                }
            }
        }
    }

    override fun onCleared() {
        job.cancel()
        super.onCleared()
    }
}