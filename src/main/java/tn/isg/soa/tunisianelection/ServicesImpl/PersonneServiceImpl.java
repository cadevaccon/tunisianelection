package tn.isg.soa.tunisianelection.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isg.soa.tunisianelection.Models.Personne;
import tn.isg.soa.tunisianelection.Repositories.PersonneRepository;
import tn.isg.soa.tunisianelection.Services.PersonneService;
import java.util.List;
import java.util.Optional;

@Service("PersonneServiceImpl")
public class PersonneServiceImpl implements PersonneService {
    @Autowired
    PersonneRepository personneRepository;

    @Override
    public void savePersonne(Personne personne) {
        personneRepository.save(personne);

        }

        @Override
        public void UpdatePersonne (Personne personne) {
           personneRepository.save(personne);
        }
    @Override
    public List<Personne> ListPersonne() {
        return personneRepository.findAll()
                ;
    }

        @Override
        public void removePersonne(Long Id){
        personneRepository.deleteById(Id);
        }
        @Override
        public Optional<Personne> findPersonne(Long id) {
          return personneRepository.findById(id);
        }

    }
