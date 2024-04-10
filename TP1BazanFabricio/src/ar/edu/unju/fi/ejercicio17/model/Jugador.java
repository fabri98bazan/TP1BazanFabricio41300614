package ar.edu.unju.fi.ejercicio17.model;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private LocalDate fechaNac;
	private Float estatura;
	private Float peso;
	private String posicion;
	
	public Jugador() {
	
	}

	public Jugador(String nombre, String apellido, LocalDate fechaNac, Float estatura, Float peso, String posicion,String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
		this.nacionalidad=nacionalidad;
	}
	//Inicio de la seccion de metodos
	public int calcularEdad(LocalDate fechaNac) {
		int edad;
		LocalDate fechaActual=LocalDate.now();
		LocalDate fechaNacimiento=getFechaNac();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		edad=periodo.getYears();
		return edad;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void mostrarDatos() {
		int edad;
		edad=calcularEdad(this.getFechaNac());
		System.out.println("\nNombre y Apellido: "+this.getNombre()+", "+this.getApellido()+
							"\nNacionalidad: "+this.getNacionalidad()+
							"\nFecha de nacimiento: "+this.getFechaNac()+
							"\nEdad: "+edad+
							"\nPeso: "+this.getPeso()+"kg"+
							"\nEstatura: "+this.getEstatura()+"m.");
	}
	//Fin de la seccion de metodos
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Float getEstatura() {
		return estatura;
	}

	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
}
