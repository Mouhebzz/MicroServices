package tn.esprit.cosharemshoussem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharemshoussem.Entities.Offer;
import tn.esprit.cosharemshoussem.Repositories.OfferRepository;

import java.util.List;

@Service
public class OfferService {
    @Autowired
    private OfferRepository offerRepository;
    public Offer addOffer(Offer candidat) {
        return offerRepository.save(candidat);
    }
    public Offer updateCandidat(int id, Offer offer) {
        if (offerRepository.findById(id).isPresent()) {
            Offer existingCandidat = offerRepository.findById(id).get();
            existingCandidat.setName(offer.getName());
            existingCandidat.setDescription(offer.getDescription());
            existingCandidat.setStatus(offer.getStatus());
            existingCandidat.setImage(offer.getImage());

            return offerRepository.save(existingCandidat);
        } else
            return null;
    }
    public String deleteOffer(int id) {
        if (offerRepository.findById(id).isPresent()) {
            offerRepository.deleteById(id);
            return "offre supprimé";
        } else
            return "offre non supprimé";
    }
    public List<Offer> getalloffres(){
        return offerRepository.findAll();
    }


}
