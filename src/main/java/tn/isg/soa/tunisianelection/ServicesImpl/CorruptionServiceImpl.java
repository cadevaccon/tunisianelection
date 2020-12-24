package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Corruption;
import tn.isg.soa.tunisianelection.Repositories.CorruptionRepository;
import tn.isg.soa.tunisianelection.Services.CorruptionService;
import java.util.List;
import java.util.Optional;

@Service("CorruptionServiceImpl")
public class CorruptionServiceImpl implements CorruptionService {
    @Autowired
    CorruptionRepository corruptionRepository;

    @Override
    public void saveCorruption(Corruption corruption) {
        corruptionRepository.save(corruption);

        }

        @Override
        public void updateCorruption (Corruption corruption) {
           corruptionRepository.save(corruption);
        }
    @Override
    public List<Corruption> ListCorruption() {
        return corruptionRepository.findAll()
                ;
    }

        @Override
        public void removeCorruption(Long Id){
        corruptionRepository.deleteById(Id);
        }
        @Override
        public Optional<Corruption> findCorruption(Long id) {
          return corruptionRepository.findById(id);
        }

    }