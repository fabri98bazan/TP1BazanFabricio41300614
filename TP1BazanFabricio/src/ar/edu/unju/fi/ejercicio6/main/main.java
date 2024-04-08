package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.*;


public class main {

	public static void main(String[] args) {
		//Con constructor por defecto
		Persona p1= generarPersona();
		p1.mostrarDatos();
		//Con constructor por valores 
		LocalDate fechaAux=LocalDate.of(2010, 9, 13);
		Persona p2 = new Persona("12345678","Fernando",fechaAux,"Mendoza");
		p2.mostrarDatos();
		//Con constructor por valores 
		LocalDate fechaAux1=LocalDate.of(2002, 9, 13);
		Persona p3 = new Persona("12345398","Rigoberto",fechaAux1);
		p3.mostrarDatos();
	}
	
	public static Persona generarPersona() {
		Scanner sc=new Scanner(System.in);
		Persona p= new Persona();
		System.out.print("Ingrese nombre: ");
		String nombre=controlIngresoPalabra();
		System.out.print("Ingrese DNI: ");
		String dni=sc.next();
		System.out.print("Ingrese provincia: ");
		String prov=controlIngresoPalabra();
		System.out.print("Ingrese fecha: ");
		int dia=sc.nextInt();
		System.out.print("Ingrese mes(1-12): ");
		int mes=sc.nextInt();
		System.out.print("Ingrese anio de Nacimiento: ");
		int anio=sc.nextInt();
		LocalDate fechaNac= LocalDate.of(anio,mes,dia);
		p.setNombre(nombre);
		p.setDni(dni);
		p.setFechaNacimiento(fechaNac);
		p.setProvincia(prov);
		sc.close();
		return p;
	}
	
	public static String controlIngresoPalabra() {
		Scanner sc=new Scanner(System.in);
		boolean band=false;
		String nombre;
		do {
			nombre=sc.next();
			if(nombre.length()<3 || nombre.matches(".*[^a-zA-Z].*")==true)
				System.out.println("Debe ingresar correctamente");
			else
				band=true;
		}while(band==false);
		return nombre;
	}
	
	public static String controlIngresoDNI() {
		Scanner sc=new Scanner(System.in);
		boolean band=false;
		String dni;
		do {
			dni=sc.next();
			if(dni.length()!=8 || dni.matches(".*[^0-9].*")==true)
				System.out.println("Debe ingresar correctamente el DNI");
			else
				band=true;
		}while(band==false);
		return dni;
	} 

}