package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------


    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelResultado()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
        
    }
}