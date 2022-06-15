package com.example.demo.application;

import com.example.demo.data.supplierRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class supplierService {
    private final supplierRepository supplierRepo;

    public supplierService(supplierRepository supplierRepo) {
        this.supplierRepo = supplierRepo;
    }
}
