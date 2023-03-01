package com.studies.newsapiclient.domain.usecase

import com.studies.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}