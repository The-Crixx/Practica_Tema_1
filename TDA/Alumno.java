package TDA;

public class Alumno {
    private String numCtrl;
    private String nomAlu;
    private byte semAlu;
    private byte edadAlu;

    public Alumno(){
    }    
    
    //Alt+insert constructor 
    public Alumno(String numCtrl, String nomAlu, byte semAlu, byte edadAlu) {
        this.numCtrl = numCtrl;
        this.nomAlu = nomAlu;
        this.semAlu = semAlu;
        this.edadAlu = edadAlu;
    }
    
    //Alt+insert con la opcion de getter and setters
    public String getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(String numCtrl) {
        this.numCtrl = numCtrl;
    }

    public String getNomAlu() {
        return nomAlu;
    }

    public void setNomAlu(String nomAlu) {
        this.nomAlu = nomAlu;
    }

    public byte getSemAlu() {
        return semAlu;
    }

    public void setSemAlu(byte semAlu) {
        this.semAlu = semAlu;
    }

    public byte getEdadAlu() {
        return edadAlu;
    }

    public void setEdadAlu(byte edadAlu) {
        this.edadAlu = edadAlu;
    }
    
}
