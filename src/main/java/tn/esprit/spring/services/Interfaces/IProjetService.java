package tn.esprit.spring.services.Interfaces;

import tn.esprit.spring.entities.Projet;

public interface IProjetService {
    void ajouterProjet(Projet projet);
    void affecterEtudiantProjet(int idProjet, int idEtudiant);
}
