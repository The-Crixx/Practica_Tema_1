package GUI;
import javax.swing.JFrame;

public class Gui2 {
    
    public Gui2(){
        JFrame frame=new JFrame("Ventana sin herencia");
        /*Configurar componentes
        y añadirlos al panel del frame*/
        frame.setSize(370,470);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
