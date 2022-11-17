package tn.esprit.tprevision1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.entity.Produit;
import tn.esprit.tprevision1.entity.Rayon;

public interface RayonRepository extends JpaRepository<Rayon,Integer> {
}
