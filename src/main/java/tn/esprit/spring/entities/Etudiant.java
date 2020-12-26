package tn.esprit.spring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;

    private String login;

    private String password;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @OneToOne(mappedBy = "etudiant")
    private Tuteur tuteur;

    @ManyToMany(mappedBy = "etudiants")
    private List<Projet> projets;

    public Etudiant() {
    }

    public Etudiant(int idEtudiant, String login, String password, Specialite specialite, Tuteur tuteur, List<Projet> projets) {
        this.idEtudiant = idEtudiant;
        this.login = login;
        this.password = password;
        this.specialite = specialite;
        this.tuteur = tuteur;
        this.projets = projets;
    }

    public Etudiant(String login, String password, Specialite specialite) {
        this.login = login;
        this.password = password;
        this.specialite = specialite;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteur tuteur) {
        this.tuteur = tuteur;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }
}
