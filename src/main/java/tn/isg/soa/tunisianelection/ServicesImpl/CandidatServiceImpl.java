package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Candidat;
import tn.isg.soa.tunisianelection.Repositories.CandidatRepository;
import tn.isg.soa.tunisianelection.Services.CandidatService;
import java.util.List;
import java.util.Optional;

@Service("CandidatServiceImpl")
public class CandidatServiceImpl implements CandidatService {
    @Autowired
    CandidatRepository candidatRepository;

    @Override
    public void saveCandidat(Candidat candidat) {
        candidatRepository.save(candidat);

        }

        @Override
        public void UpdateCandidat (Candidat candidat) {
           candidatRepository.save(candidat);
        }
    @Override
    public List<Candidat> ListCandidat() {
        return candidatRepository.findAll()
                ;
    }

        @Override
        public void removeCandidat(Long Id){
        candidatRepository.deleteById(Id);
        }
        @Override
        public Optional<Candidat> findCandidat(Long id) {
          return candidatRepository.findById(id);
        }

    }