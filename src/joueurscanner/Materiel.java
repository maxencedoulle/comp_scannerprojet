/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.awt.Color;

/**
 *
 * @author Formation
 */
public class Materiel implements Ressource{
    
    private String NomduMateriel;
    private String jeux;

    public Materiel(String NomduMateriel) {
        this.NomduMateriel = NomduMateriel;
    }

    public String getNomduMateriel() {
        return NomduMateriel;
    }

    @Override
    public String getJeux() {
        return jeux;
    }

    @Override
    public void setjeux(String jeux) {
        this.jeux = jeux;
    }

    @Override
    public Color getCouleur() {
        return Color.MAGENTA;
    }
    
    
    
    
}
