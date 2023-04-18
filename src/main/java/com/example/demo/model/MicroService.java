package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "microservice")
public class MicroService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service_name;
    private String description;
    private Long application_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Long application_id) {
        this.application_id = application_id;
    }

    @Override
    public String toString() {
        return "MicroService{" +
                "id=" + id +
                ", service_name='" + service_name + '\'' +
                ", description='" + description + '\'' +
                ", application_id=" + application_id +
                '}';
    }
}
