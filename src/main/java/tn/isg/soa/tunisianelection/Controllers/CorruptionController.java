package tn.isg.soa.tunisianelection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isg.soa.tunisianelection.Models.Corruption;
import tn.isg.soa.tunisianelection.Services.CorruptionService;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/corruption")
    public class CorruptionController {
        @Autowired
        CorruptionService CS;

        @PostMapping("/add")
        Corruption ajoutCorruption(@RequestBody Corruption corruption) {
            CS.saveCorruption(corruption);
            return corruption;
        }

        @GetMapping("/getallcorruptions")
        public List<Corruption> getallcorruptions() {
            return CS.ListCorruption();
        }

        @GetMapping("/findbyid/{id}")
        Optional<Corruption> findcorruptionbyid(@PathVariable("id") Long id) {
            return CS.findCorruption(id);
        }

        @DeleteMapping("/deletecorruption/{id}")
        void removecorruption(@PathVariable("id") long id) {
           CS.removeCorruption(id);
        }
    }