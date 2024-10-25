package com.csc340.Assignment04;

//import com.csc340.Assignment04.entity.Animal;
//import com.csc340.Assignment04.animal.AnimalController;
import com.csc340.Assignment04.animal.Animal;
import com.csc340.Assignment04.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        return service.getAnimalById(id);
    }

    @PostMapping("/new")
    public Animal addAnimal(@RequestBody com.csc340.Assignment04.animal.Animal animal) {
        return service.addAnimal(animal);
    }

    @PutMapping("/update/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animal.setAnimalId(id);
        return service.updateAnimal(animal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimal(@PathVariable int id) {
        service.deleteAnimal(id);
    }
}
