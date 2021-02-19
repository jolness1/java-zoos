package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.ZooAnimal;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, Long> {
}
