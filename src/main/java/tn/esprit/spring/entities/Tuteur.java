package tn.esprit.spring.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tuteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTuteur;

    private String nomTuteur;

    @OneToOne
    private Etudiant etudiant;

    public Tuteur() {
    }

    public Tuteur(int idTuteur, String nomTuteur, Etudiant etudiant) {
        this.idTuteur = idTuteur;
        this.nomTuteur = nomTuteur;
        this.etudiant = etudiant;
    }

    public Tuteur(String nomTuteur, Etudiant etudiant) {
        this.nomTuteur = nomTuteur;
        this.etudiant = etudiant;
    }

    public int getIdTuteur() {
        return idTuteur;
    }

    public void setIdTuteur(int idTuteur) {
        this.idTuteur = idTuteur;
    }

    public String getNomTuteur() {
        return nomTuteur;
    }

    public void setNomTuteur(String nomTuteur) {
        this.nomTuteur = nomTuteur;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
