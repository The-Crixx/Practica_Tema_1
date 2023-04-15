package GUI;
import javax.swing.*;
import java.awt.event.ItemListener;
import TDA.Alumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import topicostema1.ListaAlumnos;

public class Gui12 extends JFrame implements ActionListener {
    private JLabel e1,e2,e3,e4,total;
    private JTextField nctrl,nombre,semestre,edad;
    private JButton añadir, eliminar, eliminarT;
    private ListaAlumnos lista=new ListaAlumnos();
    private JList listaNombres; 
    private DefaultListModel modelo; 
    private JScrollPane scrollLista; 

    
    public Gui12(){
        setTitle("Capturar Datos");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        e1= new JLabel("Numero de ctrl: ");
        e1.setBounds(40, 5, 100, 30);
        add(e1);
        e2= new JLabel("Nombre: ");
        e2.setBounds(40, 35, 100, 30);
        add(e2);
        e3= new JLabel("Semestre: ");
        e3.setBounds(40, 65, 100, 30);
        add(e3);
        e4= new JLabel("Edad: ");
        e4.setBounds(40, 95, 100, 30);
        add(e4);
        total=new JLabel();
        total.setText("No.Registro:");
        total.setBounds(10, 210, 135, 23);
        add(total);
        
        nctrl=new JTextField();
        nctrl.setBounds(140, 10, 120, 20);
        add(nctrl);
        nombre=new JTextField();
        nombre.setBounds(140, 40, 120, 20);
        add(nombre);
        semestre=new JTextField();
        semestre.setBounds(140, 70, 120, 20);
        add(semestre);
        edad=new JTextField();
        edad.setBounds(140, 100,120,20);
        add(edad);

        listaNombres=new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo=new DefaultListModel();
        
        scrollLista = new JScrollPane();
        scrollLista.setBounds(10, 125 ,260, 90);
        scrollLista.setViewportView(listaNombres);
        add(scrollLista);
        
        añadir=new JButton("Añadir");
        añadir.setBounds(50, 230, 80, 30);
        add(añadir);
        
        eliminar=new JButton("Eliminar");
        eliminar.setBounds(150, 230, 80, 30);
        add(eliminar);
        
        eliminarT=new JButton("Eliminar Todos");
        eliminarT.setBounds(80, 270, 120, 30);
        add(eliminarT);
        
        añadir.addActionListener(this);
        eliminar.addActionListener(this);
        eliminarT.addActionListener(this);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==añadir)
            añadirAlumno();
        if(e.getSource()==eliminar)
            eliminarAlumno(listaNombres.getSelectedIndex());
        if(e.getSource()==eliminarT)
            EliminarTodo();
    }
    
    public void añadirAlumno(){
        Alumno p = new Alumno(nctrl.getText(),nombre.getText(), 
        (Byte.parseByte(semestre.getText())),(Byte.parseByte(edad.getText())));
        lista.añadir(p);
        String cad = nombre.getText() + " | " +nctrl.getText() + " | " + 
        semestre.getText() + " | " + edad.getText();
        modelo.addElement(cad);
        listaNombres.setModel(modelo);
        int x = modelo.getSize();
        total.setText("No.Registro: "+x);
        nctrl.setText("");
        nombre.setText("");
        semestre.setText("");
        edad.setText("");
        
    }
    
    public void eliminarAlumno(int i){
        if (i >= 0) { 
            modelo.removeElementAt(i); 
            lista.eliminar(i); 
            int x = modelo.getSize();
            total.setText("No.Registro: "+x);
        }else { 
            JOptionPane.showMessageDialog(null,"Seleccione un elemento");
        }
    }
    
    public void EliminarTodo(){
        lista.eliminartodo();
        modelo.clear(); 
        int x = modelo.getSize();
        total.setText("No.Registro: "+x);
    }
    
}
