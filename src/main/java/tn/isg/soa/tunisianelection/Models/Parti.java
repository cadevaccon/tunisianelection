package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

@Data // remplace @getter @Setter
@NoArgsConstructor // constructeur non paramétré
@ToString // remplace la méthode to string
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // remplace les méthodes equals and hashcode
@Entity //
public class Parti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @NonNull
    private String nom;
    
    private LocalDate dateCreation;
    @NonNull
    private String local;

    @ManyToMany
    List<Candidat> Candidats;

    public Parti(@NonNull String nom, @NonNull LocalDate dateCreation, @NonNull String local) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.local = local;
    }
}
