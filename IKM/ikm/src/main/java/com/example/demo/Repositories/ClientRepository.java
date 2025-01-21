package com.example.demo.Repositories;

import com.example.demo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoApplication.*;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}