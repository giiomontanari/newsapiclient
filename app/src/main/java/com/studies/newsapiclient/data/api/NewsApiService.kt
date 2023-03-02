package com.studies.newsapiclient.data.api

import com.studies.newsapiclient.data.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsApiService {

    @GET("v2/top-headlines")
    suspend fun getTopHeadLines() : Response<ApiResponse>
}