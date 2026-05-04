package com.raavalos.spring_security.repository;

import com.raavalos.spring_security.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
    Optional<CustomerEntity> findByEmail(String email);
}
