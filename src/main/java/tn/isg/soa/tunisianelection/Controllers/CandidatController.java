package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Candidat;
import tn.isg.soa.tunisianelection.Services.CandidatService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/candidat")
    public class CandidatController {
        @Autowired
       CandidatService CS;

        @PostMapping("/add")
        Candidat ajoutCandidat(@RequestBody Candidat candidat) {
            CS.saveCandidat(candidat);
            return candidat;
        }

        @GetMapping("/getallcandidats")
        public List<Candidat> getallcandidats() {
            return CS.ListCandidat();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Candidat> findcandidatbyid(@PathVariable("id") Long id) {
            return CS.findCandidat(id);
        }

        @DeleteMapping("/deletecandidat/{id}")
        void removecanddiat(@PathVariable("id") long id) {
           CS.removeCandidat(id);
        }
    }