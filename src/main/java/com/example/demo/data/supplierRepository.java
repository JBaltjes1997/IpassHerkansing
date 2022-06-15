package com.example.demo.data;

import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface supplierRepository extends JpaRepository<Supplier, Integer> {
    Optional<Supplier> findUserByFirstNameAndId(String firstName, int id);
}
