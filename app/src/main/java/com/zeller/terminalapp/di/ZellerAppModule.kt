package com.zeller.terminalapp.di

import com.zeller.terminalapp.repository.ZellerRepository
import com.zeller.terminalapp.repository.ZelllerRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ZellerAppModule {

    @Provides
    @Singleton
    fun provideZellerRepository(): ZellerRepository{
        return ZelllerRepositoryImpl()
    }
}