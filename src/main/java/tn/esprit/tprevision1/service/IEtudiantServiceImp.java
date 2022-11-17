package tn.esprit.tprevision1.service;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision1.Generique.IGeneriqueServiceImpl;
import tn.esprit.tprevision1.entity.Etudiant;

@Service
public class IEtudiantServiceImp extends IGeneriqueServiceImpl< Etudiant,Integer> implements IEtudiantService {
}
