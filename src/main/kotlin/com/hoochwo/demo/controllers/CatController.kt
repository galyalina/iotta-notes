package com.hoochwo.demo.controllers

import com.hoochwo.demo.dtos.CatBreed
import com.hoochwo.demo.dtos.CatDto
import org.springframework.web.bind.annotation.*
import java.time.Clock
import java.time.LocalDate
import java.util.concurrent.atomic.AtomicLong

@RestController
class CatController {

    val counter = AtomicLong()

    @GetMapping("/cats")
    fun cats(@RequestParam(value = "name", defaultValue = "Unknown") name: String) =
            CatDto(counter.incrementAndGet(), "$name", LocalDate.now(Clock.systemDefaultZone()), CatBreed.BengalCat)

    @PatchMapping("/cat")
    fun cats(@RequestBody cat: CatDto) =
            CatDto(counter.incrementAndGet(), "${cat.name}", LocalDate.now(Clock.systemDefaultZone()), CatBreed.BengalCat)

    @GetMapping("/cat")
    fun cat(@RequestParam(value = "name") name: String) =
            CatDto(counter.incrementAndGet(), "$name", LocalDate.now(Clock.systemDefaultZone()), CatBreed.BengalCat)
}
