package com.example.demo.data;

import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface supplierRepository extends JpaRepository<Supplier, Integer> {
    Optional<Supplier> findUserByFirstNameAndId(String firstName, int id);
}
