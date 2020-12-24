package tn.isg.soa.tunisianelection.Services;

import tn.isg.soa.tunisianelection.Models.Parti;

import java.util.List;
import java.util.Optional;

public interface PartiService {
    void saveParti(Parti electeur);
    void UpdateParti(Parti electeur);
    List<Parti>ListParti();
    void removeParti(Long id);
    public Optional<Parti>findParti(Long id);
}