package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Ingresar número entero ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" es par");
			num=num*3;
			System.out.println("El triple del número: "+num);
		}
		else
		{
			System.out.println(num+" es impar");
			num=num*2;
			System.out.println("El doble del número: "+num);
		}
	}

}