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
public class Chat extends Animal{

    public Chat() {
    }

    public Chat(String nom, String nomPropriétaire) {
        super(nom, nomPropriétaire);
    }

    public Chat(String nom) {
        super(nom);
    }

    public Chat(String nom, long age) {
        super(nom, age);
    }

    public Chat(String nom, long age, String nomPropriétaire) {
        super(nom, age, nomPropriétaire);
    }

    @Override
    public void afficher() {
        System.out.println("Chat : ");
        super.afficher(); 
        System.out.println("Le propriètaire est : " + getNomPropriétaire());
    }

    
    
    
}
