package tn.esprit.cosharemshoussem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.cosharemshoussem.Entities.Offer;
import tn.esprit.cosharemshoussem.Repositories.OfferRepository;

@SpringBootApplication
@EnableEurekaClient
public class CoShareMsHoussemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShareMsHoussemApplication.class, args);
    }

//    @Autowired
//    private OfferRepository repository;
//    @Bean
//    ApplicationRunner init(){
//        return (args) -> {
//            repository.save(new Offer());
//            repository.save(new Offer("tv"));
//            repository.save(new Offer("tv"));
//            repository.findAll().forEach(System.out::println);
//        };
//    }

}
