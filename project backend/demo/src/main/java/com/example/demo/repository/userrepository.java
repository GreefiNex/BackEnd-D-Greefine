package com.example.demo.repository;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userrepository extends JpaRepository<user, Long> {
    Optional<user> findByUsername(String username);
}