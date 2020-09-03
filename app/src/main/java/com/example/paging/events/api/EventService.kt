package com.example.paging.events.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface EventService {
    @GET("v1/events/?language_filter=en")
    suspend fun searchRepos(
        @Query("tags_search") query: String,
        @Query("start") start: Int,
        @Query("limit") itemsPerPage: Int
    ): RepoSearchResponse

    companion object {
        private const val BASE_URL = "http://open-api.myhelsinki.fi/"

        fun create(): EventService {
            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.BASIC

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(EventService::class.java)
        }
    }
}