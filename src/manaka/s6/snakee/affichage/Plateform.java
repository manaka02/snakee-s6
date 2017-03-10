/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.affichage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import manaka.s6.snakee.classe.Bouffe;
import manaka.s6.snakee.classe.Localisation;
import manaka.s6.snakee.classe.Snakee;
import manaka.s6.snakee.listener.DirectionListener;
import manaka.s6.snakee.service.BouffeServices;
import manaka.s6.snakee.service.MouvementServices;
import manaka.s6.snakee.service.SnakeeServices;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Plateform extends javax.swing.JPanel implements Runnable{
    private Snakee snake;
    private Bouffe bouffe;
    private boolean tsyMidona = true;
    private int xActuel=0;
    private Dimension dimension;
    private int vitesse = 200;
    /**
     * Creates new form Plateform
     */
    public Plateform(Snakee snake, int maxX, int maxY) {
        this.snake = snake;
        this.dimension = new Dimension(maxX, maxY);
        bouffe = BouffeServices.generateKaly(new Localisation(10,10), this.dimension, snake.getTaille());
        initComponents();
        this.setPreferredSize(dimension);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        System.out.println("Commencement");   
        while (true) {          
            try {
                if(SnakeeServices.naitaKaly(snake, bouffe)){
                    SnakeeServices.nanjedaka(snake, bouffe);
                    bouffe = BouffeServices.generateKaly(bouffe, dimension, snake.getTaille());
                }
                checkMidona();
                Thread.sleep(500 - vitesse);
                if(tsyMidona){
                    MouvementServices.avancer(snake);
                    
                    this.repaint();
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Plateform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        snake.paintSnake(g);
        bouffe.paintKaly(g);
        
    }
    
    private void checkMidona() {
        if(snake.getTete().anyIvelany(dimension) || MouvementServices.midonaAmTenany(snake)){
            tsyMidona = false;
        }
    }

    public Snakee getSnake() {
        return snake;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    
    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    public void setSnake(Snakee snake) {
        this.snake = snake;
    }

    public Bouffe getBouffe() {
        return bouffe;
    }

    public void setBouffe(Bouffe bouffe) {
        this.bouffe = bouffe;
    }

    public boolean isTsyMidona() {
        return tsyMidona;
    }

    public void setTsyMidona(boolean tsyMidona) {
        this.tsyMidona = tsyMidona;
    }

    

    public int getxActuel() {
        return xActuel;
    }

    public void setxActuel(int xActuel) {
        this.xActuel = xActuel;
    }


    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}