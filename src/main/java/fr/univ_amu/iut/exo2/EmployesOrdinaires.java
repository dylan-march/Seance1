package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class EmployesOrdinaires extends Employe{

    protected double base;
    protected double nbHeures;
    protected int echelon;
    protected double salaireBrut;

    public EmployesOrdinaires(String nom, String prenom, int numEmploye, int numSecu, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche) {
        super(nom, prenom, numEmploye, numSecu, echelon, dateNaissance, dateEmbauche);
    }

    public void effectuerTacheOrdinaire() {
        System.out.println("J'effectue une tache ordinaire");
    }

    public void setSalaireBrut(double base, double nbHeures, double echelon) {
        this.salaireBrut = base*nbHeures+echelon*100;
    }

}
