package com.example.retrofitapi.Model.Repository

import com.example.retrofitapi.Model.Api.ProductApiService
import com.example.retrofitapi.Model.Data.Product

class ProductRepository(private val apiService: ProductApiService.ApiService) {
    suspend fun getProducts(): List<Product> {
        return  apiService.getProducts()
    }
}