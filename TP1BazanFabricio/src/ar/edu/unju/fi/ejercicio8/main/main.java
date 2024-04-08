package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		int n=sc.nextInt();
		CalculadoraEspecial cs=new CalculadoraEspecial();
		cs.setN(n);
		int sumatoria=cs.calcularSumatoria(n);
		int productoria=cs.calcularProductoria(n);
		System.out.println("La sumatoria de "+n+" es: "+sumatoria);
		System.out.println("La productoria de "+n+" es: "+productoria);
	}

}
