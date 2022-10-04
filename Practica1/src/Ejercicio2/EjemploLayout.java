/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author a21cristinaaf
 */
public class EjemploLayout {

    public static void main(String args[]) {

        JFrame f = new JFrame();
        
        Container contenedor = f.getContentPane();
        contenedor.setLayout(new GridBagLayout());
        
        JLabel inicio= new JLabel();
        JTextField cuadroTexto= new JTextField(30);
        JCheckBox texto = new JCheckBox("Estilo");
        JRadioButton radio= new JRadioButton("Tamaño");
        ((JPanel) contenedor).setBorder(BorderFactory.createTitledBorder("Introduce cualquier texto"));
        
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx=0;
        c.gridy=0;
        c.weightx = 0.4;
        c.weighty = 1.0;
        c.gridwidth = 3;
        c.gridheight = 1;
        contenedor.add(inicio,c);
        
        c.gridx=0;
        c.gridy=1;
        c.weightx = 0.4;
        c.weighty = 1.0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        contenedor.add(cuadroTexto,c);
        
        c.gridx=0;
        c.gridy=2;
        c.weightx = 0.4;
        c.weighty = 1.0;
        c.gridwidth = 1;
        c.gridheight = 2;

       contenedor.add(texto, c);

        c.gridx=2;
        c.gridy=2;
        c.weightx = 0.4;
        c.weighty = 1.0;
        c.gridwidth = 1;
        c.gridheight = 2;

        contenedor.add(radio,c);       

        f.setSize(220, 110);
        f.setTitle("Ventana tamaño fuente");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


