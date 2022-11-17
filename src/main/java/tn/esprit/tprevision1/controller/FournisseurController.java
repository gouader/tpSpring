package tn.esprit.tprevision1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision1.Generique.RestControllerGenerique;
import tn.esprit.tprevision1.entity.Fournisseur;
import tn.esprit.tprevision1.entity.Produit;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController  extends RestControllerGenerique<Fournisseur,Integer> {
}
