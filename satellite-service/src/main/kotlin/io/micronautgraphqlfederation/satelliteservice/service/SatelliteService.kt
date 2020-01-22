package io.micronautgraphqlfederation.satelliteservice.service

import io.micronautgraphqlfederation.satelliteservice.model.Satellite
import io.micronautgraphqlfederation.satelliteservice.repository.SatelliteRepository
import javax.inject.Singleton

@Singleton
class SatelliteService(
    private val repository: SatelliteRepository
) {

    fun getAll(): Iterable<Satellite> = repository.findAll()

    fun getById(id: Long): Satellite = repository.findById(id).orElseThrow { RuntimeException("Can't find Satellite by id=$id") }
}