package js.springexamples.catapp.controllers;

import js.springexamples.catapp.model.Cat;
import js.springexamples.catapp.repositories.CatRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class IndexController {

    private CatRepository catRepository;

    public IndexController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping({"/", "/index"})
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Cat> getCats(){
        return catRepository.findAll();
    }
}
