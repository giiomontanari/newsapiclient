package com.studies.newsapiclient.domain.repository

import androidx.lifecycle.LiveData
import com.studies.newsapiclient.data.model.ApiResponse
import com.studies.newsapiclient.data.model.Article
import com.studies.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadLines(country: String, page: Int) : Resource<ApiResponse>
    suspend fun getSearchedNews(searchQuery: String) : Resource<ApiResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews() : Flow<List<Article>>

}