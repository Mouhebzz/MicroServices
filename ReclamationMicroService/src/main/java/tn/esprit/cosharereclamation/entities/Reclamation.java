package tn.esprit.cosharereclamation.entities;

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
public class Reclamation implements Serializable {
    private static final long serialVersionUID =6 ;
    @Id
    @GeneratedValue
    private int id ;
    private String titre;
    private String description;
    private Statut statut;
    private Priorite priorite;
    private String notesInternes;
    private String feedbackUtilisateur;
    private TypeReclamation typeReclamation;
    public enum Statut {
        OUVERT, FERME, EN_ATTENTE
    }

    public enum Priorite {
        HAUTE, MOYENNE, BASSE
    }

    public enum TypeReclamation {
        TECHNIQUE, SERVICE_CLIENT, AUTRE
    }


}
