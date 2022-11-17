package tn.esprit.tprevision1.service;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision1.Generique.IGeneriqueServiceImpl;
import tn.esprit.tprevision1.entity.Etudiant;
import tn.esprit.tprevision1.entity.Produit;
@Service
public class IProduitServiceImp  extends IGeneriqueServiceImpl<Produit,Integer> implements IProduitService{}


