package com.studies.newsapiclient.domain.usecase

import com.studies.newsapiclient.data.model.Article
import com.studies.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute() : Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}