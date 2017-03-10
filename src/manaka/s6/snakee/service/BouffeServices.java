/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.service;

import java.awt.Dimension;
import java.util.Random;
import manaka.s6.snakee.classe.Block;
import manaka.s6.snakee.classe.Bouffe;
import manaka.s6.snakee.classe.Localisation;
import manaka.s6.snakee.utils.Utils;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class BouffeServices {
    public static Bouffe generateKaly(Localisation lastPlace, Dimension dimension, int taille){
        int x = Utils.toMultiple10(new Random().nextInt(dimension.width));
        int y = Utils.toMultiple10(new Random().nextInt(dimension.height));
        if((x%(taille)) !=0 || (y%(taille)) !=0) return BouffeServices.generateKaly(lastPlace, dimension,taille);
            Bouffe xbouffe = new Bouffe(x,y);
        if(xbouffe.isSimilar(lastPlace) || xbouffe.anyIvelany(dimension)) return BouffeServices.generateKaly(lastPlace, dimension,taille);
        
        int valeur = new Random().nextInt(9);
        xbouffe.setValeur(valeur);
        xbouffe.setTaille(taille);
        
        return xbouffe;
    }
    
    
}
