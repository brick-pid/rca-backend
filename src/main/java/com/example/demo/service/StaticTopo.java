package com.example.demo.service;

import com.example.demo.model.Application;
import com.example.demo.model.MicroService;
import com.example.demo.repository.ApplicationRepository;
import com.example.demo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaticTopo {
    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private ServiceRepository serviceRepository;

    // 获取所有应用程序
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // 获取所有服务
    public List<MicroService> getAllServices() {
        return serviceRepository.findAll();
    }

    // 获取应用程序的所有服务
    public List<MicroService> getAllServicesByApplication(Long applicationId) {
        return applicationRepository.findAllByApplicationId(applicationId);
    }
    public List<MicroService> getAllServicesByApplicationName(String applicationName) {
        return applicationRepository.findAllByApplicationName(applicationName);
    }
}
