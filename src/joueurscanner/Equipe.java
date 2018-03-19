/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author Formation
 */
public class Equipe implements Ressource{
    private String Nom ;
    private List<Joueur> ListeJoueurs;
    private String Jeux;

    public Equipe(String Nom, List<Joueur> ListeJoueurs) {
        this.Nom = Nom;
        this.ListeJoueurs = ListeJoueurs;
    }
    public String getNom() {
        return Nom;
    }
    public List<Joueur> getListeJoueurs() {
        return ListeJoueurs;
    }
    @Override // Permet de faire une surcharge
    public String getJeux() {
        return Jeux;
    }
    @Override // Permet de faire une surcharge 
    public void setjeux(String jeux) {
        this.Jeux = jeux;
    }
    @Override // Permet de faire une surcharge
    public Color getCouleur() {
        return Color.magenta;
    }
    
    
}