package com.lambdaschool.zoos.controllers;


import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController
{

    @Autowired
    private ZooService zooService;

//    http://localhost:2019/zoos/zoos
//    List of Zoos, telephones, snimals
    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> listAllZoos()
    {
        List<Zoo> myZoos = zooService.findAll();
        return new ResponseEntity<>(myZoos, HttpStatus.OK);
    }



        //    http://localhost:2019/zoos/zoo/5
        //    One Specific zoo with above listed
    @GetMapping(value = "/zoo/{zooId}", produces = "application/json")
    public ResponseEntity<?> getZooById(@PathVariable Long zooId)
    {
        Zoo z = zooService.findZooById(zooId);
        return new ResponseEntity<>(z, HttpStatus.OK);
    }

}
