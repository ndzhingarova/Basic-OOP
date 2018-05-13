/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampratiquepoo_tsvetkova;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author Salahudine
 */
/*
 La classe saisie fournit huit methodes static qui permetttent de transferer
  depuis le clavier vers l'unite centrale
*/
public class Saisie {
    // Sert à tramsmettre une chaine de caractere tapé au clavier vers la memoire centrale
    public static String lire_String(){
      String lign_lue = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader  br = new BufferedReader(isr);
            lign_lue = br.readLine();
        } catch (Exception e) {
        }
        return lign_lue;
    }
    //Sert à afficher tout d'abord à l'ecran le message désigné par la variable question, puis à tramsmettre une chaine de caractere tapé au clavier vers la memoire centrale
    public static String lire_String(String question){
       System.out.println(question);
       return(lire_String());
    }
   // à transmettre un nombre entier de type int  tapé au clavier vers la memoire centrale
    public static int lire_int(){
     return Integer.parseInt(lire_String());
    }
    //Sert à afficher tout d'abord à l'ecran le message désigné par la variable question, puis à transmettre le nombre entier tapé par l'utilisateutr au clavier vers la memoire centrale
     public static int lire_int(String question){
     return Integer.parseInt(lire_String(question));
    }
      // à transmettre un nombre decimal de type double  tapé au clavier vers la memoire centrale
     public static double lire_double(){
    return  Double.parseDouble(lire_String());
    }
     //Sert à afficher tout d'abord à l'ecran le message désigné par la variable question, puis à transmettre le nombre decimal tapé par l'utilisateutr au clavier vers la memoire centrale
    public static double lire_double(String question){
    return  Double.parseDouble(lire_String(question));
    }
    //Sert à transmettre l'information tapee au clavier - dans le cas ou cette information est un unique caractere - vers la memoire centrale
    public static char lire_char(){
        String reponse = lire_String();
        return reponse.charAt(0);
    }
    //Sert à afficher tout d'abord à l'ecran le message désigné par la variable question,puis à transmettre le caracter tapé par l'utilisateutr au clavier vers la memoire centrale
    public static char lire_char(String question){
        System.out.println(question);
        String reponse = lire_String();
        return reponse.charAt(0);
    }
  

}
