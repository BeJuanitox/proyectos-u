
package pilasycolas;

import java.util.LinkedList;
import java.util.Scanner;


public class PIlasYColas {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int tamaño, d, limite, opcionP, opcionPoC, opcionC;   
        
        System.out.println("Bienvenido"+"\nPor favor ingrese el tamanio a usar: ");
        tamaño = scan.nextInt();
        
        limite = tamaño - 1;
        
        System.out.println("\nCon que desea trabajar?: \n1. Pilas. \n2. Colas. \nOtro (Salir).\n");
        opcionPoC = scan.nextInt();
        
        switch(opcionPoC){
            
            case 1:        

                Pila principal = new Pila(tamaño);
                Pila secundaria = new Pila(tamaño);
                Pila aux = new Pila(tamaño);

                do {

                    System.out.println("\nQue desea hacer? \n1. Apilar \n2. Ordenar pila. \n3. Apilar ordenado. \n4. Desapilar. \n5. Buscar. \nOtro (Salir).\n"); 
                    opcionP = scan.nextInt();

                    switch (opcionP) {

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

                } while ( opcionP >= 1 && opcionP <= 5);

                principal.MostrarPila();
                
                break;   
                
            case 2: 
                
                Cola colaPrincipal = new Cola(tamaño);
                Cola colaSecundaria = new Cola(tamaño);
                Cola colaAux = new Cola(tamaño);

                do {

                    System.out.println("\nQue desea hacer? \n1. Encolar \n2. Ordenar cola. \n3. Encolar ordenado. \n4. DesEncolar. \n5. Buscar. \nOtro (Salir).\n"); 
                    opcionC = scan.nextInt();

                    switch (opcionC) {

                        case 1: System.out.println("\nInserte dato a encolar: ");
                            d = scan.nextInt();
                            colaPrincipal.Encolar(d);
                            break;
                        case 2: System.out.println("\nOrdenando cola ...");
//                            colaPrincipal.EncolarAscendente(colaPrincipal, colaSecundaria, colaAux);
                            break;
                        case 3: System.out.println("\nInserte dato a encolar: ");
                            d = scan.nextInt();
                            colaPrincipal.EncolarOrdenado(d, colaPrincipal, colaSecundaria, colaAux);
                            break;
                        case 4: System.out.println("\nDesEncolando ultimo numero ... \n");
                            colaPrincipal.DesEncolar();
                            System.out.println("\nEl numero se ha desencolado exitosamente.\n");
                            break;
                        case 5: System.out.println("\nInserte dato a buscar: ");
                            d = scan.nextInt();
//                            colaPrincipal.BuscarCola(d, colaPrincipal, colaSecundaria);
                            break;
                        default: break;    

                    }

                } while ( opcionC >= 1 && opcionC <= 5);

                colaPrincipal.MostrarCola();
                
                break;
                
            default: break;
        }
    }
    
}
