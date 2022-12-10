
package practicaendemoniada;

import java.util.Scanner;

public class PracticaEndemoniada {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int tamañoCola, limiteCola, opcCola, tamañoPila;
        int nota, prom = 0; 
        String name, ape, car, materia, ced, cedBuscar;

        System.out.println("Numero de estudiantes a ingresar: ");
        tamañoCola = scan.nextInt();
        
        limiteCola = tamañoCola - 1;
        
        Cola Estudiantes = new Cola (tamañoCola);
        Cola Secundaria = new Cola (tamañoCola);
        Cola SecunAux = new Cola (tamañoCola);
        
//        Pila Notas = new Pila();
        
        do {
            
            System.out.println("\nMenu: \n1. Ingresar estudiante. \n2. Ver reporte de los estudiantes. \n3. Buscar/Editar estudiante. \nOtro (Salir).");
            opcCola = scan.nextInt();
            
            switch (opcCola) {
                case 1:
                    int sum = 0;
                    
                    prom = 0;
                                        
                    System.out.println("Cedula: ");
                    ced = scan.next();
                    System.out.println("Nombre: ");
                    name = scan.next();
                    System.out.println("Apellido: ");
                    ape = scan.next();
                    System.out.println("Carrera: ");
                    car = scan.next();
                    
                    System.out.println("\nCantidad de materias a guardar: ");
                    tamañoPila = scan.nextInt();
                    
                    Pila Notas = new Pila(tamañoPila);
                    Pila Aux = new Pila(tamañoPila);                    
                            
                    for (int i = 0; i < tamañoPila; i++){
                        
                        System.out.println("Materia: ");
                        materia = scan.next();
                        System.out.println("Nota: ");
                        nota = scan.nextInt(); 
                        
                        sum += nota ;
                        
                        NodoPila registro = new NodoPila(nota, materia);
                        Notas.ApilarOrdenado(Notas, Aux, registro);
                        
                    }
                    
                    prom = sum / tamañoPila;
                    
                    Nodo x = new Nodo(ced, name, ape, car, Notas);
                    
                    Estudiantes.Encolar(x);
                    
                    break;
                case 2: 
                    
                    Estudiantes.MostrarCola(prom);         
                    
                    break;
                case 3:
                    System.out.println("\nCedula del estudiante a buscar: ");
                    cedBuscar = scan.next();
//                    Estudiantes.Buscar(Estudiantes, Secundaria, cedBuscar, Notas);
                    break;
                default:
                    break;
            }
            
        } while (opcCola >= 1 && opcCola <= 3);
        
    }
    
}
