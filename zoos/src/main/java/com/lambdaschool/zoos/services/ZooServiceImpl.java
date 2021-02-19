package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repositories.AnimalRepository;
import com.lambdaschool.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService{

    @Autowired
    ZooRepository zoorepos;


    @Transactional
    @Override
    public List<Zoo> findAll() {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }


    @Override
    public Zoo findZooById(Long zooId) throws EntityNotFoundException {
        return zoorepos.findById(zooId)
                .orElseThrow(() -> new EntityNotFoundException("Zoo " + zooId + " doesn't exist!"));
    }
}
