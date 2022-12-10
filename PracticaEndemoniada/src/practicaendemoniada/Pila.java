
package practicaendemoniada;

import java.util.Scanner;

public class Pila {
    
    NodoPila vp[];
    int topePila, limitePila;
        
    public Pila(int tamañoPila){
        
        vp = new NodoPila[tamañoPila];
        limitePila = tamañoPila-1;
        topePila = -1;
        
    }
    
    public void Apilar(NodoPila registro) {
            
        if(topePila == limitePila){
            System.out.println("La pila esta llena.");
        } else {
            topePila++;
            vp[topePila] = registro;
        }
        
    }
    
    public NodoPila Desapilar(){
        
        NodoPila fuera = vp[topePila];
        
        if(topePila == -1){
            System.out.println("La pila esta vacia.");
            fuera = null;
            
        } else {
        
            topePila--;

        }       
        
        return fuera;
    }
    
    public boolean PilaVacia() {
        
        if(topePila == -1){
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean PilaLlena() {
        
        boolean r = false;
        
        if(topePila == limitePila){
            r = true;
        }
        
        return r;
        
    }
    
    public void PasarPila(Pila Notas, Pila Aux){
        
        while(Aux.PilaVacia() != true){
            
            Notas.Apilar(Aux.Desapilar());
            
        }
                
    }
    
    public void ApilarOrdenado(Pila Notas, Pila Aux, NodoPila registro) {
        
        NodoPila fuera;
        
        if(Notas.PilaVacia() == true){
            
            Notas.Apilar(registro);
            
        } else {        
            
            while(registro.getNota() < Notas.vp[Notas.topePila].getNota()){
                
                fuera = Notas.Desapilar();
                Aux.Apilar(fuera);
                
                if(Notas.PilaVacia() == true){
                    
                    Notas.Apilar(registro);
                    
                }                
            
            }
            
            if(registro.getNota() > Notas.vp[Notas.topePila].getNota()){
                
                Notas.Apilar(registro);
                
            }
            
            Notas.PasarPila(Notas, Aux);
            
        }     
        
    }
    
    public void Buscar(Pila Notas, Pila Aux, String matBuscar){
        Scanner scan = new Scanner (System.in);
        
        int opcBuscar, reemNota;
        String reemMateria;
        NodoPila r;
                             
        while(Notas.topePila != -1){
                        
            r = Notas.Desapilar();
            
            if(r.getMateria() == matBuscar ){
                
                System.out.println("\nMateria encontrada");
                System.out.println("\nQue desea hacer con ella?: \n1. Cambiar nombre de materia. \n2. Cambiar nota. \n3. Eliminar. \nOtro (Salir)");
                opcBuscar = scan.nextInt();

                switch(opcBuscar){
                    case 1: System.out.println("\nIngrese materia a reemplazar: \n");
                        reemMateria = scan.next();
                        r.setMateria(reemMateria);
                        Aux.Apilar(r);
                        break;
                    case 2: System.out.println("\nIngrese nota a reemplazar: \n");
                        reemNota = scan.nextInt();
                        r.setNota(reemNota);
                        Aux.Apilar(r);
                        break;
                    case 3:
                        r = null;
                    default: break;
                }
                
            } else {
                
                Aux.Apilar(r);
                System.out.println("\nDato no encontrado en la posicion "+(topePila+2));

            }
            
        }
        
        Notas.PasarPila(Notas, Aux);             
        
    }
    
    public void MostrarPila(){
                
        while (topePila != -1){
            
            System.out.println(vp[topePila].datospila());
            
            topePila--;
        }
                
    }
    
}


