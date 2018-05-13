/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampratiquepoo_tsvetkova;

/**
 *
 * @author usager
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal("Topsi");
        int annee = Saisie.lire_int("Entrez l'annee de naissance : ");
        int mois = Saisie.lire_int("Entrez le mois de naissance : ");
        int jour = Saisie.lire_int("Entrez le jour de naissance : ");
        a1.calculerAge(annee, mois, jour);
        a1.afficher();
        a1.allaiter();
    }
    
}
