package com.example.ejercicio123.controllers;

import com.example.ejercicio123.entities.Laptop;
import com.example.ejercicio123.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> laptop = laptopRepository.findById(id);
        if (laptop.isPresent()) {
            return ResponseEntity.ok(laptop.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
