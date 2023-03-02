package com.studies.newsapiclient.domain.usecase

import com.studies.newsapiclient.data.model.ApiResponse
import com.studies.newsapiclient.data.util.Resource
import com.studies.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String) : Resource<ApiResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}