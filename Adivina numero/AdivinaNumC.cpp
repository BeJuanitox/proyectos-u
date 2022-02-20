/* Desarrollar un programa para jugar a “Adivina el número”. 
Se inicia con un número entero positivo previamente determinado
(por ejemplo 20). Se solicita al usuario que introduzca un 
valor numérico. Si el valor es menor, se muestra que el numero 
ingresado es menor que  el que debe adivinar, se vuelve a pedir 
que introduzca otro número y se valida si es menor o mayor
hasta que acierte. */

#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;

int opc,c,pc;

int main(int argc, char** argv) {
	srand(time(NULL));  //Semilla.
	
	pc=rand()%21; //%Limite+1. / 30rand()%71(Numeros de 30-70)
	
	while (opc!=pc){
		cout<<"\nIntente adivinar el numero: "; cin>>opc;
		
		if (opc>pc){
			cout<<"El numero es menor.";
		} else if (opc<pc){
			cout<<"El numero es mayor.";
			} else {
			cout<<"\nFelicidades, adivinaste el numero.";
				}
		c++;
	}
	
	cout<<"\n\nLo hiciste en "<<c<<" intentos."<<endl;
	
	return 0;
}
