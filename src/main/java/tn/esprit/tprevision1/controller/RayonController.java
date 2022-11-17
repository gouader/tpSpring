package tn.esprit.tprevision1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision1.Generique.RestControllerGenerique;
import tn.esprit.tprevision1.entity.Produit;
import tn.esprit.tprevision1.entity.Rayon;

@RestController
@RequestMapping("/rayon")
public class RayonController extends RestControllerGenerique<Rayon,Integer> {
}
