package com.springmysqlconnection.springbootmysql.resource;

import java.util.List;

import com.springmysqlconnection.springbootmysql.model.Users;
import com.springmysqlconnection.springbootmysql.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResource
{
    @Autowired
    UsersRepository usersRepository; 

    @GetMapping("/")
    public List<Users> getAll()
    {
        return usersRepository.findAll();
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

    @PostMapping(value="/load")
    public List<Users> persist(@RequestBody final Users users)
    {
        usersRepository.save(users);
        return usersRepository.findAll();
    }

}