package com.bangkit.myacne.data.model

import com.google.gson.annotations.SerializedName

data class PredictionResponse(

	@field:SerializedName("isError")
	val isError: Boolean,

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("statusCode")
	val statusCode: Int
){
	data class Data(

		@field:SerializedName("confidence")
		val confidence: String,

		@field:SerializedName("prediction")
		val prediction: String
	)
}
