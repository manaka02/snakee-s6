/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.classe;

import java.awt.Dimension;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Localisation{
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Localisation{" + "x=" + x + ", y=" + y + '}';
    }

    public Localisation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public boolean isSimilar(Localisation other){
        if(other.getX() == this.x && other.getY() == this.y) return true;
        
        return false;
    }
    
    public boolean anyIvelany(Dimension dimension){
        if(this.x <= 0 || this.y <= 0 || this.x >= dimension.width || this.x >= dimension.height){
            return true;
        }
        return false;
    }
    
}
