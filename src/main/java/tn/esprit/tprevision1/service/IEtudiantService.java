package tn.esprit.tprevision1.service;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision1.Generique.IGeneriqueService;
import tn.esprit.tprevision1.entity.Etudiant;

public interface IEtudiantService extends IGeneriqueService<Etudiant,Integer> {
}
