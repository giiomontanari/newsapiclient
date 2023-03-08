package com.studies.newsapiclient.presentation.di

import com.studies.newsapiclient.data.repository.NewsRepositoryImpl
import com.studies.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.studies.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource) : NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}