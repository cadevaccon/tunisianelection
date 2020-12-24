package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Formation {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @NonNull
    private String nom;
    @NonNull
    private int duree;
    @NonNull
    private String domaine;
    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat candidat;  

    public Formation(@NonNull String nom, @NonNull int duree, @NonNull String domaine) {
        this.nom = nom;
        this.duree = duree;
        this.domaine = domaine;
    }
}
