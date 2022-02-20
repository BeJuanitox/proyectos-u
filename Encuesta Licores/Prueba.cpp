#include <iostream>
#include <math.h>

using namespace std;

int n,fact,cterm=0,i,pot=1;
float seno=0,term,x=2;

int main(int argc, char** argv) {
	
	while (pot<=5){
		fact=1,i=2;
		
		while (i<=pot) {
			fact=fact*i;
			i=i+1;
		}
		
		term = pow(x, pot)/fact;
		cterm=cterm+1;
		
		if (cterm%2==0) {
			term=term*(-1);
		}
		
		seno=seno+term;
		pot=pot+2;
	}	
	
	cout<<"El resultado de la funcion seno con angulo: "<<x<<" es = "<<seno;

	return 0;
}
