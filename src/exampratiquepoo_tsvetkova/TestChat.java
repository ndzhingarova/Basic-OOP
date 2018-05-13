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
public class TestChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chat chat1 = new Chat("Mimi", "Teodora");
        chat1.calculerAge(2005, 7, 2);
        chat1.afficher();
        chat1.allaiter();
    }
    
}
