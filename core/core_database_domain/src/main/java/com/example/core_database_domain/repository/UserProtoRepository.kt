package com.example.core_database_domain.repository

import com.example.core_database_domain.model.HomeUser
import com.example.core_database_domain.model.WorkUser
import kotlinx.coroutines.flow.Flow

interface UserProtoRepository {

    fun getHomeUser(): Flow<HomeUser>

    fun getWorkUser():Flow<WorkUser>

    suspend fun updateHomeUser(homeUser: HomeUser)

    suspend fun updateWorkUser(workUser: WorkUser)
}