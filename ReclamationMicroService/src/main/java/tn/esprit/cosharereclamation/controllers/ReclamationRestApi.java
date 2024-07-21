
package tn.esprit.cosharereclamation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cosharereclamation.entities.Reclamation;
import tn.esprit.cosharereclamation.services.ReclamationService;
import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/api/reclamations")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE ,RequestMethod.OPTIONS})

public class ReclamationRestApi {

    @Autowired
    private ReclamationService reclamationService;

    private String admin="hello , im admin";

    @RequestMapping("/hello")
    @RolesAllowed("user")
    public String sayHello(){
        System.out.println("title");
        return "title";
    }
     @RequestMapping("/admin")
    @RolesAllowed("admin")
    public String sayAdmin(){
        System.out.println(admin);
        return admin;
    }
    @GetMapping
    public ResponseEntity<List<Reclamation>> getAllReclamations() {
        return new ResponseEntity<>(reclamationService.getAllReclamations(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reclamation> getReclamationById(@PathVariable int id) {
        return reclamationService.getReclamationById(id)
                .map(reclamation -> new ResponseEntity<>(reclamation, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(reclamationService.addReclamation(reclamation), HttpStatus.CREATED);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Reclamation> updateReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(reclamationService.updateReclamation(reclamation), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReclamation(@PathVariable int id) {
        reclamationService.deleteReclamation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/search")
    public ResponseEntity<List<Reclamation>> searchReclamations(@RequestParam String keyword) {
        return new ResponseEntity<>(reclamationService.searchReclamations(keyword), HttpStatus.OK);
    }

    @GetMapping("/sort")
    public ResponseEntity<List<Reclamation>> sortReclamations(@RequestParam String sortBy) {
        return new ResponseEntity<>(reclamationService.sortReclamations(sortBy), HttpStatus.OK);
    }


}