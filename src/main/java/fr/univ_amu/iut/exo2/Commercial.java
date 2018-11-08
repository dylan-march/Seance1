package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Commercial extends Employe{

    protected double base;
    protected double chiffreAffaires;
    protected double tauxCommission;
    protected double salaireBrut;

    public Commercial(String nom, String prenom, int numEmploye, int numSecu, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche) {
        super(nom, prenom, numEmploye, numSecu, echelon, dateNaissance, dateEmbauche);
    }

    public void NegocierTransactions() {
        System.out.println("Je négocie un produit");
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public void setSalaireBrut(double base, double chiffreAffaires, double tauxCommission) {
        this.salaireBrut = base + chiffreAffaires + tauxCommission;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }
}
