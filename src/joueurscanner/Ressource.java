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
public interface Ressource {
    
    public String getJeux ();
    
    public void setjeux (String jeux); // Quel est la différence entre les méthodes et les Constructeur
    
    public Color getCouleur ();
}