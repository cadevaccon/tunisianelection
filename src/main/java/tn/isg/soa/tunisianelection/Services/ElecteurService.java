package tn.isg.soa.tunisianelection.Services;

import tn.isg.soa.tunisianelection.Models.Electeur;

import java.util.List;
import java.util.Optional;

public interface ElecteurService {
    void saveElecteur(Electeur electeur);
    void UpdateElecteur(Electeur electeur);
    List<Electeur>ListElecteur();
    void removeElecteur(Long id);
    public Optional<Electeur>findElecteur(Long id);
}