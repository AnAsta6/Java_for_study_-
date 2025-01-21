package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    static Object save(org.springframework.stereotype.Service service) {
        return null;
    }
}