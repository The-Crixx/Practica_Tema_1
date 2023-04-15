package topicostema1;

import EntradaDatos.EDJOPI;
import TDA.Alumno;
import java.util.ArrayList;

public class ListaAlumnos {
    ArrayList <Alumno> lista;
    
    public ListaAlumnos(){
        lista=new <Alumno> ArrayList();
    }
    
    public void añadir(Alumno a){
        lista.add(a);
    }
    
    public void eliminar(int pos){
        lista.remove(pos);
    }
    
    public void eliminartodo(){
        lista.removeAll(lista);
    }
    
    public Alumno crearAlumno(){
        Alumno aux=new Alumno();
        aux.setNumCtrl(EDJOPI.cadena("Ingrese el numero de control"));
        aux.setNomAlu(EDJOPI.cadena("Ingrese el nombre"));
        aux.setSemAlu(EDJOPI.Byte("Ingrese el semestre"));
        aux.setEdadAlu(EDJOPI.Byte("Edad"));
        return aux;
    }
    
    public String imprimir(){
        String cadena="Alumnos \n";
        for (int i=0;i<lista.size();i++){
            cadena+="Numero de control: "+lista.get(i).getNumCtrl()
                    +" Nombre: "+lista.get(i).getNomAlu()+" Semestre: "+
                    lista.get(i).getSemAlu()+" Edad: "+lista.get(i).getEdadAlu()+"\n";
        }
        return cadena;
    }
    
    
}
