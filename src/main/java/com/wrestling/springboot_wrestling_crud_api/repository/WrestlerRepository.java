package com.wrestling.springboot_wrestling_crud_api.repository;


import com.wrestling.springboot_wrestling_crud_api.entity.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WrestlerRepository extends JpaRepository<Wrestler, Long> {
}