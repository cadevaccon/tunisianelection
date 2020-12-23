package tn.isg.soa.tunisianelection.Models;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@DiscriminatorValue("Condidat")
public class Candidat extends Personne {

    @Lob
    @NonNull
    private byte photo;

    private String tweeter;
    private String facebook;
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    List<Activite> listeActivites;
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    List<Formation> formations;
    @ManyToOne
    @JoinColumn(name = "listCondid_id")
    private ListeCandidat liste;
    @ManyToOne
    @JoinColumn(name = "parti_id")
    private Parti parti;
    @ManyToMany
    // @JoinTable(name="Avis",
    //         joinColumns=@JoinColumn(name="electeur_id", referencedColumnName="id"),
    //         inverseJoinColumns=@JoinColumn(name="candidat_id",referencedColumnName="id")

    // )

   List<Electeur>electeurs;


    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Administrateur admin;






    public Candidat(byte photo, String tweeter, String facebook) {
        super();

        this.photo = photo;
        this.tweeter = tweeter;
        this.facebook = facebook;



    }
}
