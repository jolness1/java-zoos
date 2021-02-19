package com.lambdaschool.zoos.services;


import com.lambdaschool.zoos.repositories.AnimalRepository;
import com.lambdaschool.zoos.views.CountAnimalsInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalreps;

    @Override
    public ArrayList<CountAnimalsInZoo> getCountAnimalInZoo()
    {
        return animalreps.getCountAnimalInZoo();
    }
}
