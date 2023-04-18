package com.example.demo.repository;

import com.example.demo.model.Invocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvocationRepository extends JpaRepository<Invocation, Long> {
}
