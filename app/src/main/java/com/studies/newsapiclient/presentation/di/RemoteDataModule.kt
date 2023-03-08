package com.studies.newsapiclient.presentation.di

import com.studies.newsapiclient.data.api.NewsApiService
import com.studies.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.studies.newsapiclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsApiService: NewsApiService) : NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsApiService)
    }
}