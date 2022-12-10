
package practicaendemoniada;


public class NodoPila {
    
    private int nota;
    private String materia;
    

    public NodoPila() {
        nota = 0;
        materia = null;
    }
    
    public NodoPila(int note, String mate) {
        nota = note;
        materia = mate;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String datospila() {
        return Integer.toString(getNota())+" "+getMateria();
    }
    
}
