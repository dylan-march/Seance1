package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Technicien extends Employe{
    protected double base;
    protected double nbHeures;
    protected int nbUnitesProduites;
    protected double TauxCommissionUnite;
    protected double salaireBrut;
    public Technicien(String nom, String prenom, int numEmploye, int numSecu, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche) {
        super(nom, prenom, numEmploye, numSecu, echelon, dateNaissance, dateEmbauche);
    }

    public void fabriquerProduit() {
        System.out.println("Je fabrique un produit");
    }

    public void setSalaireBrut (double base, double nbHeures, int nbUnitesProduites, double TauxCommissionUnite) {
        this.salaireBrut = base*nbHeures + nbUnitesProduites*TauxCommissionUnite;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }
}
