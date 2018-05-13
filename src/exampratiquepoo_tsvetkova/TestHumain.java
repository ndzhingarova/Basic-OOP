/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampratiquepoo_tsvetkova;

import java.time.LocalDateTime;

/**
 *
 * @author usager
 */
public class TestHumain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(LocalDateTime.now());
        Humain h1 = new Humain("Emil");
        int annee = Saisie.lire_int("Entrez l'annee de naissance : ");
        int mois = Saisie.lire_int("Entrez le mois de naissance : ");
        int jour = Saisie.lire_int("Entrez le jour de naissance : ");
        h1.calculerAge(annee, mois, jour);
        h1.afficher();
        h1.allaiter();
    }
    
}
