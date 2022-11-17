package tn.esprit.tprevision1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idDetailProduit;
    private Date dateCreation;
    private Date dateDerniereModification;
    private  CategorieProduit categorieProduit;
    @OneToOne
   private Produit produit;
}
