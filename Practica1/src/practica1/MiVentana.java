/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author a21cristinaaf
 */
public class MiVentana extends JFrame {

    JPanel este;
    JPanel oeste;
    JPanel sur;

    public MiVentana() {
        super("Colores");

        este= new JPanel();
        oeste= new JPanel();
        oeste.setBackground(Color.gray);
        oeste.setLayout(new GridLayout(rows:1, cols:3);
        sur = new JPanel();
        este.setBackground(Color.red);
        
        this.add(este, BorderLayout.EAST);
        this.add(oeste, BorderLayout.WEST);
        this.add(sur, BorderLayout.SOUTH);
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public class JScrollBar extends javax.swing.JScrollBar{
    
    BorderLayout barraDes= new BorderLayout(1, 3);
    
}

}
