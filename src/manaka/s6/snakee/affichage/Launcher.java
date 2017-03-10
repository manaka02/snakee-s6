/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.affichage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import manaka.s6.snakee.classe.Block;
import manaka.s6.snakee.classe.Snakee;
import manaka.s6.snakee.service.SnakeeServices;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Launcher{
    
    public static void main(String[] lanch){
        
        Snakee snake = SnakeeServices.createSnakee(8,1);

        Plateform plateform = new Plateform(snake,200,200);
        new Thread(plateform).start();
        FenetreA f = new FenetreA(plateform);
        f.setVisible(true);
        f.pack();
    }

    
}
