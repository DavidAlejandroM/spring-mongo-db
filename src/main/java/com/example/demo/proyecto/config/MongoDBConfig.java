package com.example.demo.proyecto.config;

import com.example.demo.proyecto.model.*;
import com.example.demo.proyecto.repositorio.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            //userRepository.save(new User(1, "Leyner", "3225489647"));
            //userRepository.save(new User(2, "David", "3005411769"));
        };
    }

}