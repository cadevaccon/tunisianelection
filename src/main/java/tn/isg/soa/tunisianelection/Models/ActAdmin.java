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
@DiscriminatorValue("Administrative")
public class ActAdmin extends Activite {
    @EqualsAndHashCode.Include
    private String poste;
    private int annee_exp; //annee d'expérience


    public ActAdmin(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin, @NonNull String type) {
        super(nomActivite, dateDebut, dateFin);
    }
}