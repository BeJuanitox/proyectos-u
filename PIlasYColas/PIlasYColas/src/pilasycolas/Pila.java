
package pilasycolas;

import java.util.Scanner;


public class Pila {
    
    int vp[];
    int tope, limite;
        
    public Pila(int tamaño){
        
        vp = new int[tamaño];
        tope = -1;
        
    }
    
    public void Apilar(int d) {
        
        if(tope == limite){
            System.out.println("La pila esta llena.");
        } else {
            tope++;
            vp[tope] = d;
        }
        
    }
    
    public int Desapilar(){
        
        int r = vp[tope];
        
        if(tope == -1){
            System.out.println("La pila esta vacia.");
            r = 0;
            
        } else {
        
            tope--;

        }       
        
        return r;
    }
    
    public boolean PilaVacia() {
        
        if(tope == -1){
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean PilaLlena() {
        
        boolean r = false;
        
        if(tope == limite){
            r = true;
        }
        
        return r;
        
    }
    
    public void PasarPila(Pila principal, Pila secundaria){
        
        while(secundaria.PilaVacia() != true){
            
            principal.Apilar(secundaria.Desapilar());
            
        }
                
    }
    
    public void ApilarOrdenado(int d, Pila principal, Pila secundaria) {
        
        int r;
        
        if(principal.PilaVacia() == true){
            
            principal.Apilar(d);
            
        } else {        
            
            while(d < principal.vp[principal.tope]){
                
                r = principal.Desapilar();
                secundaria.Apilar(r);
                
                if(principal.PilaVacia() == true){
                    
                    principal.Apilar(d);
                    
                }                
            
            }
            
            if(d > principal.vp[principal.tope]){
                
                principal.Apilar(d);
                
            }
            
            principal.PasarPila(principal, secundaria);
            
        }     
        
    }
    
    public boolean PilaOrdenada(Pila principal){
        
        for(int i = 0; i <= principal.vp.length; i++){
                
                if(i + 1 < principal.vp.length && principal.vp[i] > principal.vp[i+1]){
                
                    //System.out.println(principal.vp[i] + "  ----  " + principal.vp[i+1]);
                
                    return false;
                
                }
                
        }
        
        return true;
        
    }
    
    public void OrdenarAscendente(Pila principal, Pila secundaria, Pila aux){
        
            int r;
            
            while(principal.PilaOrdenada(principal) != true){
            
                r = principal.Desapilar();

                secundaria.Apilar(r);

                while(principal.PilaVacia() != true){

                    r = principal.Desapilar();
                    int c = secundaria.vp[secundaria.tope];

                    if(r < c){

                        secundaria.Apilar(r);

                    } else if(r > c) {

                        aux.Apilar(r);

                    }
                    
                }

                principal.PasarPila(principal, secundaria);
                principal.PasarPila(principal, aux);
               
            }           
            
    }
    
    public void Buscar(int d, Pila principal, Pila secundaria){
        Scanner scan = new Scanner (System.in);
        int r, opcBuscar, reem;
                
        while(principal.tope != -1){
                        
            r = principal.Desapilar();
            
            if(r == d){
                
                System.out.println("\nDato encontrado en la posición: "+(tope+2)+"\n");
                System.out.println("\nQue desea hacer con el dato?: \n1. Reemplazar. \n2. Eliminar. \nOtro (Salir)");
                opcBuscar = scan.nextInt();

                switch(opcBuscar){
                    case 1: System.out.println("\nIngrese dato a reemplazar: \n");
                        reem = scan.nextInt();
                        r = reem;
                        secundaria.Apilar(r);
                        break;
                    case 2: 
                        break;
                    default: break;
                }
                
            } else {
                
                secundaria.Apilar(r);
                System.out.println("\nDato no encontrado en la posicion "+(tope+2));

            }
            
        }
        
        principal.PasarPila(principal, secundaria);             
        
    }
    
    public void MostrarPila(){
        
        System.out.println("\n\nMostrando pila:\n");
        
        while (tope != -1){
            
            System.out.println(vp[tope]);
            
            tope--;
        }
                
    }
    
}

