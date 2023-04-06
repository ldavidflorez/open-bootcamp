package com.example.ejercicio123.controllers;

import com.example.ejercicio123.entities.Laptop;
import com.example.ejercicio123.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

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

    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop) {
        if (laptop.getId() == null) {
            return ResponseEntity.badRequest().build();
        }

        if (!laptopRepository.existsById(laptop.getId())) {
            return ResponseEntity.notFound().build();
        }

        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> deleteOneById(@PathVariable Long id) {
        if (!laptopRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @ApiIgnore
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll() {
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
