package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class GestionEntreprises {
    public static void main(String[] args) {
        Entreprise maBoiteInfo = new Entreprise ("Entreprise corporation");

        Employe emploi = new Employe ("dylan", "march",1,2,1,LocalDate.of(1999,04,12),LocalDate.of(2018,12,11));
        Employe emploi2 = new Employe ("jean", "dupont",2,1,3,LocalDate.of(1998,04,12),LocalDate.of(2018,12,20));
        Employe emploi3 = new Employe ("Jean", "david",3,2,2,LocalDate.of(1997,04,12),LocalDate.of(2018,12,22));

        emploi.setSalaireBrut(1400, 4);
        emploi2.setSalaireBrut(1200, 2);
        emploi3.setSalaireBrut(1000, 6);

        emploi.setSalaireNet(1400);
        emploi2.setSalaireNet(1200);
        emploi3.setSalaireNet(1000);

        maBoiteInfo.addEmploye(emploi);
        maBoiteInfo.addEmploye(emploi2);
        maBoiteInfo.addEmploye(emploi3);


        System.out.println(maBoiteInfo.toString());
    }
}