package com.example.lokal_mihirbajpai.data.api

import com.example.lokal_mihirbajpai.data.model.JobResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface JobApiService {
    @GET("common/jobs")
    suspend fun getJobs(@Query("page") page: Int): JobResponse
}