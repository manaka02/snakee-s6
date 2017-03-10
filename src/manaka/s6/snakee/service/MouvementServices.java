/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.service;

import java.awt.Dimension;
import manaka.s6.snakee.classe.Block;
import manaka.s6.snakee.classe.Direction;
import manaka.s6.snakee.classe.Snakee;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class MouvementServices {
    
    public static void avancer(Snakee snake){
        short direction = snake.getDirection();
        
        int x = snake.getTete().getX() + 0;
        int y = snake.getTete().getY() + 0;
        Block precedent = new Block(x, y);
        switch(snake.getDirection()){
            case Direction.HAUT:
                snake.getTete().setY(snake.getTete().getY()-snake.getTaille());
                break;
            case Direction.BAS:
                snake.getTete().setY(snake.getTete().getY()+snake.getTaille());
                break;
            case Direction.GAUCHE:
                snake.getTete().setX(snake.getTete().getX()-snake.getTaille());
                break;
            case Direction.DROITE:
                snake.getTete().setX(snake.getTete().getX()+snake.getTaille());
                break;
        }
        
        for (int i = 0; i < snake.getCorps().size(); i++) {
            Block temporaire = new Block(snake.getCorps().get(i).getX(),snake.getCorps().get(i).getY());
            snake.getCorps().get(i).changePlace(precedent);
            precedent = temporaire;
        }
    }
    
    public static boolean midonaAmTenany(Snakee snake){
        for (int i = 0; i < snake.getCorps().size(); i++) {
            if(snake.getTete().isSimilar(snake.getCorps().get(i))){
                return true;
            }
        }
        return false;
    }
    
}
