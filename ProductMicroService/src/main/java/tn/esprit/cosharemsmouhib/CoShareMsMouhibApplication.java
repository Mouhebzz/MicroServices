package tn.esprit.cosharemsmouhib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.cosharemsmouhib.entities.Product;
import tn.esprit.cosharemsmouhib.repositories.ProductRepository;

@SpringBootApplication
@EnableEurekaClient
public class CoShareMsMouhibApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShareMsMouhibApplication.class, args);
    }
@Autowired
private ProductRepository repository;
@Bean
    ApplicationRunner init(){
        return (args) -> {
            repository.save(new Product("tv","https://images.samsung.com/is/image/samsung/ph-hd-t4300-ua32t4300agxxp-frontblack-224825896?$650_519_PNG$","best tv"));
            repository.save(new Product("tv","https://images.samsung.com/is/image/samsung/my-fhd-tv-t5300-ua43t6000akxxm-frontblack-219371052?$650_519_PNG$","mediocre"));
            repository.save(new Product("tv","https://instorestatic.tcl.com/media/catalog/product/0/1/01.png","bad tv"));
            repository.findAll().forEach(System.out::println);
        };
}

}
