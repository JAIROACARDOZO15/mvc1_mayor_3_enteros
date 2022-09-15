package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperacion extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------


    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelOperacion()
    {
         //Definir contenedor del panel
         this.setLayout(null);
         this.setBackground(Color.WHITE);
 
         //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Operaciones");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
    }
}