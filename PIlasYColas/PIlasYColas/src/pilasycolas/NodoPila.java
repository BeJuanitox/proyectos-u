
package pilasycolas;


public class NodoPila {
    
    //Atributo
    private int limite, tope, vp[];
    
    //Metodos
    public NodoPila (int n) {
        limite = n-1;
        tope = -1;
        vp = new int[n];
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int[] getVp() {
        return vp;
    }

    public void setVp(int[] vp) {
        this.vp = vp;
    }
    
    public int getVp(int t) {
        return vp[t];
    }

    public void setVp(int t, int d) {
        this.vp[t] = d;
    }
    
}
