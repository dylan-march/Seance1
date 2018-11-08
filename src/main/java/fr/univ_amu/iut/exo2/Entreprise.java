package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList <Employe> employes=new ArrayList<>();

    public Entreprise(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public void addEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public String toString() {
        String s = "Entreprise";
        for (Employe employe: employes) {
            s +=" nom='" + employe.getNom() + '\'' +
                    ", salaire=" + employe.getSalaireNet();
        }
        return s;

    }
}
