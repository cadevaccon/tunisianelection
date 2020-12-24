package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Parti;
import tn.isg.soa.tunisianelection.Repositories.PartiRepository;
import tn.isg.soa.tunisianelection.Services.PartiService;
import java.util.List;
import java.util.Optional;

@Service("PartiServiceImpl")
public class PartiServiceImpl implements PartiService {
    @Autowired
    PartiRepository partiRepository;

    @Override
    public void saveParti(Parti parti) {
        partiRepository.save(parti);

        }

        @Override
        public void UpdateParti (Parti parti) {
           partiRepository.save(parti);
        }
    @Override
    public List<Parti> ListParti() {
        return partiRepository.findAll()
                ;
    }

        @Override
        public void removeParti(Long Id){
        partiRepository.deleteById(Id);
        }
        @Override
        public Optional<Parti> findParti(Long id) {
          return partiRepository.findById(id);
        }

    }