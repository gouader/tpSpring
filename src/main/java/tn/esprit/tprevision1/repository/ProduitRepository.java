package tn.esprit.tprevision1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.entity.Etudiant;
import tn.esprit.tprevision1.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}
