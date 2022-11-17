package tn.esprit.tprevision1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idDetailFacture;
    private float prixTotal;
    private Integer qte;
    private Integer pourcentageRemise;
    private  Integer montantRemise;
    @ManyToOne
    Produit produit;
    @ManyToOne
    Facture facture;

}
