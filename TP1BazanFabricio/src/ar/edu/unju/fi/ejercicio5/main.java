package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Ingrese un numero de 1 al 9: ");
		n=sc.nextInt();
		if(n>=1 && n<=9)
		{
			for(int i=0; i<=10; i++)
			{
				System.out.println(n+" x "+i+" = "+i*n);
			}
		}
		else
			System.out.println("Numero fuera de rango");
	}
}