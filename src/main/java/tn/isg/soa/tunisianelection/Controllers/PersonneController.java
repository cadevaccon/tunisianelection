package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Personne;
import tn.isg.soa.tunisianelection.Services.PersonneService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/personne")
    public class PersonneController {
        @Autowired
        PersonneService PS;

        @PostMapping("/add")
       Personne ajoutPersonne(@RequestBody Personne personne) {
            PS.savePersonne(personne);
            return personne;
        }

        @GetMapping("/getallpersonnes")
        public List<Personne> getallpersonnes() {
            return PS.ListPersonne();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Personne> findpersonnebyid(@PathVariable("id") Long id) {
            return PS.findPersonne(id);
        }

        @DeleteMapping("/deletepersonne/{id}")
        void removepersonne(@PathVariable("id") long id) {
           PS.removePersonne(id);
        }
        @PutMapping("/updatepersonne/{id}")
	String updatepersonne(@RequestBody Personne personne,@PathVariable("id") Long id) {
		
		
		Optional<Personne> PersonneOptional=PS.findPersonne(id);
		if(!PersonneOptional.isPresent())
			return "Persoone n'existe pas";
		
		Personne P=new Personne();
		P.setId(id);
        P.setNom(personne.getNom());
        P.setPrenom(personne.getPrenom());
		P.setLogin(personne.getLogin());
		PS.UpdatePersonne(P);
		return "Personne existe";
	}
    }
