package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Activite;
import tn.isg.soa.tunisianelection.Services.ActiviteService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/activite")
    public class ActiviteController {
        @Autowired
        ActiviteService AS;

        @PostMapping("/add")
        Activite ajoutActivite(@RequestBody Activite activite) {
            AS.saveActivite(activite);
            return activite;
        }

        @GetMapping("/getallactivites")
        public List<Activite> getallactivites() {
            return AS.ListActivite();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Activite> findactivitebyid(@PathVariable("id") Long id) {
            return AS.findActivite(id);
        }

        @DeleteMapping("/deleteactivite/{id}")
        void removeactivite(@PathVariable("id") long id) {
           AS.removeActivite(id);
        }
    }


        /*@PutMapping("/updateactivite/{id}")
        String updateactivite(@RequestBody Activite activite, @PathVariable("id") Long id) {
            Optional<Activite> ActiviteOptional = AS.findActivite(id);
            if (ActiviteOptional.isPresent()) {
                Activite A = new Activite();

                A.setidActivite(id);
                A.setnomActivite(activite.getnomActivite());
                A.setdateDebut(activite.getdateDebut());
                A.setdateFin(activite.getdateFin());
                AS.UpdateActivite(A);
                return "Activite existe";*/


