package com.example.demo.data;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userInterface extends JpaRepository<User, Integer> {
    Optional<User> findUserByFirstNameAndId(String firstName, int id);
}