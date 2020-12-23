package tn.isg.soa.tunisianelection.Services;
import tn.isg.soa.tunisianelection.Models.Justificatif;
import java.util.List;
import java.util.Optional;


    public interface JustificatifService {
        void saveJustificatif (Justificatif formation);
        void UpdateJustificatif(Justificatif formation);
        List<Justificatif> ListJustificatif();
        void removeJustificatif(Long Id);
        public Optional<Justificatif> findJustificatifbyid(Long Id);

    }



