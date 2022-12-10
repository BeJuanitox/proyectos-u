
package pruebarecursion;
import java.util.Scanner;

public class PruebaRecursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x, y, n;
        
//        System.out.println("Ingrese X: ");
//        x = scan.nextInt();
//        System.out.println("Ingrese Y: ");
//        y = scan.nextInt();
        System.out.println("Ingrese N: ");
        n = scan.nextInt();
        
        System.out.println(Ejercicio3(n));
        
    }
    
    public static int Ejercicio1(int x, int y){
        
        if(y == 0){
            return 1;
        } else {
            if(y == 1){
                return x;
            } else {
                return x * Ejercicio1(x,y-1);
            }
        }
        
    }
    
    public static void Ejercicio2(int n){
        if(n<10){
            System.out.println(n);
        } else {
            System.out.println(n%10);
            Ejercicio2(n/10);
        }
    }
    
    public static int Ejercicio3(int n){
        if(n>1){
            return Ejercicio3(n-1) + Ejercicio3(n-2);
        } else {
            return n;
        }
    }
    
}
