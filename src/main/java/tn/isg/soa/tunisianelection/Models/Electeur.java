package tn.isg.soa.tunisianelection.Models;

import lombok.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.List;


@Entity
@DiscriminatorValue("Electeur")
public class Electeur extends Personne {
    // @ManyToMany(mappedBy = "Avis")
    // List<Candidat>candidats;

    public Electeur(@NonNull String nom, @NonNull String prenom, @NonNull LocalDate date_naiss, @NonNull String login, @NonNull String password) {
        super(nom, prenom, date_naiss, login, password);
    }
}
