package js.springexamples.catapp.services;

import js.springexamples.catapp.model.Cat;
import js.springexamples.catapp.repositories.CatRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CatJPAService implements CatService{

    private final CatRepository catRepository;

    public CatJPAService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public Set<Cat> findAll() {

        Set<Cat> cats = new HashSet<>();
        catRepository.findAll().forEach(cats::add);

        return cats;
    }

    @Override
    public Cat findById(Long aLong) {
        return catRepository.findById(aLong).isPresent() ? catRepository.findById(aLong).get() : null;
    }

    @Override
    public Cat save(Cat object) {
        return catRepository.save(object);
    }

    @Override
    public void delete(Cat object) {
        catRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        catRepository.deleteById(aLong);
    }
}
