package com.codingdojo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
    // 1. Annotation
    @RequestMapping("")
    // 3. Method that maps to the request route above
    public String index() { // 3
            return "<h1>Hello World</h1>";
    }
    @RequestMapping("/wyatt")
    public String wyatt() {
    	return "<h1>Hello Wyatt</h1>";
    }
}
