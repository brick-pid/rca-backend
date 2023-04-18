package com.example.demo.controller;

import com.example.demo.logger.Logger;
import com.example.demo.model.Application;
import com.example.demo.model.MicroService;
import com.example.demo.service.StaticTopo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaticTopoController {
    @Autowired
    StaticTopo staticTopo;

    // 获取所有应用程序
    @GetMapping("static_topo/application/all")
    public List<Application> getAllApplications() {
        Logger.log("call /static_topo/application/all");
        return staticTopo.getAllApplications();
    }

    // 获取所有微服务
    @GetMapping("static_topo/microservice/all")
    public List<MicroService> getAllServices() {
        Logger.log("call /static_topo/microservice/all");
        return staticTopo.getAllServices();
    }

    // 获取某个应用程序的所有服务(By AppId)
    @GetMapping("static_topo/application/getAllServicesById/{applicationId}")
    public List<MicroService> getAllServicesByApplicationId(@PathVariable("applicationId") Long applicationId) {
        Logger.log("call /static_topo/application/" + applicationId + "/services");
        return staticTopo.getAllServicesByApplication(applicationId);
    }

    // 获取某个应用程序的所有服务(By AppName)
    @GetMapping("static_topo/application/getAllServicesByName/{applicationName}")
    public List<MicroService> getAllServicesByApplicationName(@PathVariable("applicationName") String applicationName) {
        Logger.log("call /static_topo/application/" + applicationName + "/services");
        return staticTopo.getAllServicesByApplicationName(applicationName);
    }
}
