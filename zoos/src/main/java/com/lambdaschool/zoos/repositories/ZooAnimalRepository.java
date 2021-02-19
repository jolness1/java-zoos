package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.ZooAnimals;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimals, Long> {
}
