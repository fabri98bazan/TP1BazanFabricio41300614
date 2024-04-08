package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombreEmpleado;
	private Integer legajo;
	private double salario;
	private final double SAL_MINIMO=210000.00;
	private final double AUMENTO_MERITO=20000.00;
	
	public Empleado(String nombreEmpleado, Integer legajo, double salario) {
		this.nombreEmpleado = nombreEmpleado;
		this.legajo = legajo;
		if(salario>=SAL_MINIMO) 
			this.salario = salario;
		else
			this.salario = SAL_MINIMO;
	}
	
	//Metodos
	public void mostrarDatosEmpleado()
	{
		System.out.println();
		System.out.println("Nombre del empleado: "+this.getNombreEmpleado()+
						"\nLegajo: "+this.getLegajo()+
						"\nSalario $: "+this.getSalario());
	}

	public double aumentarSalario(double salario) {
		return this.salario+=AUMENTO_MERITO;
	}
	
	//Fin de los Metodos
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSAL_MINIMO() {
		return SAL_MINIMO;
	}

	public double getAUMENTO_MERITO() {
		return AUMENTO_MERITO;
	}
	
	
	
}