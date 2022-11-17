package tn.esprit.tprevision1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.entity.Client;
import tn.esprit.tprevision1.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture,Integer> {
}
