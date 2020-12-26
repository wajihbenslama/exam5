package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Projet;
import tn.esprit.spring.services.Interfaces.IProjetService;

@RestController
public class ProjetController {

    @Autowired
    IProjetService projetService;

    @PostMapping("/ajouter-projet")
    @ResponseBody
    public void ajouterProjet(@RequestBody Projet projet) {
        projetService.ajouterProjet(projet);
    }

    @PostMapping("/affecter-etudiant-projet")
    @ResponseBody
    public void affecterEtudiantProjet(@RequestBody int idProjet, int idEtudiant) {
        projetService.affecterEtudiantProjet(idProjet, idEtudiant);
    }

}
