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
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idStock;
    private Integer qteStock;
    private String libelleStock;
    private Integer qteMin;

    @OneToMany( mappedBy="stock")

    private List<Produit> produits;

}
