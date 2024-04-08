package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}
	//Metodos
	
	public int calcularEdad(LocalDate fechaNacimiento) {
		int edad;
		LocalDate fechaActual=LocalDate.now();
		LocalDate fechaNac=getFechaNacimiento();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		edad=periodo.getYears();
		return edad;
	}
	
	public boolean verificarEdad(int edad) {
		boolean band=false;
		if(edad>=18)
		{
			band=true;
		}
		return band;
	}

	public void mostrarDatos() {
		System.out.println();
		int edad=calcularEdad(this.getFechaNacimiento());
		System.out.print("DNI: "+this.getDni()+
						"\nNombre: "+this.getNombre()+
						"\nEdad: "+edad+
						"\nProvincia: "+this.getProvincia());
		if(verificarEdad(edad)==true)
			System.out.println("\nEs mayor de edad");
		else
			System.out.println("\nEs menor de edad");
	}
	
	
	//Fin de la seccion de Metodos
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
	
}
