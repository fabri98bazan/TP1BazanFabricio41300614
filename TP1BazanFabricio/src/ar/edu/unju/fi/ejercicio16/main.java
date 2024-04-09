package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int pos=0, tamaño;
		boolean band=false;
		byte elim=0;
		String[] arreglo=new String[5];
		String nombre;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
			System.out.print("Ingrese nombre: ");
			nombre=sc.next();
			arreglo[i]=nombre;
		}
		
		while(pos<5)
		{
			System.out.println("Posicion "+pos+" : "+arreglo[pos]);
			pos++;
		}
		
		pos=0;
		System.out.println("\nTamaño del array: "+arreglo.length);
		tamaño=arreglo.length-1;
		do
		{
			System.out.print("\nIngrese una posicion a eliminar del 0 al 4: ");
			elim=sc.nextByte();
		}while(elim<0 || elim>4);
		
		while(pos<=tamaño && band==false)
		{
			if(elim==pos)
				band=true;
			else
				pos++;
		}
		
		if(band==true)
		{
			while(pos<tamaño)
			{
				arreglo[pos]=arreglo[pos+1];
				pos++;
			}
			tamaño--;
		}
		
		for(int i=0;i<=tamaño;i++)
		{
			System.out.println(arreglo[i]+" ");
		}
		sc.close();
	}

}
