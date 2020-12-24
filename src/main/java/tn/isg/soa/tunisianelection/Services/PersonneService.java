package tn.isg.soa.tunisianelection.Services;

import tn.isg.soa.tunisianelection.Models.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {
    void savePersonne(Personne electeur);
    void UpdatePersonne(Personne electeur);
    List<Personne>ListPersonne();
    void removePersonne(Long id);
    public Optional<Personne>findPersonne(Long id);
}