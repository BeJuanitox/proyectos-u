/*Desarrollar una solución que solicite el número de pisos en 
un edificio, el número de apartamentos por piso, el consumo en 
litros de agua por apartamento, el número de personas por 
apartamento, el género y edad de cada persona. Informar cuantos 
hombres hay por piso, la edad promedio de los habitantes por 
piso y el mayor valor en consumo de cantidad en litros de agua 
en el edificio. UTILIZAR LOS TRES CICLOS,SUBPROGRAMAS */

#include <iostream>
using namespace std;

int npisos,napart,npersonas,edad,iapart,i,iper,ch,cca,mca,s,prom;
float lagua;
string gen;

// ch= Contador hombres / cca= Contador consumo agua / mca= Maximo consumo agua / gen= Genero / lagua= Litros Agua 

void InfoPersonas(string gen, int edad){
	if (gen=="M"){
		ch++;
	}
	cca=lagua;
	if(lagua>mca){
		mca=lagua;
	}
	s+=edad;
	iper++; 
}

void CicloOne(int iapart,float lagua, int npersonas){
	do{
		cout<<"Genero (M/F): "; cin>>gen;
		cout<<"Edad: "; cin>>edad;
				
		InfoPersonas(gen,edad);
				
	} while (iper<=npersonas);
	prom=s/iper;
	iper=1;
}

int main(int argc, char** argv) {
	
	cout<<"Pisos del edificio: "; cin>>npisos;
	cout<<"Apartamentos por piso: "; cin>>napart;
	i=1,iper=1,ch=0,s=0;
	while (i<=npisos){	
		cout<<"\n\tPiso "<<i<<endl;
		for (iapart=1;iapart<=napart;iapart++){
			cout<<"\nApartamento "<<iapart<<endl;
			cout<<"Consumo de agua (Lt): "; cin>>lagua;
			cout<<"Cantidad de personas en el apartamento: "; cin>>npersonas;
			
			CicloOne(iapart,lagua,npersonas);
			
		}
		cout<<"En el "<<i<<" piso, el promedio de edad es de: "<<prom<<endl;
		cout<<"Hay "<<ch<<" hombres en este piso."<<endl;
		ch=0;
		i++;
	}
	cout<<"\nMaximo consumo de agua: "<<mca<<endl;
	return 0;
}
