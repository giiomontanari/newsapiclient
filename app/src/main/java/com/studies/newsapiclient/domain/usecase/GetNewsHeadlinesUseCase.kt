package com.studies.newsapiclient.domain.usecase

import com.studies.newsapiclient.data.model.ApiResponse
import com.studies.newsapiclient.data.util.Resource
import com.studies.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute() : Resource<ApiResponse> {
        return newsRepository.getNewsHeadLines()
    }
}