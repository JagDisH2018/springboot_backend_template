package com.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbackend.entity.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
