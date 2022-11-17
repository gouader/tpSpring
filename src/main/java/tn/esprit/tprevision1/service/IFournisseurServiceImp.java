package tn.esprit.tprevision1.service;

import org.springframework.stereotype.Service;
import tn.esprit.tprevision1.Generique.IGeneriqueServiceImpl;
import tn.esprit.tprevision1.entity.Facture;
import tn.esprit.tprevision1.entity.Fournisseur;
@Service
public class IFournisseurServiceImp extends IGeneriqueServiceImpl<Fournisseur,Integer> implements IFournisseurService{
}
