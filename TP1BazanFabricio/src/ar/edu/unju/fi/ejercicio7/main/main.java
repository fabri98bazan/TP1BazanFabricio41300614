package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class main {

	public static void main(String[] args) {
		Empleado empleado= generarEmplado();
		empleado.mostrarDatosEmpleado();
		empleado.aumentarSalario(empleado.getSalario());
		System.out.println("AUMENTO SALARIAL POR MERITO");
		empleado.mostrarDatosEmpleado();

	}
	
	public static Empleado generarEmplado() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese nombre del empleado: ");
		String nombre=sc.nextLine();
		System.out.print("Ingrese legajo del empleado: ");
		Integer legajo=sc.nextInt();
		System.out.print("Ingrese salario del empleado: ");
		Double salario=sc.nextDouble();
		Empleado empleado=new Empleado(nombre,legajo,salario);
		sc.close();
		return empleado;
	}

}
