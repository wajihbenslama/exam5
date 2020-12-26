package tn.esprit.spring.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Etudiant;
import tn.esprit.spring.repository.IEtudiantRepository;
import tn.esprit.spring.services.Interfaces.IEtudiantService;

@Service
public class EtudiantServiceImpl implements IEtudiantService {

    @Autowired
    IEtudiantRepository etudiantRepository;

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }
}
