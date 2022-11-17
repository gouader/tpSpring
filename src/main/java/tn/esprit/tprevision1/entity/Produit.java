package tn.esprit.tprevision1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idProduit;
    private String codeP;
    private String libelleP;
    private  float prixUnitaire;

    @ManyToOne
    Rayon rayon;
    @ManyToOne
    Stock stock;

    @OneToOne(mappedBy="produit")

    private DetailProduit detailProduit;

    @ManyToMany
    private List<Fournisseur> fournisseurs;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
}
