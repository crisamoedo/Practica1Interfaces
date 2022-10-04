import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;



public class colores_SinFuncionalidad extends interfaz_colores {
		//Constructor al que se le añade posteriormente la funcionalidad		
    colores_SinFuncionalidad(){
			super();
			
            }
					
			

	    public static void main(String[] args) {
	        // TODO code application logic here
	        colores_SinFuncionalidad micolor = new colores_SinFuncionalidad();
	       
	      
		      
	        
	        micolor.setTitle("Colores");
	        micolor.setSize(new Dimension(700, 620));
	        micolor.setMinimumSize(new Dimension(320, 200));
	        micolor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        micolor.setVisible(true);
	    }

	    
	    //M�todo que convierte un color de tipo String en un objeto de tipo Color
	    public Color devolverColor(String colortexto) {
			int i;
			for (int j=0;j<listaColores.length;j++)
				if (colortexto.equals(textoColor[j]))
					return listaColores[j];
			return Color.BLACK;
		}
	    
	   

	}