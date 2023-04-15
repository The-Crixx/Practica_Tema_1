package topicostema1;
import javax.swing.JOptionPane;
import EntradaDatos.EDJOPI;
import SalidaM.SJOPI;

public class TestAlumno {
    public static void main(String[] args) {
        menuAlumno();
    }
    
    public static void menuAlumno(){
        byte op=0;
        ListaAlumnos lista=new ListaAlumnos();
        do{
            try{
            op=Byte.parseByte(JOptionPane.showInputDialog("Opciones: \n1. Agregar Objeto \n2. eliminar"
                                                            +"\n3. Eliminar todo"+"\n4. MOstrar datos" +"\n5. Salir"));
            }catch (Exception e){
            }
            switch(op){
                case 1:
                    lista.añadir(lista.crearAlumno());
                    break;
                case 2:
                    lista.eliminar(EDJOPI.entero("¿Cual quieres eliminar?"));
                    break;
                case 3:
                    lista.eliminartodo();
                    break;
                case 4:
                    SJOPI.SJOPI(lista.imprimir());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, Opcion no valida");
                    break;
            }
        }while((byte)op!=5);
    }
}
