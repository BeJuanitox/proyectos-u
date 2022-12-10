
package pilasycolas;

public class NodoCola {
    //Atributo
    private int limite, tope, vc[];
    
    //Metodos
    public NodoCola (int n) {
        limite = n-1;
        tope = -1;
        vc = new int[n];
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int[] getVc() {
        return vc;
    }

    public void setVc(int[] vc) {
        this.vc = vc;
    }
    
}
