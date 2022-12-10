
package practicaendemoniada;

public class NodoCola {
    
    private int limiteCola, topeCola;
    private Nodo vc[];
    
    public NodoCola (int nc) {        
        limiteCola = nc-1;
        topeCola = -1;
        vc = new Nodo[nc];
    }
    
    
    public int getTopeCola() {
        return topeCola;
    }

    public void setTopeCola(int topeCola) {
        this.topeCola = topeCola;
    }

    public Nodo[] getVc() {
        return vc;
    }

    public void setVc(Nodo[] vc) {
        this.vc = vc;
    }
    
}
