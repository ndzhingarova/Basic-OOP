/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampratiquepoo_tsvetkova;

import java.util.ArrayList;

/**
 *
 * @author usager
 */
public class DemoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal demo1[] = new Animal[10];
        String nomAnimal[] = {"Topsi", "Mimi", "Bibi", "Didi", "Toni", "Vani", "Jani", "Pepi", "Toshi", "Titi"};
        String nomPropr[] = {"Nikoleta", "Teodora", "Asen", "Emil", "Ivan", "Stefka", "Totio", "Tanq", "Iordanka", "Nikolai"};
//        for (int i = 0; i < demo1.length; i++) {
//            if (i % 2 == 0) {
//                demo1[i] = new Chat(nomAnimal[i], nomPropr[i]);
//            } else {
//                demo1[i] = new Chien(nomAnimal[i], nomPropr[i]);
//            }
//            System.out.println("Vous êtes en train de créer un animal. Donnez s'il vous plaît son date de naissance");
//            int annee = Saisie.lire_int("Entrez l'annee de naissance : ");
//            int mois = Saisie.lire_int("Entrez le mois de naissance : ");
//            int jour = Saisie.lire_int("Entrez le jour de naissance : ");
//            demo1[i].calculerAge(annee, mois, jour);
//        }
//        for (Animal a : demo1) {
//            a.afficher();
//        }
//        for (Animal a : demo1) {
//            a.allaiter();
//        }

        ArrayList<Mammifière> listMammifière = new ArrayList<>();
        for (int i = demo1.length - 1; i > -1; i--) {
            if (i > 4) {
                if (i % 2 == 0) {
                    listMammifière.add(new Chat(nomAnimal[i], nomPropr[i]));
                } else {
                    listMammifière.add(new Chien(nomAnimal[i], nomPropr[i]));
                }
            } else {
                listMammifière.add(new Humain(nomPropr[i]));
            }
//            System.out.println("Vous êtes en train de créer un Mammifière. Donnez s'il vous plaît son date de naissance");
//            int annee = Saisie.lire_int("Entrez l'annee de naissance : ");
//            int mois = Saisie.lire_int("Entrez le mois de naissance : ");
//            int jour = Saisie.lire_int("Entrez le jour de naissance : ");
//            demo1[i].calculerAge(annee, mois, jour);
        }

        for (Mammifière a : listMammifière) {
            if (a instanceof Humain) {
                    ((Humain)a).afficher();
            } else {
                ((Animal)a).afficher();
            }
        }

    }

}
