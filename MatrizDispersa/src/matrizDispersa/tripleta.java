package matrizDispersa;

public class tripleta {

    private int Matriz[][];

    public tripleta(int d) {
        Matriz = new int[d + 1][3];
    }

    public int[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(int[][] Matriz) {
        this.Matriz = Matriz;
    }

    public int getMatriz(int i, int j) {
        return Matriz[i][j];
    }

    public void setMatriz(int i, int j, int d) {
        Matriz[i][j] = d;
    }

    public void constuir(int[][] matriz, int ContDato) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return;
        }

        int k = 1;

        Matriz[0][0] = matriz.length;
        Matriz[0][1] = matriz[0].length;
        Matriz[0][2] = ContDato;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    Matriz[k][0] = i;
                    Matriz[k][1] = j;
                    Matriz[k][2] = matriz[i][j];
                    k++;
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public tripleta sumar(tripleta otra) {
        int[][] T1 = this.getMatriz();
        int[][] T2 = otra.getMatriz();

        int i = 1, j = 1, k = 1, contDato = 0;
        int fil1 = T1[0][0], col1 = T1[0][1], dato1 = T1[0][2];
        int dato2 = T2[0][2];
        int[][] resultado = new int[dato1 + dato2 + 1][3];

        resultado[0][0] = fil1;
        resultado[0][1] = col1;

        while (i <= dato1 && j <= dato2 && i != 0 && j != 0) {
            if (T1[i][0] < T2[j][0] || (T1[i][0] == T2[j][0] && T1[i][1] < T2[j][1])) {
                resultado[k][0] = T1[i][0];
                resultado[k][1] = T1[i][1];
                resultado[k][2] = T1[i][2];
                i++;
            } else if (T1[i][0] > T2[j][0] || (T1[i][0] == T2[j][0] && T1[i][1] > T2[j][1])) {
                resultado[k][0] = T2[j][0];
                resultado[k][1] = T2[j][1];
                resultado[k][2] = T2[j][2];
                j++;
            } else {
                resultado[k][0] = T1[i][0];
                resultado[k][1] = T1[i][1];
                resultado[k][2] = T1[i][2] + T2[j][2];
                i++;
                j++;
            }
            contDato++;
            k++;
        }

        while (i <= dato1 && i != 0) {
            resultado[k][0] = T1[i][0];
            resultado[k][1] = T1[i][1];
            resultado[k][2] = T1[i][2];
            i++;
            contDato++;
            k++;
        }

        while (j <= dato2 && j != 0) {
            resultado[k][0] = T2[j][0];
            resultado[k][1] = T2[j][1];
            resultado[k][2] = T2[j][2];
            j++;
            contDato++;
            k++;
        }

        resultado[0][2] = contDato;
        tripleta T = new tripleta(contDato);
        T.setMatriz(resultado);
        return T;
    }
       
}
