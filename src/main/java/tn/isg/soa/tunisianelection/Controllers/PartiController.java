package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Parti;
import tn.isg.soa.tunisianelection.Services.PartiService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/parti")
    public class PartiController {
        @Autowired
        PartiService PS;

        @PostMapping("/add")
       Parti ajoutParti(@RequestBody Parti parti) {
            PS.saveParti(parti);
            return parti;
        }

        @GetMapping("/getallparti")
        public List<Parti> getallparti() {
            return PS.ListParti();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Parti> findpartibyid(@PathVariable("id") Long id) {
            return PS.findParti(id);
        }

        @DeleteMapping("/deleteparti/{id}")
        void removeparti(@PathVariable("id") long id) {
           PS.removeParti(id);
        }
    }
