package com.example.retrofitapi.Model.Api

import com.example.retrofitapi.Model.Data.Product
import retrofit2.http.GET

interface ProductApiService {
    interface  ApiService {
        @GET("products")
        suspend fun getProducts(): List<Product>
    }
}

