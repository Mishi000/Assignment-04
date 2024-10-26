package com.csc340.Assignment04;

//import com.csc340.Assignment04.entity.Animal;
//import com.csc340.Assignment04.animal.AnimalController;
//import org.springframework.ui.Model;
import com.csc340.Assignment04.animal.Animal;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("animal")
public class AnimalController {

    @GetMapping("/animal/all")
    public String getAllAnimals(ModelMap model) {
        List<Animal> animals = service.getAllAnimals();
        model.addAttribute("animalList", animals);
        return "animal-list"; // Returns the name of the HTML view
    }

    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public String getAllAnimal(ModelMap model) {
        model.addAttribute("animalList", service.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "animal-list";
    }
    /*public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }*/

    @GetMapping("/{id}")
    public String getAnimalById(@PathVariable int id, ModelMap model) {
        model.addAttribute("animal", id);
        return "animal-details";
        //return service.getAnimalById(id);
    }

    @PostMapping("/new")
    public String addAnimal(com.csc340.Assignment04.animal.Animal animal) {
        service.addAnimal(animal);
        return "redirect:/animal/all";
    }

    @GetMapping("/update/{id}")
    public String updateAnimal(@PathVariable int id, ModelMap model) {
        model.addAttribute("animal", service.getAnimalById(id));
        return "animal-update";
        //animal.setAnimalId(id);
        //return service.updateAnimal(animal);
    }

    @GetMapping("/delete/{id}")
    public String deleteAnimal(@PathVariable int id) {
        service.deleteAnimal(id);
        return"redirect:/animal/all";
    }
}
