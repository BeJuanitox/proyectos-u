
package poo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lista {
    //Atributo
    Nodo Punta;

    //Metodo
    public Lista() {
        Punta = null;
    }        
    
    public void Menu(){
        Scanner scan = new Scanner (System.in);
        int opcion, d;
        
        do {
            System.out.println("\nMenu: \n1. Insertar inicio. \n2. Insertar final. \n3. Insertar ordenado. \n4. Ordenar ascendente. \n5. Ordenar descendente. \n6. Buscar. \n7. Distributiva. \n8. Intercalar. \nOtro: Finalizar.");
            System.out.println("\nIngrese una de las anteriores opciones:");
            opcion = scan.nextInt();
            
            switch (opcion){
                case 1: System.out.println("\nIngrese dato:");
                    d = scan.nextInt();
                    InsertarInicio(d);
                    break;
                case 2: System.out.println("\nIngrese dato:");
                    d = scan.nextInt();
                    InsertarFinal(d);
                    break;
                case 3: System.out.println("\nIngrese dato:");
                    d = scan.nextInt(); 
                    InsertarOdenado(d);
                    break;
                case 4: System.out.println("\nLa lista se esta ordenando...");
                    OrdenarAscendente();
                    break;
                case 5: System.out.println("\nLa lista se esta ordenando...");
                    OrdenarDescendente();
                    break;
                case 6: System.out.println("\nDato a buscar.");
                    d = scan.nextInt();
                    Buscar(d);
                    break;
                case 7: System.out.println("Realizando operación...");
                    //Distributiva(Lista L1, Lista L2);
                case 8: System.out.println("Intercalando listas...");
                    //Intercalada(Lista L1, Lista L2);
                default: System.out.println("\nFinalizado correctamente.\n"); 
                    break;
            }            
            
        } while (opcion >= 1 && opcion <= 8);
    }
    
    public void MostrarLista(){
            
           Nodo p = Punta;
           String s ="";
           
           while (p != null){               
               System.out.print("|"+p.getDato()+"| -> ");
               s += "|"+p.getDato()+"| -> ";
               p = p.getLigaD();
            }
           JOptionPane.showMessageDialog(null, s);       
            
    }
    
    public void InsertarInicio (int d) {
        
        Nodo x = new Nodo();
        
        x.setDato(d);
        
        if (Punta == null){
            Punta = x;
        } else {
            x.setLigaD(Punta);
            Punta.setLigaI(x);
            Punta = x;
        }
        
    }
    
    public void InsertarFinal (int d){
        
        Nodo p = null, x = new Nodo(d);
        
        if (Punta == null){
            
            Punta = x;
            
        } else {
            
            p = Punta;
            
            
            while (p.getLigaD() != null){                
            p = p.getLigaD();            
            }
            
            p.setLigaD(x);
            x.setLigaI(p);
            
        }        
        
    }
    
    public void InsertarOdenado (int d) {
        
        Nodo P = null, A = null, X = new Nodo(d);
        
        if (Punta == null){
            Punta = X;
        } else {
            P = Punta;
                    
                    while (P != null && (X.getDato() > P.getDato())) {
                        A = P;
                        P = P.getLigaD();
                    }
                    
                    if ( P == null){
                        A.setLigaD(X);
                        X.setLigaI(A);
                    } else {
                        if (P == Punta){
                            X.setLigaD(P);
                            P.setLigaI(X);
                            Punta = X;
                        } else {
                            A.setLigaD(X);
                            X.setLigaI(A);
                            X.setLigaD(A);
                            P.setLigaI(X);
                        }
                    }
        }
        
    }     
    
    public void OrdenarAscendente(){
        
        Nodo p = Punta, q = null;
        int aux = 0;
        
        if (Punta == null){
            
            System.out.println("\nLa lista está vacia.\n");
            
        } else {
            
            while (p != null){
                
                q = p;
                
                while (q != null){
                    if (p.getDato() > q.getDato()){
                        aux = q.getDato();
                        q.setDato(p.getDato());
                        p.setDato(aux);
                    }
                
                    q = q.getLigaD();
                
                }
            
                p = p.getLigaD();
            
            }
            
        }
        
        System.out.println("\nLa lista se ha ordenado exitosamente.\n");
        
        MostrarLista();
        
    }
    
    public void OrdenarDescendente(){
        
        Nodo p = Punta, q = null;
        int aux = 0;
        
        if (Punta == null){
            
            System.out.println("\nLa lista está vacia.\n");
            
        } else {
            
            while (p != null){
                
                q = p;
                
                while (q != null){
                    if (p.getDato() < q.getDato()){
                        aux = q.getDato();
                        q.setDato(p.getDato());
                        p.setDato(aux);
                    }
                
                    q = q.getLigaD();
                
                }
            
                p = p.getLigaD();
            
            }
            
        }
        
        System.out.println("\nLa lista se ha ordenado exitosamente.\n");
        
        MostrarLista();
        
    }
    
    public void Buscar(int d){
        Scanner scan = new Scanner (System.in);
        
        Nodo p = Punta, q = p.getLigaD();
        int i=1, opcBuscar, reem;
        
        while (q != null){
            
            q = q.getLigaD();
            p = p.getLigaD();
            
            i++;
            
            if (d == q.getDato()){
                System.out.println("\nQue desea hacer con el dato? \n1. Saber la posicion. \n2. Reemplazar. \n3. Eliminar.");
                opcBuscar = scan.nextInt();
                
                switch (opcBuscar){
                    case 1: System.out.println("\nEl dato esta en la posicion: "+i+"\n"); 
                        break;
                    case 2: System.out.println("\nIngrese el nuevo dato: \n");
                        reem = scan.nextInt();
                        q.setDato(reem);
                        System.out.println("\nDato reemplazado con exito.\n"); 
                        break;
                    case 3: 
                        q = q.getLigaD();
                        p.setLigaD(q);
                        q.setLigaI(p);
                        System.out.println("\nDato eliminado."); 
                        break;
                    default: break;
                }
                
            } else {
                System.out.println("\nDato no encontrado.");
            }            
            
        }        
        
    }

    public void Distributiva (Lista L1, Lista L2) {
        
        Nodo p = L1.Punta, q = L2.Punta;
        Lista L3 = new Lista();
        int acu = 0;
        
        while (p != null){
            
            acu = 0;
            
            while (q != null){
                acu += (p.getDato()*q.getDato());
                q = q.getLigaD();
            }
            
            L3.InsertarFinal(acu);
            
            p = p.getLigaD();
            
        }        
        
        L3.MostrarLista();
        
    }
    
    public void Intercalada (Lista L1, Lista L2){
        
        Nodo p = L1.Punta, q = L2.Punta;
        Lista L3 = new Lista();
        int d;
        
        while (p != null || q != null){
            
            d = p.getDato();
            L3.InsertarFinal(d);
            d = q.getDato();
            L3.InsertarFinal(d);
            
            p = p.getLigaD();
            q = q.getLigaD();
            
        }
        
        if (p == null){
            
            d = p.getDato();
            L3.InsertarFinal(d);
            
            while (q != null){
                
                d = q.getDato();
                L3.InsertarFinal(d);
                
                q = q.getLigaD();
                
            }
            
            d = q.getDato();
            L3.InsertarFinal(d);
            
        } else if (q == null){
            
            d = q.getDato();
            L3.InsertarFinal(d);
            
            while (p != null){
                
                d = p.getDato();
                L3.InsertarFinal(d);
                
                p = p.getLigaD();
                
            }
            
            d = p.getDato();
            L3.InsertarFinal(d);
            
        }
        
        L3.MostrarLista();
        
    }
    
}

