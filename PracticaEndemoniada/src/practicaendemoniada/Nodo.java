
package practicaendemoniada;


public class Nodo {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Carrera;
    private Pila Vp;
//    private int limitePila, topePila;
//    private Nodo vp[];
//    private int Nota;
//    private String Materia;

    public Nodo(String ced, String name, String ape, String car, Pila asignatura) {
        Cedula = ced;
        Nombre = name;
        Apellido = ape;
        Carrera = car;
        Vp = asignatura;
//        limitePila = n-1;
//        topePila = -1;
//        vp = new Nodo[n];
//        Nota = nota;
//        Materia = materia;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

        public Pila getVp() {
        return Vp;
    }

    public void setVp(Pila vp) {
        this.Vp = vp;
    }
    
    public Pila getVp(int t) {
        return Vp;
    }
    
    public String getFullInformation(){
        getVp().MostrarPila();
        return getCedula()+" "+getNombre()+" "+getApellido()+" "+getCarrera();
    }

//    public void setVp(int t, Nodo registro) {
//        this.Vp[t] = registro;
//    }
//
//    public int getNota() {
//        return Nota;
//    }
//
//    public void setNota(int Nota) {
//        this.Nota = Nota;
//    }
//
//    public String getMateria() {
//        return Materia;
//    }
//
//    public void setMateria(String Materia) {
//        this.Materia = Materia;
//    }
//    
    
    
}
