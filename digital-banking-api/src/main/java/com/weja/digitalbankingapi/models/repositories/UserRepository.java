package com.weja.digitalbankingapi.models.repositories;

import org.springframework.data.repository.CrudRepository;
import com.weja.digitalbankingapi.models.client;

import java.util.Optional;

public interface UserRepository extends CrudRepository<client, Integer> {

    Optional<client> findByUserName(String userName);
}
