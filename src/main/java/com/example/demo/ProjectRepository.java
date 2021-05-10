package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Product, Long> {
    
}
