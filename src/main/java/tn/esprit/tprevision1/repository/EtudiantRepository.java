package tn.esprit.tprevision1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
