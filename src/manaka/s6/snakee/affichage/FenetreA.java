/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.s6.snakee.affichage;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class FenetreA extends JFrame{
    private JPanel plateform;
    private JPanel dashboard;
    private JPanel all;

    public FenetreA(JPanel plateform) {
        this.plateform = plateform;
        this.initComponents();
    }
    
    public void initComponents(){
        all = new JPanel();
        dashboard = new JPanel();
        dashboard.add(new JLabel("Score :"));
        all.setLayout(new BorderLayout());
        all.add(plateform,BorderLayout.NORTH);
        all.add(dashboard,BorderLayout.SOUTH);
        this.getContentPane().add(all);
    }
    
    
}
