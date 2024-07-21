
package tn.esprit.cosharereclamation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharereclamation.entities.Reclamation;
import tn.esprit.cosharereclamation.repositories.ReclamationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReclamationService {

    @Autowired
    private ReclamationRepository reclamationRepository;

    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }

    public List<Reclamation> getAllReclamations() {
        return reclamationRepository.findAll();
    }

    public Optional<Reclamation> getReclamationById(int id) {
        return reclamationRepository.findById(id);
    }

    public Reclamation updateReclamation(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }

    public void deleteReclamation(int id) {
        reclamationRepository.deleteById(id);
    }


    // Search method
    public List<Reclamation> searchReclamations(String keyword) {
        if (keyword != null && !keyword.trim().isEmpty()) {
            // TODO: Implement search by keyword in title or description
            // Return a list of Reclamations that match the keyword in title or description
        }
        return getAllReclamations();
    }

    // Sort method
    public List<Reclamation> sortReclamations(String sortBy) {
        if ("priorite".equalsIgnoreCase(sortBy)) {
            // TODO: Sort Reclamations by priority
        } else if ("statut".equalsIgnoreCase(sortBy)) {
            // TODO: Sort Reclamations by status
        }
        return getAllReclamations();
    }


}