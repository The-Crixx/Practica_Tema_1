package GUI;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Gui11 extends JFrame implements ItemListener{
    private final JCheckBox sistemas;
    private final JCheckBox informatica;
    private final JCheckBox electronica;
    private final JTextArea areaTexto;
    public Gui11() {
        setTitle("JCheckBox 11"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setLocationRelativeTo(null);
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout());
 
        sistemas=new JCheckBox("sistemas");
        add(sistemas);
        sistemas.addItemListener(this);
 
        informatica=new JCheckBox("informatica");
        add(informatica);
        informatica.addItemListener(this);
 
        electronica=new JCheckBox("Electronica");
        add(electronica);
        electronica.addItemListener(this);
        areaTexto=new JTextArea(0,15);
        add(areaTexto);
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent event){
        String nuevaLinea="\r\n";
        areaTexto.setText("");
        if (sistemas.isSelected()){
            areaTexto.append("Se Selecciono Ing. en Sistemas"+ nuevaLinea);}
        if (informatica.isSelected()){
            areaTexto.append("Se Selecciono Ing. Informatica"+ nuevaLinea);}
        if (electronica.isSelected()){
            areaTexto.append("Se Selecciono Ing. Electronica"+ nuevaLinea);}
    }
}
