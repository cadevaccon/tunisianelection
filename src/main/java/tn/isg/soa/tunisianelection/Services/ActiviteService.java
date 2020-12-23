package tn.isg.soa.tunisianelection.Services;
import tn.isg.soa.tunisianelection.Models.Activite;
import java.util.List;
import java.util.Optional;


    public interface ActiviteService {
        void saveActivite (Activite activite);
        void UpdateActivite(Activite activite);
        List<Activite> ListActivite();
        void removeActivite(Long Id);
        public Optional<Activite> findActivite(Long Id);

    }


