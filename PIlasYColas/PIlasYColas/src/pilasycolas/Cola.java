package pilasycolas;

public class Cola {
    
    int vc [];
    int tope, limite;
        
    public Cola(int tamaño){
        
        vc = new int[tamaño];
        tope = -1;
        
    }
    
    public void Encolar(int d){
        tope++;
        vc[tope] = d;
    }
    
    public int DesEncolar(){
        int r = vc[0];
        
        for(int i = 1; i <= tope; i++){
            vc[i-1] = vc[i];
        }
        
        tope--;
        
        return r;
    }
    
    public boolean ColaVacia() {
        
        if(tope == -1){
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean ColaLlena() {
        
        boolean r = false;
        
        if(tope == limite){
            r = true;
        }
        
        return r;
        
    }
    
    public void EncolarOrdenado(int d, Cola colaPrincipal, Cola colaSecundaria, Cola colaAux){
        int fuera;
        
        while(ColaVacia() == false){
            fuera = colaPrincipal.DesEncolar();
            
            if(fuera < d){
                colaSecundaria.Encolar(fuera);
            } else {
                colaAux.Encolar(fuera);
            }
            
        }
        
        colaPrincipal.PasarCola(colaPrincipal, colaSecundaria);
        colaPrincipal.Encolar(d);
        colaPrincipal.PasarCola(colaPrincipal, colaAux);
        
    }
    
    public void PasarCola(Cola colaPrincipal, Cola colaSecundaria){
        
        while(colaSecundaria.ColaVacia() != true){
            
            colaPrincipal.Encolar(colaSecundaria.DesEncolar());
            
        }
                
    }
    
    public void MostrarCola(){
        
        System.out.println("\n\nMostrando Cola:\n");
        
        while (tope != -1){
            
            System.out.print("-> "+vc[tope]+" ");
            
            tope--;
        }
    }
          
    
}
