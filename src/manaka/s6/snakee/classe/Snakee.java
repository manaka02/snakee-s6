/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.classe;

import java.awt.Graphics;
import java.util.List;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Snakee {
    
    
    private Block tete;
    private List<Block> corps;
    private short direction = Direction.DROITE;
    private int taille;

    public Snakee() {
        
    }

    public void paintSnake(Graphics g){
        g.fillOval(tete.getX(), tete.getY(), this.taille, this.taille);
        for (int i = 0; i < corps.size(); i++) {
            g.fillOval(corps.get(i).getX(), corps.get(i).getY(), this.taille, this.taille);
        }

    }

    public Snakee(Block tete, List<Block> corps, int taille) {
        this.tete = tete;
        this.corps = corps;
        this.taille = taille;
    }
    
    
    
    public Snakee(Block tete, List<Block> corps) {
        this.tete = tete;
        this.corps = corps;
    }
    
    
    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    
    
    public Block getTete() {
        return tete;
    }

    public void setTete(Block tete) {
        this.tete = tete;
    }

    public List<Block> getCorps() {
        return corps;
    }

    public void setCorps(List<Block> corps) {
        this.corps = corps;
    }

    public short getDirection() {
        return direction;
    }

    public void setDirection(short direction) {
        this.direction = direction;
    }
    
    
}
