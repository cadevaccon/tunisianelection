package tn.isg.soa.tunisianelection.Services;
import tn.isg.soa.tunisianelection.Models.Formation;

import java.util.List;
import java.util.Optional;


    public interface FormationService {
        void saveFormations (Formation formation);
        void UpdateFormation(Formation formation);
        List<Formation> ListFormation();
        void removeFormation(Long Id);
        public Optional<Formation> findFormationbyid(Long Id);



}
