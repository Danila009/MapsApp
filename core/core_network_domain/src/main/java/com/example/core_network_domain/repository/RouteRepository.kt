package com.example.core_network_domain.repository

import com.example.core_network_domain.entities.route.Route

interface RouteRepository {

    suspend fun getRoute(profile:String, start:String, end:String):Route?
}