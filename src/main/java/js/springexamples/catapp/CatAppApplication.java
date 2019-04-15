package js.springexamples.catapp;

import js.springexamples.catapp.model.Cat;
import js.springexamples.catapp.repositories.CatRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CatAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatAppApplication.class, args);
	}


	@Bean
	ApplicationRunner init(CatRepository catRepository){
		return args -> {
			Stream.of("Maine Coon", "Ragdoll", "Persian", "American Shorthair", "Siamese",
					"Russian Blue", "Bengal", "British short hair", "Siberian", "White").forEach(race -> {
						Cat cat = new Cat();
						cat.setRace(race);
						catRepository.save(cat);
			});
			catRepository.findAll().forEach(System.out::println);
		};
	}

}
