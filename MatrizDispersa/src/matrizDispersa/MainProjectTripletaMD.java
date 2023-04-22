package matrizDispersa;

import java.util.Scanner;

public class MainProjectTripletaMD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion, valor, n = 0, m = 0;

        System.out.println("Creando matriz 1 ...");
        System.out.println("Ingrese el numero de filas:");
        n = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        m = scanner.nextInt();

        int matriz1[][] = new int[n][m];

        System.out.println("\nCreando matriz 2 ...");
        System.out.println("Ingrese el número de filas:");
        n = scanner.nextInt();
        System.out.println("Ingrese el número de columnas:");
        m = scanner.nextInt();

        int matriz2[][] = new int[n][m];

        tripleta T = null;
        tripleta T2 = null;
        tripleta Tsuma = null;

        do {
            System.out.println("\nElige una opcion:");
            System.out.println("1. Llenar matriz 1. \n2. Llenar matriz 2. \n3. Sumar matrices. \n4. Imprimir resultados \n5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nPor favor, ingrese los datos para la matriz 1:");

                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[i].length; j++) {
                            System.out.print("Ingresa el valor de la fila " + i + " y la columna " + j + ": ");
                            valor = scanner.nextInt();
                            matriz1[i][j] = valor;
                        }
                    }

                    // --------------- T1 ------------------------
                    int ContadorDato = 0;

                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[i].length; j++) {
                            if (matriz1[i][j] != 0) {
                                ContadorDato++;
                            }
                        }
                    }
                    T = new tripleta(ContadorDato);
                    T.constuir(matriz1, ContadorDato);

                    break;

                case 2:
                    System.out.println("\nPor favor, ingrese los datos para la matriz 2:");

                    for (int i = 0; i < matriz2.length; i++) {
                        for (int j = 0; j < matriz2[i].length; j++) {
                            System.out.print("Ingresa el valor de la fila " + i + " y la columna " + j + ": ");
                            valor = scanner.nextInt();
                            matriz2[i][j] = valor;
                        }
                    }

                    // --------------- T2 ------------------------
                    ContadorDato = 0;

                    for (int i = 0; i < matriz2.length; i++) {
                        for (int j = 0; j < matriz2[i].length; j++) {
                            if (matriz2[i][j] != 0) {
                                ContadorDato++;
                            }
                        }
                    }
                    T2 = new tripleta(ContadorDato);
                    T2.constuir(matriz2, ContadorDato);

                    break;

                case 3:
                    // ----------------- T3 -----------------------
                    if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
                        System.out.println("\nEsta operacion no se puede realizar porque no son del mismo tamanio :(");
                        break;
                    }

                    Tsuma = T.sumar(T2);
                    System.out.println("\n-- Tripleta Suma --");
                    Tsuma.mostrar();

                    break;

                case 4:
                    if (matriz1 != null) {
                        System.out.println("\n-- Matriz 1 --");

                        for (int i = 0; i < matriz1.length; i++) {
                            for (int j = 0; j < matriz1[i].length; j++) {
                                System.out.print(matriz1[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("\n-- Tripleta 1 --");
                        T.mostrar();

                    } else {
                        System.out.println("\nNo se puede mostrar la matriz 1 porque esta vacia.");
                    }

                    if (matriz2 != null) {
                        System.out.println("\n-- Matriz 2 --");

                        for (int i = 0; i < matriz2.length; i++) {
                            for (int j = 0; j < matriz2[i].length; j++) {
                                System.out.print(matriz2[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("\n-- Tripleta2 --");
                        T2.mostrar();

                    } else {
                        System.out.println("\nNo se puede mostrar la matriz 2 porque esta vacia.");
                    }

                    break;

                case 5:
                    // Salir del menú
                    System.out.println("Saliendo del programa ...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

    }

}
