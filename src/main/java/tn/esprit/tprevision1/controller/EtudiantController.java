package tn.esprit.tprevision1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision1.Generique.RestControllerGenerique;
import tn.esprit.tprevision1.entity.Etudiant;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController extends RestControllerGenerique<Etudiant,Integer> {

}