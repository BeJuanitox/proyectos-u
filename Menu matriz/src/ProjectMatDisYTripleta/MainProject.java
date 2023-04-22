
package ProjectMatDisYTripleta;

import java.util.Scanner;

public class MainProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Matriz matriz1 = null;
        Matriz matriz2 = null;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Crear matriz 1");
            System.out.println("2. Crear matriz 2");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n---- CREANDO MATRIZ 1 ----");
                    int filas1, columnas1;
                    System.out.print("Ingrese el número de filas: ");
                    filas1 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas: ");
                    columnas1 = scanner.nextInt();
                    matriz1 = new Matriz(filas1, columnas1);
                    matriz1.insertarDato(filas1, columnas1);
                    System.out.println("Matriz 1 creada correctamente.");
                    break;
                case 2:
                    System.out.println("\n---- CREANDO MATRIZ 2 ----");
                    int filas2, columnas2;
                    System.out.print("Ingrese el número de filas: ");
                    filas2 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas: ");
                    columnas2 = scanner.nextInt();
                    matriz2 = new Matriz(filas2, columnas2);
                    matriz2.insertarDato(filas2, columnas2);
                    System.out.println("Matriz 2 creada correctamente.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 5);
        
        
        if ( matriz1 != null && matriz2 != null ) {
        matriz1.mostrarMatriz();            
        matriz2.mostrarMatriz(); 
        } else if ( matriz1 != null ) {
        matriz1.mostrarMatriz();            
        } else if ( matriz2 != null ) {
        matriz2.mostrarMatriz();            
        } else {
            System.out.println("Las matrices no contienen datos");
        }
        
    }
    
}
