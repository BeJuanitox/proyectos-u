package matrizDispersa;

public class MainProjectTripletaMD {

    public static void main(String[] args) {

        int matriz1[][] = new int[3][4];

        matriz1[0][1] = 18;
        matriz1[0][2] = 20;
        matriz1[1][0] = 36;
        matriz1[1][2] = 17;
        matriz1[2][1] = 11;
        matriz1[2][2] = 19;
        
        int matriz2[][] = new int[3][4];
        
        matriz2[0][0] = 8;
        matriz2[0][3] = 5;
        matriz2[1][0] = 6;
        matriz2[1][1] = 4;
        matriz2[2][0] = 2;
        matriz2[2][2] = 1;
        matriz2[2][3] = 7;
                
        // --------------- T1 ------------------------

        int ContadorDato = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != 0) {
                    ContadorDato++;
                }
            }
        }
        tripleta T = new tripleta(ContadorDato);
        T.constuir(matriz1, ContadorDato);        
        
        // --------------- T2 ------------------------
        
        ContadorDato = 0;
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (matriz2[i][j] != 0) {
                    ContadorDato++;
                }
            }
        }        
        tripleta T2 = new tripleta(ContadorDato);        
        T2.constuir(matriz2, ContadorDato);
        
        // --------------- M1 T1 ------------------------
        
        System.out.println("\n-- Matriz 1 --");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }        

        System.out.println("\n-- Tripleta 1 --");
        T.mostrar();
        
        // --------------- M2 T2 ------------------------
        
        
        System.out.println("\n-- Matriz 2 --");

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
                
        System.out.println("\n-- Tripleta2 --");
        T2.mostrar();
        
        
        // ----------------- T3 -----------------------
        
        tripleta Tsuma = T.sumar(T2);
        System.out.println("\n-- Tripleta Suma --");
        Tsuma.mostrar();
        
    }

}
