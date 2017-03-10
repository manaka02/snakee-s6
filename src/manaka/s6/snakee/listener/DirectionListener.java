/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import manaka.s6.snakee.affichage.Plateform;
import manaka.s6.snakee.classe.Direction;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class DirectionListener implements KeyListener{
    private Plateform plateform;

    public DirectionListener(Plateform plateform) {
        this.plateform = plateform;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){ 
            case(KeyEvent.VK_UP):
                if(this.plateform.getSnake().getDirection() != Direction.BAS)this.plateform.getSnake().setDirection(Direction.HAUT);
                break;
            case(KeyEvent.VK_DOWN):
                if(this.plateform.getSnake().getDirection() != Direction.HAUT)this.plateform.getSnake().setDirection(Direction.BAS);
                break;
            case(KeyEvent.VK_LEFT):
                if(this.plateform.getSnake().getDirection() != Direction.DROITE)this.plateform.getSnake().setDirection(Direction.GAUCHE);
                break;
            case(KeyEvent.VK_RIGHT):
                if(this.plateform.getSnake().getDirection() != Direction.GAUCHE)this.plateform.getSnake().setDirection(Direction.DROITE);
                break;
            
        }
               
            
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
    
}
