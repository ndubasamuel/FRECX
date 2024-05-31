package com.example.frecx.DI.Module

import android.app.Application
import android.content.Context
import com.example.frecx.auth.network.MyApi
import com.example.frecx.auth.network.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


//@Module
//@InstallIn(SingletonComponent::class)
//class AppModule {
//    @Singleton
//    @Provides
//    fun provideContext(application: Application): Context {
//        return application
//    }
//
//    @Provides
//    fun provideAuthApi(@ApplicationContext context: Context,
//                       remoteDataSource: RemoteDataSource): MyApi {
//
//        return remoteDataSource.buildApi(MyApi::class.java, context)
//
//    }
//
//
//}