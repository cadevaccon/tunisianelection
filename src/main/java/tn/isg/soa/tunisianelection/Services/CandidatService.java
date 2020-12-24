package tn.isg.soa.tunisianelection.Services;
import tn.isg.soa.tunisianelection.Models.Candidat;
import java.util.List;
import java.util.Optional;

public interface CandidatService {
    void saveCandidat(Candidat candidat);
    void UpdateCandidat(Candidat candidat);
    List<Candidat>ListCandidat();
    void removeCandidat(Long id);
    public Optional<Candidat>findCandidat(Long id);
}


