/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class JoueurScanner {
 private static Scanner sc = new Scanner(System.in); // NE PAS OUBLIE CA 
 private static List<JoueurFoot> ListeJoueurFoot = new ArrayList<> ();
 private static List<JoueurHandball> ListJoueurHandball = new ArrayList<> ();
 private static List <JoueurRugby> ListJoueurRugby = new ArrayList<> ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       try {
        
           // int nbJoueur =0;
           int typeJoueur =0;
           String valeur ="";
           
           List <Joueur> ListeJoueur = new ArrayList <Joueur> ();
           
           do {
               System.out.println(" Saisir le type joueur (1,2 ou 3) ou 0 = fin :");
               while (!sc.hasNextInt()) {
                   System.out.println(" Saisir le type joueur (1,2 ou 3) ou 0 = fin :");
                   sc.next();
               }
               valeur = sc.next();
               typeJoueur = Integer.parseInt(valeur);
               switch (typeJoueur)
               {
                   case 1 : saisir_joueur(ListeJoueur, new JoueurFoot());
                   break;
                   case 2 : saisir_joueur(ListeJoueur, new JoueurRugby());
                   break;
                   case 3 : saisir_joueur(ListeJoueur, new JoueurHandball());
                   break;
                   case 0 : typeJoueur = 0;
                   break;
               }
               
           }while(typeJoueur != 0);
           TrieEquipe(ListeJoueur);
   
           
           
           
        
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       } 
    }
    /**
     * 
     * @param ListeJoueurs
     * <b>Toutes les exceptions seront gérées dans le main.</b>
     * <i>On saisit toutes les données du joueur et on contrôle la saisie</i>
     * @throws Exception 
     */
    public static void saisir_joueur(List<Joueur> ListeJoueurs, Joueur oj) throws Exception // THROWS : APPEL D'UNE EXEPTION 
    {
         String temp="";
         int valtemp=0;
           //Joueur oj = new Joueur();
           System.out.println(" Saisir le nom : ");
           oj.setNom(setClavier(temp));
           System.out.println(" Saisir le prénom :");
           oj.setPrenom(setClavier(temp));
           System.out.println(" Saisir votre Pseudo :");
           oj.setPseudo(setClavier(temp));
           System.out.println(" Saisir votre mot de passe ");
           temp = setClavier(temp);
           if(temp.length() >2)           
               oj.setMdp(temp);
           else
               throw new Exception("La taille du MTP est inférieure à 2 !");
            System.out.println(" Saisir votre âge ");
           valtemp = setClavier(valtemp);
           if(valtemp > 12)
           {
               oj.setAge(valtemp);
           }
           else
               throw new Exception("L'âge est inférieur à 12 !");
           System.out.println(" Saisir votre Genre : ");
           temp = setClavier(temp);
           if (temp.equalsIgnoreCase("M"))
           {
               oj.setGenre(Genre.M);
           }
           else {
               if (temp.equalsIgnoreCase("F"))  
               {
                   oj.setGenre(Genre.F);
               }
               else
               {
                   throw new Exception("Le genre est invalide !");
               }
           }

           ListeJoueurs.add(oj);
    }
    
    public static String setClavier(String temp)
    {
        temp = sc.next();
        return temp;
    }
     public static int setClavier(int temp)
    {
         if (sc.hasNextInt()) {
               temp = sc.nextInt();
           }

        return temp;
    }
    
   //   Méthodes des listes 
     public static void TrieEquipe (List<Joueur> ListeJoueurs) {
         for (Joueur oj : ListeJoueurs) {
             if (oj instanceof JoueurFoot) {
                 ListeJoueurFoot.add((JoueurFoot) oj);
             }
             if (oj instanceof JoueurHandball) {
                 ListJoueurHandball.add((JoueurHandball) oj);
             }
             if (oj instanceof JoueurRugby) {
                 ListJoueurRugby.add((JoueurRugby) oj);
             }
         }
         System.out.println(" Joueur de foot :");
         for (Joueur oj: ListeJoueurFoot){
             System.out.println("\n Nom : " + oj.getNom()
                     + "\n Prenom : " + oj.getPrenom()
                     + "\n Age : " + oj.getAge()
                     + "\n Pseudo :" + oj.getPseudo());
         }
         System.out.println("\n");
                 
         System.out.println(" Joueur de Rugby : ");
         for (Joueur oj: ListJoueurRugby) {
             System.out.println("\n Nom : " + oj.getNom() 
                     + "\n Prenom : " + oj.getPrenom() 
                     + "\n Age : " + oj.getAge() 
                     + "\n Pseudo : " + oj.getPseudo());
         }
         System.out.println("\n");
         System.out.println(" Joueur de Handball : ");
         for (Joueur oj : ListJoueurHandball) {
             System.out.println("\n Nom : " + oj.getNom() 
                     + "\n Prenom : " + oj.getPrenom() 
                     + "\n Age : " + oj.getAge() 
                     + "\n Pseudo : " + oj.getPseudo());
         }
     } 
     
     public static Equipe CreerEquipe (List<Joueur> ListJoueurs) {
        String Nom;
         System.out.println(" Saisir le nom de l'équipe");
         Nom = sc.next();
         
         Equipe OEquipe = new Equipe(Nom, ListJoueurs);
         return OEquipe;
    }
     
     }
//}
