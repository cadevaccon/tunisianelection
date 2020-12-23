package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("Corruption")
public class Corruption extends Activite {
    private String type;

    public Corruption(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin, @NonNull String type) {
        super(nomActivite, dateDebut, dateFin);
    }
}

