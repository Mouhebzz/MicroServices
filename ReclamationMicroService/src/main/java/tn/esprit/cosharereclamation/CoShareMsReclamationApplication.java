package tn.esprit.cosharereclamation;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class CoShareMsReclamationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShareMsReclamationApplication.class, args);
    }


@Bean
    ApplicationRunner init(){
        return (args) -> {
        
        };
}

}
