package tn.isg.soa.tunisianelection.Models;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Admin")
public class Administrateur extends Personne{
    private float salaire;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    List<Candidat>candidats;


    public Administrateur(@NonNull String nom, @NonNull String prenom, @NonNull LocalDate date_naiss, @NonNull String login, @NonNull String password) {
        super(nom, prenom, date_naiss, login, password);
    }
}
