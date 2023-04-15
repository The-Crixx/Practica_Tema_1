package GUI;
import java.awt.GridLayout;
import javax.swing.*;

public class Gui6 extends JFrame{
    public Gui6(){
        super("Ventana/Herencia");
        getContentPane().setLayout(new GridLayout(4,3,5,5));
        for(int i=1;i<=10;i++)
            add(new JButton(Integer.toString(i)));
        setLocationRelativeTo(null);//La ventama se posiciona al centro de la pantalla
        //Establece que el boton de cerrar permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();//Presenta una con el tamaño necesario para mostrar los componentes que hay en ella
        setVisible(true);
    }
}
