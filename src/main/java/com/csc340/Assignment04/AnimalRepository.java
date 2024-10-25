package com.csc340.Assignment04;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.csc340.Assignment04.animal.Animal;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findBySpecies(String species);
    List<Animal> findByNameContaining(String name);
    List<Animal> findByName(String name);
}

