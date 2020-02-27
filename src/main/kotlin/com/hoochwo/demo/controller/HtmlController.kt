package com.hoochwo.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun landing(model: Model): String {
        model["some_stupid_text"] = "Some placeholder text"
        model["title"] = "NanaBanana"
        return "landing"
    }

}
