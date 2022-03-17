package com.webapp

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

// This is the controller class, it calls the different pages and changes the titles of each page

@Controller
class Controller {

    //home page with duck
    @GetMapping("/")
    fun duck(model: Model): String {
        model["title"] = "Duck"
        return "page"
    }

    // page of the dude
    @GetMapping("/dude")
    fun dude(model: Model): String {
        model["title"] = "Dude"
        return "dude"
    }

    // page with the slug
    @GetMapping("/slug")
    fun slug(model: Model): String {
        model["title"] = "Slug"
        return "slug"
    }

}