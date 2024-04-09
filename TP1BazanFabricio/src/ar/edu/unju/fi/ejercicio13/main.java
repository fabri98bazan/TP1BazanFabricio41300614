package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] arreglo=new int[8];
		int i=0, num;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Ingrese un numero entero: ");
			num=sc.nextInt();
			arreglo[i]=num;
			i++;
		}while(i<8);
		
		for(int j=0; j<8;j++)
			System.out.print(arreglo[j]+"  ");

	}

}
