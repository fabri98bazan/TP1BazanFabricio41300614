package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int n,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero entero entre 5 y 10...");
		do
			n=sc.nextInt();
		while(n<5 || n>10);
		
		String nombre;
		String[] arreglo=new String[n];
		
		do
		{
			System.out.print("Ingrese un nombre: ");
			nombre=sc.next();
			arreglo[i]=nombre;
			i++;
		}while(i<n);
		
		for(int j=0;j<n;j++)
			System.out.println("El nombre en la posicion "+j+" es: "+arreglo[j]);
	}

}
