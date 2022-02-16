#include <iostream>

using namespace std;

int todos,uno,ultimo,c,caprob;
float nota,ult_not,df,sdf;

void Proceso(int nota){
	if (c>=3){			
		todos++;
	}
	
	if (c>=1){
	 	uno++;
	} 
	
	if (ult_not>=3){
		ultimo++;
	}
	
	if (df>=3){
		caprob++;
	}
}

int main(){
	todos=0,uno=0,ultimo=0,c=0,caprob=0,ult_not=0,sdf=0;
	
	cout<<"\tNotas alumnos"<<endl;
	
	for(int alumnos=1;alumnos<=3;alumnos++){
		 
		cout<<"\nNotas del alumno "<<alumnos<<": \n";
		 
		for(int notas=1;notas<=3;notas++){
			
			do{			
				
			cout<<"Ingrese la nota "<<notas<<": "; cin>>nota;
						
			} while ((nota<0)||(nota>5));
		
			if (nota>=3){
				c+=1;
			}
			
			ult_not=nota;	
			sdf+=nota;
		}
		
		df=sdf/3;
		
		cout.precision(2);
		cout<<"Definitiva: "<<df<<endl;
		
		Proceso(nota);
		
		sdf=0;
		c=0;
	}
	
	cout<<"\nCantidad de alumnos que ganaron todos los examenes: "<<todos<<endl;
	cout<<"Cantidad de alumnos que ganaron al menos un examen: "<<uno<<endl;
	cout<<"Cantidad de alumnos que ganaron el ultimo examen: "<<ultimo<<endl;
	cout<<"Cantidad de alumnos que pasaron el semestre: "<<caprob<<endl;
	
	return 0;
}
