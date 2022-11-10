
package pilasycolas;

import java.util.Scanner;


public class PIlasYColas {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int tamaño, d, limite, opcion;   
        
        System.out.println("Bienvenido"+"\nPor favor ingrese el tamanio de la pila: ");
        tamaño = scan.nextInt();
        
        limite = tamaño - 1;
        
        Pila principal = new Pila(tamaño);
        Pila secundaria = new Pila(tamaño);
        Pila aux = new Pila(tamaño);
              
        do {
                   
            System.out.println("\nQue desea hacer? \n1. Apilar \n2. Ordenar. \n3. Apilar ordenado. \n4. Desapilar. \n5. Buscar. \nOtro (Salir)."); 
            opcion = scan.nextInt();
        
            switch (opcion) {
            
                case 1: System.out.println("\nInserte dato a apilar: ");
                    d = scan.nextInt();
                    principal.Apilar(d);
                    break;
                case 2: System.out.println("\nOrdenando pila...");
                    principal.OrdenarAscendente(principal, secundaria, aux);
                    break;
                case 3: System.out.println("\nInserte dato a apilar: ");
                    d = scan.nextInt();
                    principal.ApilarOrdenado(d, principal, secundaria);
                    break;
                case 4: System.out.println("\nDesapilando ultimo numero... \n");
                    principal.Desapilar();
                    System.out.println("\nEl numero se ha desapilado exitosamente.\n");
                    break;
                case 5: System.out.println("\nInserte dato a buscar: ");
                    d = scan.nextInt();
                    principal.Buscar(d, principal, secundaria);
                    break;
                default: break;    
            
            }
         
        } while ( opcion >= 1 && opcion <= 5);
        
        principal.MostrarPila();
//        secundaria.MostrarPila();
//        aux.MostrarPila();
                
    }
    
}
