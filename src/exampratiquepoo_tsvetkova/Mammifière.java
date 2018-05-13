/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampratiquepoo_tsvetkova;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author usager
 */
public abstract class Mammifière implements Allaitement{
        protected String nom;
        protected long age;

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

  
        
    public abstract void afficher();
    public  long calculerAge(int annee, int mois, int jour){
        LocalDate naissanceDate = LocalDate.of(annee, mois, jour);
        LocalDate currentDate = LocalDate.from(LocalDateTime.now());
        age = naissanceDate.until(currentDate, ChronoUnit.YEARS);
        return age;
              
    }
}
