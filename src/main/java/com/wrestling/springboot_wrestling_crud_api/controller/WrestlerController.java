package com.wrestling.springboot_wrestling_crud_api.controller;

import com.wrestling.springboot_wrestling_crud_api.entity.Wrestler;
import com.wrestling.springboot_wrestling_crud_api.service.WrestlerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wrestlers")
public class WrestlerController {

    private final WrestlerService service;

    public WrestlerController(WrestlerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Wrestler> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Wrestler getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Wrestler create(@RequestBody Wrestler wrestler) {
        return service.create(wrestler);
    }

    @PutMapping("/{id}")
    public Wrestler update(@PathVariable Long id, @RequestBody Wrestler wrestler) {
        return service.update(id, wrestler);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
