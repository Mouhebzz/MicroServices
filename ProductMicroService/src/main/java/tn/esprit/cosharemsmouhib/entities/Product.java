package tn.esprit.cosharemsmouhib.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID =6 ;
    @Id
    @GeneratedValue
    private int id ;
    private String label,description,image;
    public Product(String label){
        super();
        this.label = label ;
    }
    public Product(String label,String image,String desc){
        super();
        this.label = label ;
        this.image = image ;
        this.description = desc;
    }


}
