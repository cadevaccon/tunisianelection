package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

public class ListeCandidat {
    @EqualsAndHashCode.Include
    @Id
    private long idList;
    @NonNull
    private String gouvernorat;
    @NonNull
    private String commune;
    @NonNull
    private String teteList;
    @NonNull
    private String type;
    @OneToMany(mappedBy ="liste", cascade= CascadeType.ALL)
    List<Candidat> Candidats;

    public ListeCandidat(@NonNull String governorat, @NonNull String commune, @NonNull String teteList, @NonNull String type) {
        this.gouvernorat = gouvernorat;
        this.commune = commune;
        this.teteList = teteList;
        this.type = type;

    }
}
