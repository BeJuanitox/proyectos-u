
package practicaendemoniada;

import java.util.Scanner;

public class Cola {
    
    Nodo vc [];
    int topeCola, limiteCola;
        
    public Cola(int tamañoCola){
        
        vc = new Nodo[tamañoCola];
        topeCola = -1;
        
    }
    
    public void Encolar(Nodo datos){
        
        if(ColaLlena() == false){
            topeCola++;
            vc[topeCola] = datos;
        } else {
            System.out.println("Lo siento, la Cola está llena");
        }
        
    }
    
    public Nodo DesEncolar(){
        Nodo sacar = vc[0];
        
        for(int i = 1; i <= topeCola; i++){
            vc[i-1] = vc[i];
        }
        
        topeCola--;
        
        return sacar;
    }
    
    public boolean ColaVacia() {
        
        if(topeCola == -1){
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean ColaLlena() {
        
        boolean r = false;
        
        if(topeCola == limiteCola){
            r = true;
        }
        
        return r;
        
    }
    
//    public void EncolarOrdenado(Nodo datos, Cola Estudiantes, Cola Secundaria, Cola SecunAux){
//        Nodo fuera;
//                       
//        while(ColaVacia() == false){
//            fuera = Estudiantes.DesEncolar();
//            
//            Integer.parseInt(datos.getCedula());
//            Integer.parseInt(fuera.getCedula());
//            
//            if(fuera.getCedula() < datos.getCedula()){
//                Secundaria.Encolar(fuera);
//            } else {
//                SecunAux.Encolar(fuera);
//            }
//            
//        }
//        
//        Estudiantes.PasarCola(Estudiantes, Secundaria);
//        Estudiantes.Encolar(datos);
//        Estudiantes.PasarCola(Estudiantes, SecunAux);
//        
//    }
    
    public void Buscar(Cola Estudiantes, Cola Secundaria, String cedBuscar, Pila Notas){
        Scanner scan = new Scanner (System.in);
        
        int opcEstBuscar;
        String datoreem, matBuscar;
        Nodo r;
                             
        while(Estudiantes.topeCola != -1){
                        
            r = Estudiantes.DesEncolar();
            
            if(r.getCedula() == cedBuscar ){
                
                System.out.println("\nEstudiante encontrado");
                System.out.println("\nQue desea hacer con este estudiante?: \n1. Cambiar cedula. \n2. Cambiar nombre. \n3. Cambiar apellido. \n4. Cambiar carrera. \n5. cambiar materias. \nOtro (Salir)");
                opcEstBuscar = scan.nextInt();

                switch(opcEstBuscar){
                    case 1: System.out.println("\nIngrese cedula a reemplazar: \n");
                        datoreem = scan.next();
                        r.setCedula(datoreem);
                        Secundaria.Encolar(r);
                        break;
                    case 2: System.out.println("\nIngrese nombre a reemplazar: \n");
                        datoreem = scan.next();
                        r.setNombre(datoreem);
                        Secundaria.Encolar(r);
                        break;
                    case 3: System.out.println("\nIngrese apellido a reemplazar: \n");
                        datoreem = scan.next();
                        r.setApellido(datoreem);
                        Secundaria.Encolar(r);
                        break;
                    case 4: System.out.println("\nIngrese carrera a reemplazar: \n");
                        datoreem = scan.next();
                        r.setCarrera(datoreem);
                        Secundaria.Encolar(r);
                        break;
                    case 5: System.out.println("\nIngrese materia a buscar: ");
                        matBuscar = scan.next();
                        Notas.Buscar(Notas, Notas, matBuscar);
                        break;
                    default: break;
                }
                
            } else {
                
                Secundaria.Encolar(r);
                System.out.println("\nDato no encontrado en la posicion "+(topeCola+2));

            }
            
        }
        
        Estudiantes.PasarCola(Estudiantes, Secundaria);             
        
    }
    
    public void PasarCola(Cola colaPrincipal, Cola colaSecundaria){
        
        while(colaSecundaria.ColaVacia() != true){
            
            colaPrincipal.Encolar(colaSecundaria.DesEncolar());
            
        }
                
    }
    
    public void MostrarCola(int prom){
        
        System.out.println("\n\n");
                
        while (topeCola != -1){
            
            System.out.print("-> "+vc[topeCola].getFullInformation()+" ");            
            System.out.println("\nPromedio de semestre: "+prom+"\n");
            
            topeCola--;
        }
        
    }
    
//            if(prom < 3){
//                System.out.println("\nPromedio de semestre: \033[31m"+prom);
//            }else if(prom >= 3 && prom <4){            
//                System.out.println("\nPromedio de semestre: \033[33m"+prom);
//            } else {
//                System.out.println("\nPromedio de semestre: \033[32m"+prom);
//            }
          
    
}
