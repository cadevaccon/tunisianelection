package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Formation;
import tn.isg.soa.tunisianelection.Repositories.FormationRepository;
import tn.isg.soa.tunisianelection.Services.FormationService;
import java.util.List;
import java.util.Optional;

@Service("FormationServiceImpl")
public class FormationServiceImpl implements FormationService {
    @Autowired
    FormationRepository formationRepository;

    @Override
    public void saveFormations(Formation formation) {
        formationRepository.save(formation);
    }

    @Override
    public void UpdateFormation(Formation formation) {
        formationRepository.save(formation);
    }

    @Override
    public List<Formation> ListFormation() {
        return formationRepository.findAll();

    }

    @Override
    public void removeFormation(Long Id) {
        formationRepository.deleteById(Id);
    }

    @Override
    public Optional<Formation> findFormationbyid(Long id) {
        return formationRepository.findById(id);
    }

}
