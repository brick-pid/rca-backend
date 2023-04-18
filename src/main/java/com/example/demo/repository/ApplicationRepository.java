package com.example.demo.repository;

import com.example.demo.model.Application;
import com.example.demo.model.MicroService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // find all service of an application by application id
    @Query(value = "select s from MicroService s where s.application_id = ?1")
    List<MicroService> findAllByApplicationId(Long applicationId);

    // find all service of an application by application name
    @Query(value = "select s from MicroService s left join Application a on s.application_id = a.id where a.app_name = ?1")
    List<MicroService> findAllByApplicationName(String applicationName);
}

