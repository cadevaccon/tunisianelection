package tn.isg.soa.tunisianelection.Services;
import tn.isg.soa.tunisianelection.Models.ListeCandidat;
import java.util.List;
import java.util.Optional;


    public interface ListeCandidatService {
        void saveListeCandidat (ListeCandidat Candidat_liste);
        void UpdateListeCandidat(ListeCandidat candidat_liste);
        List<ListeCandidat> ListCandidats();
        void removeListeCandidat(Long Id);
        public Optional<ListeCandidat> findListeCandidatbyid(Long Id);

    }


