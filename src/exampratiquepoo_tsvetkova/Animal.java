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
public class Animal extends Mammifière {

    protected String nomPropriétaire;

    public Animal() {
        this.nom = "";
        this.age = 1L;
        this.nomPropriétaire = "";

    }

    public Animal(String nom, String nomPropriétaire) {
        this();
        this.nom = nom;
        this.nomPropriétaire = nomPropriétaire;
    }

    public Animal(String nom) {
        this();
        this.nom = nom;

    }

    public Animal(String nom, long age) {
        this();
        this.nom = nom;
        this.age = age;
    }
    
     public Animal(String nom, long age,String nomPropriétaire ) {
        this.nom = nom;
        this.age = age;
        this.nomPropriétaire = nomPropriétaire;
    }

    public String getNomPropriétaire() {
        return nomPropriétaire;
    }

    public void setNomPropriétaire(String nomPropriétaire) {
        this.nomPropriétaire = nomPropriétaire;
    }

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

    @Override
    public void afficher() {
        System.out.println("Vous êtes dans l'espèce Animal. Le nom est " + this.getNom() + ". L'age est " + this.getAge());
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long calculerAge(int annee, int mois, int jour) {
        return super.calculerAge(annee, mois, jour);
    }

    @Override
    public void allaiter() {
        System.out.println("J' allaite mon bébé à la naissance");
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
