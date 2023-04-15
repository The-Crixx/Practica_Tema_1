package GUI;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.*;

public class Gui5 extends JFrame {
    public Gui5(){
        super("Ventana Herencia");//Establece titulo de la ventana
        //Agrega el FlowLayout en la ventana
        getContentPane().setLayout(new FlowLayout());
        //Se instancian los componenetes
        JButton boton=new JButton("Boton");
        JLabel etiqueta= new JLabel("Dato");
        JTextField textField=new JTextField(10);
        JCheckBox checkBox=new JCheckBox("CheckBox");
        
        //Se añanden componenetes a la ventana
        getContentPane().add(boton);
        getContentPane().add(etiqueta);
        getContentPane().add(textField);
        getContentPane().add(checkBox);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); //Presenta una ventana con el tamaño necesario para mostrar los componentes que hay en ella
        setVisible(true);
    }
}
