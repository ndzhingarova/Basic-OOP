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
public class TestChien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chien chien1 = new Chien("Sharo", "Nikoleta");
        chien1.calculerAge(2007, 9, 18);
        chien1.afficher();
        chien1.allaiter();
    }
    
}
