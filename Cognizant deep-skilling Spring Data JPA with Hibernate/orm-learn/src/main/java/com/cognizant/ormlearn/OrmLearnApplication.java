package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Countries containing 'ou':");
        countryService.findByNameContaining("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries containing 'ou' sorted by name:");
        countryService.findByNameContainingOrderByNameAsc("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z':");
        countryService.findByNameStartingWith("Z")
                .forEach(System.out::println);
    }
}