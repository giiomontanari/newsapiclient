package com.studies.newsapiclient.data.repository.dataSource

import com.studies.newsapiclient.data.model.ApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadLines() : Response<ApiResponse>
}