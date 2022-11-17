package tn.esprit.tprevision1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.entity.Client;
import tn.esprit.tprevision1.entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {
}
