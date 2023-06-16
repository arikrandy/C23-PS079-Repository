package com.bangkit.myacne.data.services

import com.bangkit.myacne.data.model.PredictionResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {

    @Multipart
    @POST("submit")
    fun sendPhoto(
        @Part file: MultipartBody.Part
    ): Call<PredictionResponse>
}