package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Etudiant;
import tn.esprit.spring.services.Interfaces.IEtudiantService;

@RestController
public class EtudiantController {

    @Autowired
    IEtudiantService etudiantService;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Exam 5 root";
    }

    @PostMapping("/ajouter-etudiant")
    @ResponseBody
    public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.ajouterEtudiant(etudiant);
    }

}
