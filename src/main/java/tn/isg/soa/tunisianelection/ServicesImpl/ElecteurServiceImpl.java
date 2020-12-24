package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Electeur;
import tn.isg.soa.tunisianelection.Repositories.ElecteurRepository;
import tn.isg.soa.tunisianelection.Services.ElecteurService;
import java.util.List;
import java.util.Optional;

@Service("ElecteurServiceImpl")
public class ElecteurServiceImpl implements ElecteurService {
    @Autowired
   ElecteurRepository electeurRepository;

    @Override
    public void saveElecteur(Electeur electeur) {
        electeurRepository.save(electeur);

        }

        @Override
        public void UpdateElecteur (Electeur electeur) {
           electeurRepository.save(electeur);
        }
    @Override
    public List<Electeur> ListElecteur() {
        return electeurRepository.findAll()
                ;
    }

        @Override
        public void removeElecteur(Long Id){
        electeurRepository.deleteById(Id);
        }
        @Override
        public Optional<Electeur> findElecteur(Long id) {
          return electeurRepository.findById(id);
        }

    }

