package org.example.controller;

import org.example.adapter.BaseJPARepository;
import org.example.port.RepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    RepositoryPort repositoryPort;

    @GetMapping("/get")
    public String get(){
        System.out.println("get neeeeeeeeeeeee");
        System.out.println(repositoryPort.findAll());
        return "ahihi";
    }
}
