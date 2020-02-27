package com.hoochwo.demo.dtos

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDate

@JsonIgnoreProperties(value = ["id"], ignoreUnknown = true)
data class CatDto(val id: Long, val name: String, val birth: LocalDate, val breed: CatBreed)
