package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="personne_type")
public class Personne {
    @EqualsAndHashCode.Include
    @Id
    private long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private LocalDate date_naiss;
    @NonNull
    private String login;
    @NonNull
    private String password;

    public Personne(@NonNull String nom, @NonNull String prenom, @NonNull LocalDate date_naiss, @NonNull String login, @NonNull String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.login = login;
        this.password = password;
    }


}
