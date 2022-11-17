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
public class Client  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idClient;
    private String nomC;
    private String prenomC;
    private String email;
    private String password;
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private  Profession profession;
    private CategorieClient categorieClient;

    @OneToMany( mappedBy="client")

    private List<Facture> factures;

}
