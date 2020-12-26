package tn.esprit.spring.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Etudiant;
import tn.esprit.spring.entities.Projet;
import tn.esprit.spring.repository.IEtudiantRepository;
import tn.esprit.spring.repository.IProjetRepository;
import tn.esprit.spring.services.Interfaces.IProjetService;

@Service
public class ProjetServiceImpl implements IProjetService {

    @Autowired
    IProjetRepository projetRepository;

    @Autowired
    IEtudiantRepository etudiantRepository;

    @Override
    public void ajouterProjet(Projet projet) {
        projetRepository.save(projet);
    }

    public void affecterEtudiantProjet(int idProjet, int idEtudiant) {
        Projet projet = projetRepository.findById(idProjet).get().getEtudiants().add(idEtudiant);
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).get();
        projet.getEtudiants().add(etudiant);


    }
}
