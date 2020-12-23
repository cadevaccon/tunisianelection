package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.ListeCandidat;
import tn.isg.soa.tunisianelection.Repositories.ListeCandidRepository;
import tn.isg.soa.tunisianelection.Services.ListeCandidatService;
import java.util.List;
import java.util.Optional;

@Service("ListeCandidatServiceImpl")
public class ListeCandidatServiceImpl implements ListeCandidatService {
    @Autowired
    ListeCandidRepository listeCandidRepository;
    @Override
    public void saveListeCandidat(ListeCandidat candidat_liste) {
        listeCandidRepository.save(candidat_liste);
    }
    @Override
    public void UpdateListeCandidat(ListeCandidat candidat_liste) {
        listeCandidRepository.save(candidat_liste);
    }
    @Override
    public List<ListeCandidat>  ListCandidats(){
        return listeCandidRepository.findAll();


    }
    @Override
    public void removeListeCandidat(Long Id) {
        listeCandidRepository.deleteById(Id);

    }
    @Override
    public Optional<ListeCandidat> findListeCandidatbyid(Long id) {
        return listeCandidRepository.findById(id);
    }





}
