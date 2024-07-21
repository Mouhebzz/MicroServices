package tn.esprit.cosharemsmouhib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cosharemsmouhib.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
