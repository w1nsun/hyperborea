package com.w1n.hyperborea.warehouse.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
