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
public class Humain extends Mammifière {

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Humain() {
        
    }

    public Humain(String nom) {
     
        this.nom = nom;
        this.age = 1L;
    }

    public Humain(String nom, long age) {

        this.nom = nom;
        this.age = age;
    }

    @Override
    public void afficher() {
        System.out.println("Vous êtes dans l'espèce Humain. Le nom est " + this.getNom() + ". L'age est " + this.getAge());
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void allaiter() {
        System.out.println("J' allaite mon bébé à la naissance");
        //throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public long calculerAge(int annee, int mois, int jour) {
        return super.calculerAge(annee, mois, jour);
    }

}
