package ar.edu.unju.fi.ejercicio12.main;


import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre;
		Calendar fechaNac=Calendar.getInstance();
		System.out.print("Ingrese nombre: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese fecha de nacimiento año/mes/fecha: ");
		int anioNac=sc.nextInt();
		int mesNac=sc.nextInt();
		int diaNac=sc.nextInt();
		fechaNac.set(anioNac, mesNac-1, diaNac);
		Persona p= new Persona();
		p.setNombre(nombre);
		p.setFechaNac(fechaNac);
		p.mostrarDatos();
	}

}
