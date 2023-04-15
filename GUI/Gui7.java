package GUI;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui7 extends JFrame{
    //Constantes y componentes (objeto)
    public Gui7(){
        super("Ventana/Herencia");
        setLayout(new BorderLayout(5,10));
        add(new JButton("1"),BorderLayout.EAST);
        add(new JButton("2"),BorderLayout.SOUTH);
        add(new JButton("3"),BorderLayout.WEST);
        add(new JButton("4"),BorderLayout.NORTH);
        add(new JButton("5"),BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
        //Establece que el boton de cerarr permitirá salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
