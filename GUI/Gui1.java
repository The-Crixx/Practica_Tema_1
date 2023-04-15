package GUI;
import javax.swing.JFrame;

public class Gui1 extends JFrame{
    public Gui1(){
        super("Ventana Usando Herencia");//Establece el titulo de la ventana
        setSize(370,450);//Establece el tamaño de la ventana
        setLocationRelativeTo(null);//La ventana se proporciona al centro de la pantalla
        //Establece el boton que permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//Establece que el tamaño de la pantalla no se puede cambiar
        setVisible(true);
    }
}
