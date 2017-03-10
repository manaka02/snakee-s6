/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.classe;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Bouffe extends Block{
    
    private int valeur;
    
    public Bouffe(int x, int y) {
        super(x, y);
    }

    public Bouffe(int valeur, int x, int y) throws Exception {
        super(x, y);
        if(x == 0 || y==0) throw new Exception ("point sur les bords");
        this.valeur = valeur;
    }
    
    public void paintKaly(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.getX(), this.getY(), this.getTaille(), this.getTaille());
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
    
    
    
    
    
    
}
