/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author a21cristinaaf
 */
public class Operacion extends JFrame implements ActionListener {
    
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JTextField caja1;
    JTextField caja2;
    
    public Operacion(){
        
        boton1= new JButton("Número 1");
        boton2= new JButton("Número 2");
        boton3=new JButton("Calcular");
        boton4 = new JButton("Púlsame");
        caja1 = new JTextField(20);
        caja2 = new JTextField(20);
        
         setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");

    }
    
    public static void main(String[] args) {
        
        Operacion calculadora= new Operacion();
        calculadora.setVisible(true);
        
    }
}
