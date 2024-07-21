package tn.esprit.cosharereclamation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cosharereclamation.entities.Reclamation;

public interface ReclamationRepository extends JpaRepository<Reclamation,Integer> {
}
