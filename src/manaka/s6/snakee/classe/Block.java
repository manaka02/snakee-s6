/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.classe;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Block extends Localisation{
    
    private int taille;
    
    public Block(int x, int y) {
        super(x, y);
    }
    
    public void changePlace(Localisation newPlace){
        this.setX(newPlace.getX());
        this.setY(newPlace.getY());
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    
    
}
