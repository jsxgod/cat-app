package js.springexamples.catapp.repositories;

import js.springexamples.catapp.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CatRepository extends JpaRepository<Cat, Long> {
}
