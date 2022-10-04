/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaEventos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import sun.awt.AWTAccessor;

/**
 *
 * @author a21cristinaaf
 */
public class PruebaEventos extends JFrame implements ActionListener{
    //primero implementamos la interfaz
    
    public static void main(String[] args) {
        PruebaEventos prueba= new PruebaEventos();
        
        
        //hacemos visible la ventana

        prueba.setVisible(true);
        
    }

    JButton boton1;
    JButton boton2;
    JTextField cajaTexto;
    
    
    public PruebaEventos(){
        //creamos los objetos del botón y l caja de  texto
        boton1= new JButton("Rojo");
        boton2= new JButton("Azul");
        
        cajaTexto= new JTextField(20);
        //decimos donde queremos que aparezca en la ventana ya que por defecto aparece centrado
        this.setLayout(new FlowLayout());
        //añadimos estos objetos
        this.add(boton1);
        this.add(boton2);
        
        this.add(cajaTexto);
        //ponemos el botón  a  la escucha
        //si declaramos el boton y la caja en le main no podríamos hacer referencia con el this, habría que hacer un new
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        //damos tamaño a la ventana
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    //segundo sobreescrimos los métodos de esa interfaz
    public void actionPerformed(ActionEvent e) {
        //hacemos que la caja de texto coja el texto del botón
        cajaTexto.setText(e.getActionCommand());
        if (e.getSource() == boton1) {
            boton1.setBackground(Color.red);
            
        }else if (e.getSource() == boton2){
            boton2.setBackground(Color.blue);

        }
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }
    
    
    
}
