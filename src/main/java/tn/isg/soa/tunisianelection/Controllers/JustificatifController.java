package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Justificatif;
import tn.isg.soa.tunisianelection.Services.JustificatifService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/justificatif")
public class JustificatifController {
        @Autowired
        JustificatifService JS;

        @PostMapping("/add")
        Justificatif ajoutFormation(@RequestBody Justificatif justificatif) {
            JS.saveJustificatif(justificatif);
            return justificatif;
        }

    @GetMapping("/getalljustificatifs")
    public List<Justificatif> getalljustificatifs() {
        return JS.ListJustificatif();
    }
    @GetMapping("/findbyid/{id}")
    Optional<Justificatif> findjustificatifbyid(@PathVariable("id") Long id) {
        return  JS.findJustificatifbyid(id);

    }
    @DeleteMapping("/deletejustificatif/{id}")
    void removejustificatif(@PathVariable("id") long id) {
        JS.removeJustificatif(id);
    }


    }
