package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,aux=1,fact;
		System.out.println("Ingrese un número del 1 al 10 para calcular su factorial: ");
		n=sc.nextInt();
		if(n>=0 && n<=10)
		{
			if(n==0 || n==1) 
			{
				System.out.println("El factorial de "+n+" es:" +1);
			}
			else
			{
				fact=n;
				while(aux<n)
				{
					fact*=(n-aux);
					aux++;
				}
				System.out.println("El factorial de "+n+" es:" +fact);
			}
		}
		else
		{
			System.out.println("numero fuera de rango");
		}
	}

}