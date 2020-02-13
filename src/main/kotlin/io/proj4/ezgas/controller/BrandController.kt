package io.proj4.ezgas.controller

import io.proj4.ezgas.model.Brand
import io.proj4.ezgas.repository.BrandRepository
import io.proj4.ezgas.repository.mappers.toDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/brands")
class BrandController(private val repository: BrandRepository) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll() = repository.findAll().map(Brand::toDto)
}