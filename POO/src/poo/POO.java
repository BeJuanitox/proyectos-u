
package poo;

import java.util.Scanner;


public class POO {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        
        int numlist,opc;
        
        do{
            System.out.println("\nListas: \n1. Lista 1. \n2. Lista 2. \nOtro: Salir.\n \nQue lista desea trabajar:");
            numlist = scan.nextInt();
        
            switch (numlist){
                case 1: L1.Menu(); break;
                case 2: L2.Menu(); break; 
                default: break;
            }
            
            System.out.println("Desea trabajar con otra lista?: \n1. Si. \nOtro. No. \nEscoge una opción:\n");
            opc = scan.nextInt();
            
        } while (opc == 1);
        
        L1.MostrarLista();
        L2.MostrarLista();
        
        
    }
    
}
