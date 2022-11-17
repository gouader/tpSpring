package tn.esprit.tprevision1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision1.Generique.RestControllerGenerique;
import tn.esprit.tprevision1.entity.Etudiant;
import tn.esprit.tprevision1.entity.Produit;

@RestController
@RequestMapping("/produit")
public class ProduitController extends RestControllerGenerique<Produit,Integer> {

    @PutMapping("/{idEtud}/{idDep}")
    void assignProduitToStock(@PathVariable int idProduit, @PathVariable int idStock) {

    }
}

