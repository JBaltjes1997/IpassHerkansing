package com.example.demo.data;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByFirstNameAndId(String firstName, int id);
}