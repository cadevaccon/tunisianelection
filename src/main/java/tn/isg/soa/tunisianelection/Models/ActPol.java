package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("Politique")
public class ActPol extends Activite {

    public ActPol(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin) {
        super(nomActivite, dateDebut, dateFin);
    }

}