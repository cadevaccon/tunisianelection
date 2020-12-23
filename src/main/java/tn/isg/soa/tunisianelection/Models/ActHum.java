package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@DiscriminatorValue("Humaine")
public class ActHum extends Activite {
    private String cause_hum; //cause humanitaire
    private long nbrParticip; // nombre de participants
    private String fond;


    public ActHum(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin, @NonNull String fond) {
        super(nomActivite, dateDebut, dateFin);
    }


}

