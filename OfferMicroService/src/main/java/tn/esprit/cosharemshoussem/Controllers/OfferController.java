package tn.esprit.cosharemshoussem.Controllers;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cosharemshoussem.Entities.Offer;
import tn.esprit.cosharemshoussem.Repositories.OfferRepository;
import tn.esprit.cosharemshoussem.Services.OfferService;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OfferController {
    private String title="hello , im the product microservice";

    @Autowired
    private OfferService offerService;

    @RequestMapping("/hello")
    @RolesAllowed("ADMIN")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
    @RequestMapping("/hello2")
    @RolesAllowed("admin")
    public String sayHelloo(){
        System.out.println(title);
        return title;
    }
    @RequestMapping("/hello3")
    @RolesAllowed("ROLE_ADMIN")
    public String sayHellooo(){
        System.out.println(title);
        return title;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    @RolesAllowed("user")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Offer> addOffer(@RequestBody Offer offer) {
        return new ResponseEntity<>(offerService.addOffer(offer), HttpStatus.OK);
    }
    @RolesAllowed("user")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Offer> updateoffre(@PathVariable(value = "id") int id,
                                                   @RequestBody Offer offer){
        return new ResponseEntity<>(offerService.updateCandidat(id, offer), HttpStatus.OK);
    }
    @RolesAllowed("user")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteOffer(@PathVariable(value = "id") int id){

            return new ResponseEntity<>(offerService.deleteOffer(id), HttpStatus.OK);

    }
    @RequestMapping("/getAll")
    @RolesAllowed("user")
    public ResponseEntity<List<Offer>> getAllProducts() {
        List<Offer> products = offerService.getalloffres();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
