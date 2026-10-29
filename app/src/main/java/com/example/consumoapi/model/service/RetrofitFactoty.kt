package com.example.consumoapi.model.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactoty {

    private val BASE_URL = "https://viacep.com.br/ws/"

    private val retrofitFactoty = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getEnderecoService(): EnderecoService {
        return retrofitFactoty.create(EnderecoService::class.java)
    }
}