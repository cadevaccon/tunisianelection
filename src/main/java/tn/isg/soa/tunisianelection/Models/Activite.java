package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Activite_type")
public class Activite {
    @EqualsAndHashCode.Include
    @Id
    private long idActivite;
    @NonNull
    private String nomActivite;
    @NonNull
    private LocalDate dateDebut;
    @NonNull
    private LocalDate dateFin;
    @ManyToOne
    @JoinColumn(name="candidat_id") // pour specifier une clé étrangère
    private Candidat candidat;
    @OneToMany(mappedBy = "activite", cascade = CascadeType.ALL)
    List<Justificatif> justificatifs;


    public Activite(@NonNull String nomActivite, @NonNull LocalDate dateDebut, @NonNull LocalDate dateFin) {
        this.nomActivite = nomActivite;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }

    public Activite() {

    }
}
