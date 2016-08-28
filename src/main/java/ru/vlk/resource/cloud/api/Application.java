package ru.vlk.resource.cloud.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.vlk.resource.cloud.api.model.Resource;
import ru.vlk.resource.cloud.api.repository.ResourceRepository;

@SpringBootApplication
public class Application {

	@Autowired
	private ResourceRepository repository;

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			repository.save(new Resource("habrahabr", "https://habrahabr.ru/", "Habr ahabr", "habr"));
			repository.save(new Resource("wiki-paragon-start", "http://wiki.paragon-software.com/wiki/know/start",
					"Wiki start", "wiki"));
			repository.save(new Resource("wiki-m2m", "http://wiki.paragon-software.com/wiki/m2m", "Wiki m2m", "m2m"));

			log.info("Resource found with findAll():");
			log.info("-------------------------------");
			for (Resource resource : repository.findAll()) {
				log.info(resource.toString());
			}
            log.info("");

			Resource resource = repository.findOne(1L);
			log.info("Resource found with findOne(1L):");
			log.info("--------------------------------");
			log.info(resource.toString());
            log.info("");

			log.info("Resource found with findByDescription('habr'):");
			log.info("--------------------------------------------");
			for (Resource bauer : repository.findByDescription("habr")) {
				log.info(bauer.toString());
			}
            log.info("");
		};
	}

}