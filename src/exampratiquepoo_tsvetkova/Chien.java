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
public class Chien extends Animal{

    public Chien() {
    }

    public Chien(String nom, String nomPropriétaire) {
        super(nom, nomPropriétaire);
    }

    public Chien(String nom) {
        super(nom);
    }

    public Chien(String nom, long age) {
        super(nom, age);
    }

    public Chien(String nom, long age, String nomPropriétaire) {
        super(nom, age, nomPropriétaire);
    }

    @Override
    public void afficher() {
        System.out.println("Chien : ");
        super.afficher(); 
        System.out.println("Le propriètaire est : " + getNomPropriétaire());
    }
    
    
}
