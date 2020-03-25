package com.learningspring.springsecurityjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HomeResource {

    @Autowired
    DataSource dataSource;

    @GetMapping("/")
    public String home()
    {
        return ("Welcome");
    }

    @GetMapping("/user")
    public String user()
    {
        return("Welcome User");
    }

    @GetMapping("/admin")
    public String admin()
    {
        return("Welcome Admin");
    }
}
