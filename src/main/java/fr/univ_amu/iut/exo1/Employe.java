package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {
    private String nom;
    private String prenom;
    private int numEmploye;
    private int numSecu;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double salaireBrut;
    private double salaireNet;

    public Employe(String nom, String prenom, int numEmploye, int numSecu, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche) {
        this.nom = nom;
        this.prenom = prenom;
        this.numEmploye = numEmploye;
        this.numSecu = numSecu;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaireBrut = salaireBrut;
        this.salaireNet = salaireNet;
    }

    public int getNumEmploye() {
        return numEmploye;
    }

    public void setNumEmploye(int numEmploye) {
        this.numEmploye = numEmploye;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(int numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }


    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double base, double nbHeures) {
        this.salaireBrut = base*nbHeures;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public void setSalaireNet(double salaireBrut) {
        this.salaireNet = salaireBrut*0.8;
    }
}

