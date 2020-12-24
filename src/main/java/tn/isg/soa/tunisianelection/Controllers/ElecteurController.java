package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Electeur;
import tn.isg.soa.tunisianelection.Services.ElecteurService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/electeur")
    public class ElecteurController {
        @Autowired
        ElecteurService ES;

        @PostMapping("/add")
        Electeur ajoutElecteur(@RequestBody Electeur electeur) {
            ES.saveElecteur(electeur);
            return electeur;
        }

        @GetMapping("/getallelecteurs")
        public List<Electeur> getallelecteurs() {
            return ES.ListElecteur();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Electeur> findelecteurbyid(@PathVariable("id") Long id) {
            return ES.findElecteur(id);
        }

        @DeleteMapping("/deleteelecteur/{id}")
        void removeelecteur(@PathVariable("id") long id) {
           ES.removeElecteur(id);
        }
            // @PutMapping("/updatepersonne/{id}")
	// String updateelecteur(@RequestBody Electeur electeur,@PathVariable("id") Long id) {
		
		
	// 	Optional<Electeur> ElecteurOptional=ES.findElecteur(id);
	// 	if(!ElecteurOptional.isPresent())
	// 		return "ELecteur n'existe pas";
		
	// 	Electeur P=new Electeur();
	// 	P.setId(id);
    //     P.setNom(electeur.getNom());
    //     P.setPrenom(electeur.getPrenom());
	// 	P.setLogin(electeur.getLogin());
	// 	ES.UpdateElecteur(P);
	// 	return "Electeur existe";
	// }
    }
