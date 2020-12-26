package tn.esprit.spring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int refProjet;

    private String nomProjet;

    @ManyToMany
    private List<Etudiant> etudiants;

    public Projet() {
    }

    public Projet(int refProjet, String nomProjet, List<Etudiant> etudiants) {
        this.refProjet = refProjet;
        this.nomProjet = nomProjet;
        this.etudiants = etudiants;
    }

    public Projet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public int getRefProjet() {
        return refProjet;
    }

    public void setRefProjet(int refProjet) {
        this.refProjet = refProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
