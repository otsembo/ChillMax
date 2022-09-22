package com.example.chillmax.data.paging_source.remote_mediators

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.chillmax.data.local.ChillMaxDatabase
import com.example.chillmax.data.remote.ChillMaxApi
import com.example.chillmax.domain.models.Genres
import javax.inject.Inject

@ExperimentalPagingApi
class GenresMediator @Inject constructor(
    private val chillMaxApi: ChillMaxApi,
    private val chillMaxDatabase: ChillMaxDatabase
): RemoteMediator<Int, Genres>() {

    override suspend fun initialize(): InitializeAction {
        return super.initialize()
    }

    override suspend fun load(loadType: LoadType, state: PagingState<Int, Genres>): MediatorResult {
        TODO()
    }

}