
package ProjectMatDisYTripleta;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public void insertarDato(int fila1, int columna1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }*/

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
}
