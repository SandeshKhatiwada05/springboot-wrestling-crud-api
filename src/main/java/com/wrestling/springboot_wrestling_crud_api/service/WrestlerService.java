package com.wrestling.springboot_wrestling_crud_api.service;

import com.wrestling.springboot_wrestling_crud_api.entity.Wrestler;
import com.wrestling.springboot_wrestling_crud_api.repository.WrestlerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrestlerService {

    private final WrestlerRepository repository;

    public WrestlerService(WrestlerRepository repository) {
        this.repository = repository;
    }

    public List<Wrestler> getAll() {
        return repository.findAll();
    }

    public Wrestler getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Wrestler create(Wrestler wrestler) {
        return repository.save(wrestler);
    }

    public Wrestler update(Long id, Wrestler wrestler) {
        Wrestler existing = repository.findById(id).orElseThrow();

        existing.setName(wrestler.getName());
        existing.setRingName(wrestler.getRingName());
        existing.setFinisher(wrestler.getFinisher());
        existing.setChampionships(wrestler.getChampionships());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
