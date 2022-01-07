package com.springproject.gestionemployes;

import com.springproject.gestionemployes.models.Employe;
import com.springproject.gestionemployes.repositories.EmployeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestionEmployesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionEmployesApplication.class, args);
    }


    @Bean
    CommandLineRunner initDatabaseH2 (EmployeRepository employeRepository){

        return args -> {
            employeRepository.save(new Employe(Long.parseLong("1"),"mohamed","amine","AB123456","0612345678","marrakech","m@m.com","1987-02-01" ,"rabat","",4,"2003-04-05","technicien"));

        };
    }


}





