package com.springmysqlconnection.springbootmysql.repository;

import com.springmysqlconnection.springbootmysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}