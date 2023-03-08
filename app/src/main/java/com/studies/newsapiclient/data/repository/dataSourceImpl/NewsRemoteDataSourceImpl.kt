package com.studies.newsapiclient.data.repository.dataSourceImpl

import com.studies.newsapiclient.data.api.NewsApiService
import com.studies.newsapiclient.data.model.ApiResponse
import com.studies.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService
) : NewsRemoteDataSource {

    override suspend fun getTopHeadLines(country: String, page: Int): Response<ApiResponse> {
        return newsApiService.getTopHeadLines(country, page)
    }
}