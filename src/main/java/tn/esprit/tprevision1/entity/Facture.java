package tn.esprit.tprevision1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idFacture;
    private float montantRemise;
    private float montantFacture;
    private Date dateFacture;
    private boolean active;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;
}
