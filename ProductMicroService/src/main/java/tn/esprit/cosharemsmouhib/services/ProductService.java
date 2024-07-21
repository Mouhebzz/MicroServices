package tn.esprit.cosharemsmouhib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharemsmouhib.entities.Product;
import tn.esprit.cosharemsmouhib.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    public Product updateProduct(int id, Product newProduct) {
        if (productRepository.findById(id).isPresent()) {
            Product existingProduct = productRepository.findById(id).get();
            existingProduct.setLabel(newProduct.getLabel());
            existingProduct.setImage(newProduct.getImage());
            existingProduct.setDescription(newProduct.getDescription());
            return productRepository.save(existingProduct);
        } else
            return null;
    }
    public String deleteProduct(int id) {
        if (productRepository.findById(id).isPresent()) {
            productRepository.deleteById(id);
            return "Product deleted";
        } else
            return "Product not deleted";
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
