package com.weja.digitalbankingapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home()
    {
        return("Welcome");
    }

    @GetMapping("/client")
    public String client()
    {
        return("Welcome client");
    }

    @GetMapping("/employee")
    public String employee()
    {
        return("Welcome employee");
    }
}
