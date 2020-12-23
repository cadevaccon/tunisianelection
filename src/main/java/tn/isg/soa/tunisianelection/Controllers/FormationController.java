package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Formation;
import tn.isg.soa.tunisianelection.Services.FormationService;

import java.util.List;
import java.util.Optional;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/formation")
    public class FormationController {
        @Autowired
        FormationService FS;

        @PostMapping("/add")
        Formation ajoutFormation(@RequestBody Formation formation) {
            FS.saveFormations(formation);
            return formation;
        }

        @GetMapping("/getallformations")
        public List<Formation> getallformations() {
            return FS.ListFormation();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Formation> findformationbyid(@PathVariable("id") Long id) {
          return  FS.findFormationbyid(id);

        }
        @DeleteMapping("/deleteformation/{id}")
        void removeformation(@PathVariable("id") long id) {
            FS.removeFormation(id);
        }

    }
