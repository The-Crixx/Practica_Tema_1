package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Encapsula el concepto de una ventana
public class Gui8 extends JFrame implements ActionListener {
    //Definen las variables
    private JTextField textfield;
    private JLabel label;
    private JButton boton;
    
    public Gui8(){
        super ("Gui8:Activacion Oyente"); //o usar setTitle
        setLayout(null);
        setSize(300,150);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /*Etiqueta sirve para escribir texto
        adicionalmente puede mostrar una imagen*/
        label =new JLabel("Nombre");
        label.setBounds(10,10,100,30);
        add(label);
        
        //Campo de texto
        textfield=new JTextField();
        textfield.setBounds(80, 10, 150, 30);
        add(textfield);
        
        //Boton
        boton=new JButton("Saludar");
        boton.setBounds(10, 80, 100, 30);
        add(boton);
        
        //Activar escuchador de boton
        boton.addActionListener(this);
        setVisible(true);
    }
    
    //metodo que implementa la accion
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){
            JOptionPane.showMessageDialog(null,"Hola "+textfield.getText()+" ¿Comó estas?");
        }
    }
}
