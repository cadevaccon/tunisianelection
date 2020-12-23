package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("Scientifique")
public class ActSc extends Activite {

    private float budget;



    public ActSc(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin, @NonNull String type) {
        super(nomActivite, dateDebut, dateFin);
    }


}