package GUI;
import java.awt.Container;
import javax.swing.*;

public class Gui3 extends JFrame{
    private Container panel;
    private JButton miboton;
    
    public Gui3(){
        super("Ventana/Herencia");//Establece el titulo de la ventana
        //COnfigurar componenetes
        miboton=new JButton("Aceptar");
        panel=getContentPane();
        panel.add(miboton);
        setSize(200,200);//Establece el tamaño de la ventana
        setLocationRelativeTo(null);/*la ventana se posiciona en el centro de la pantalla
        establece el boton cerrar que permitira salir de la aplicacion*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//Establece que el tamaño de la pantalla no puede cambiar
        setVisible(true);
    }
}
