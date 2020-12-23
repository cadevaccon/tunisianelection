package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Activite;
import tn.isg.soa.tunisianelection.Repositories.ActiviteRepository;
import tn.isg.soa.tunisianelection.Services.ActiviteService;
import java.util.List;
import java.util.Optional;

@Service("ActiviteServiceImpl")
public class ActiviteServiceImpl implements ActiviteService {
    @Autowired
    ActiviteRepository activiteRepository;

    @Override
    public void saveActivite(Activite activite) {
        activiteRepository.save(activite);

        }

        @Override
        public void UpdateActivite (Activite activite) {
           activiteRepository.save(activite);
        }
    @Override
    public List<Activite> ListActivite() {
        return activiteRepository.findAll()
                ;
    }

        @Override
        public void removeActivite(Long Id){
        activiteRepository.deleteById(Id);
        }
        @Override
        public Optional<Activite> findActivite(Long id) {
          return activiteRepository.findById(id);
        }

    }

