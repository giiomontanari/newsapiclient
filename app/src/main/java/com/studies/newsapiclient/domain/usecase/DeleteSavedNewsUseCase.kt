package com.studies.newsapiclient.domain.usecase

import com.studies.newsapiclient.data.model.Article
import com.studies.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}