package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Justificatif;
import tn.isg.soa.tunisianelection.Models.ListeCandidat;
import tn.isg.soa.tunisianelection.Services.ListeCandidatService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/listeCandidat")
public class ListeCandidController {
    @Autowired
    ListeCandidatService LS;
    @PostMapping("/add")
    ListeCandidat ajoutListeCandidat(@RequestBody ListeCandidat liste) {
        LS.saveListeCandidat(liste);
        return liste;
    }
    @GetMapping("/getalllistecandidats")
    public List<ListeCandidat> getalllistecandidats() {
        return LS.ListCandidats();
    }
    @GetMapping("/findbyid/{id}")
    Optional<ListeCandidat> findlistecandidatbyid(@PathVariable("id") Long id) {
        return LS.findListeCandidatbyid(id);
    }
    @DeleteMapping("/deletelistecandidat/{id}")
    void removelisteCnadidat(@PathVariable("id") long id) {
        LS.removeListeCandidat(id);
    }
}
