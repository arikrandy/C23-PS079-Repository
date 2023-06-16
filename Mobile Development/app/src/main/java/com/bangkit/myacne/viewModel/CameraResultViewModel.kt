package com.bangkit.myacne.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.myacne.data.model.PredictionResponse
import com.bangkit.myacne.data.services.ApiConfig.getApiService
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class CameraResultViewModel: ViewModel() {
    fun sendPhoto(photo: File): LiveData<PredictionResponse.Data> {
        val mutableLiveData = MutableLiveData<PredictionResponse.Data>()

        val imageMultiPart: MultipartBody.Part = MultipartBody.Part.createFormData(
            "file",
            photo.name,
            photo.asRequestBody("image/jpeg".toMediaTypeOrNull())
        )

        getApiService().sendPhoto(imageMultiPart).enqueue(object: Callback<PredictionResponse> {
            override fun onResponse(
                call: Call<PredictionResponse>,
                response: Response<PredictionResponse>
            ) {
                if (response.isSuccessful) {
                    mutableLiveData.value = response.body()?.data
                }
            }

            override fun onFailure(call: Call<PredictionResponse>, t: Throwable) {
                Log.d("Failure", t.message.toString())
            }

        })
        return mutableLiveData
    }
}