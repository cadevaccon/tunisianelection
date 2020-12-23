package tn.isg.soa.tunisianelection.Models;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Justificatif {
    @EqualsAndHashCode.Include
    @Id
    private long id;
    private String type;


    @ManyToOne
    @JoinColumn(name = "Activite_id")
    private Activite activite;


    public Justificatif(String type) {
        this.type = type;
    }
}
