package tn.isg.soa.tunisianelection.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Justificatif;
import tn.isg.soa.tunisianelection.Repositories.JusificatifRepository;
import tn.isg.soa.tunisianelection.Services.JustificatifService;

import java.util.List;
import java.util.Optional;

@Service("JustificatifServiceImpl")
public class JustificatifServiceImpl implements JustificatifService {
    @Autowired
    JusificatifRepository justififcatifRepository;

    @Override
    public void saveJustificatif(Justificatif justificatif) {
        justififcatifRepository.save(justificatif);
    }
    @Override
    public void UpdateJustificatif(Justificatif justificatif) {
        justififcatifRepository.save(justificatif);
    }
    @Override
    public List<Justificatif> ListJustificatif() {
        return justififcatifRepository.findAll();

    }
    @Override
    public void removeJustificatif(Long Id) {
      justififcatifRepository.deleteById(Id);

    }
    @Override
    public Optional<Justificatif> findJustificatifbyid(Long id) {
        return justififcatifRepository.findById(id);
    }

}
