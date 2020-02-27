package com.hoochwo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun landing(model: Model): String {
        model["some_stupid_text"] = "Switch is the best cat in the world"
        model["title"] = "Lazy cat page"
        return "landing"
    }

}
