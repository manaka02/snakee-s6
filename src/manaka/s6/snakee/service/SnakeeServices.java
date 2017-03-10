/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.service;

import java.awt.Dimension;
import java.util.ArrayList;
import manaka.s6.snakee.classe.Block;
import manaka.s6.snakee.classe.Bouffe;
import manaka.s6.snakee.classe.Direction;
import manaka.s6.snakee.classe.Localisation;
import manaka.s6.snakee.classe.Snakee;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class SnakeeServices {
    public static Snakee createSnakee(int nbrCorps,int taille){
        Snakee snake = new Snakee();
        snake.setTaille(taille*10);
        Block tetePoint = new Block(snake.getTaille()*(nbrCorps+1), snake.getTaille());
        snake.setCorps(new ArrayList<Block>());
        snake.setTete(tetePoint);
        for (int i = 0; i < nbrCorps; i++) {
            Block blockTemp = new Block(tetePoint.getX() - (snake.getTaille()*(i+1)),tetePoint.getY());
            snake.getCorps().add(blockTemp);
        }
        snake.setDirection(Direction.DROITE);
        return snake;
    }
    
    //azo le kaly d mamorona vao2
    public static void nanjedaka(Snakee snake, Bouffe bouffe){
        for (int i = 0; i < bouffe.getValeur(); i++) {
            SnakeeServices.manampyRambo(snake);
        }
    }
        
    public static void manampyRambo(Snakee snake){
        int corpsLongueur = snake.getCorps().size()-1;
        int x = snake.getCorps().get(corpsLongueur).getX();
        int y = snake.getCorps().get(corpsLongueur).getY();
        Block newCorps = new Block(x, y);
        switch(snake.getDirection()){
            case(Direction.GAUCHE):
                newCorps.setX(newCorps.getX()+snake.getTaille());
                break;
            case(Direction.HAUT):
                newCorps.setY(newCorps.getY()+snake.getTaille());
                break;
            case(Direction.DROITE):
                newCorps.setX(newCorps.getX()-snake.getTaille());
                break;
            case(Direction.BAS):
                newCorps.setY(newCorps.getY()-snake.getTaille());
                break;
        }
        snake.getCorps().add(newCorps);
    }
    
    
    public static boolean naitaKaly(Snakee snake, Bouffe bouffe){
        if(snake.getTete().isSimilar(bouffe)) return true;
        return false;
    }
}
