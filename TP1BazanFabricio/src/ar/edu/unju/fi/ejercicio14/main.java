package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int n,i=0,aux,suma=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero entero entre 3 y 10...");
		do
			n=sc.nextInt();
		while(n<3 || n>10);
		
		int[] arreglo=new int[n];
		System.out.println("Ingrese "+n+" numeros...");
		
		do
		{
			aux=sc.nextInt();
			arreglo[i]=aux;
			suma+=aux;
			i++;
		}
		while(i<n);
		
		for(int j=0; j<n;j++)
			System.out.println("El numero de la posicion "+j+" es: "+arreglo[j]);
		
		System.out.println("La suma total de los "+n+" numeros es: "+suma);
		sc.close();
	}

}
