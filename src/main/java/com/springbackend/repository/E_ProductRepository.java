package com.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbackend.entity.E_Product;

@Repository
public interface E_ProductRepository extends JpaRepository<E_Product, Integer> {

}
