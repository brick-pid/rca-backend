package com.example.demo.controller;

import com.example.demo.POJO.InvocationPair;
import com.example.demo.logger.Logger;
import com.example.demo.model.Invocation;
import com.example.demo.repository.InvocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InvocationController {
    @Autowired
    private InvocationRepository invocationRepository;

    @GetMapping("/invocation/edges")
    List<InvocationPair> getAllPair() {
        List<InvocationPair> list = new ArrayList<>();
        Long count = invocationRepository.count();
        Logger.log("call /invocation/edges, count: " + count);

        for(Invocation invo: invocationRepository.findAll()) {
            InvocationPair temp = new InvocationPair(invo.getSource(), invo.getTarget());
            if(!temp.getSource().equals(temp.getTarget()) && !list.contains(temp) && !list.contains(temp.reverse())) {
                list.add(temp);
            }else {
                for(InvocationPair i: list) {
                    if(i.equals(temp)) {
                        i.increase();
                        break;
                    }
                }
            }
        }
        for(InvocationPair invo: list) {
            double temp_prob = invo.getCount() * 1.0 / invocationRepository.count();
            invo.setProbability(temp_prob);
        }
        return list;
    }
}
