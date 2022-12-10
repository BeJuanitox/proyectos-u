//Paquete, clic derecho, nueva clase java
package poo;


public class Nodo {
    //Atributo
    private int Dato;
    private Nodo LigaD, LigaI;

    //Metodo
    //clic derecho, Insert Code, Constructor
    public Nodo() {
        Dato = 0;
        LigaD = null;
        LigaI = null;
    }
    
    public Nodo(int d ) {
        Dato = d;
        LigaD = null;
        LigaI = null;
    }

    //clic derecho, Insert Code, Getter and Setter
    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getLigaD() {
        return LigaD;
    }
    
    public Nodo getLigaI() {
        return LigaI;
    }
    
    public void setLigaD(Nodo LigaD) {
        this.LigaD = LigaD;
    }

    public void setLigaI(Nodo LigaI) {
        this.LigaI = LigaI;
    }
        
}
