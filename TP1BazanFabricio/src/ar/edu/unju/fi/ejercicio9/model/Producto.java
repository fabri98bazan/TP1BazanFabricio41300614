package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private Integer cod;
	private double precio;
	private int descuento;
	
	public Producto() {
		
	}
	
	//Inicio de seccion de métodos
	
	public double calcularDescuento() {
		double resultado=0,desc;
		desc=(this.getPrecio()*this.getDescuento())/100;
		resultado=this.getPrecio()-desc;
		return resultado;
	}
	
	//Fin de seccion de métodos

	
	
	public String getNombre() {
		return nombre;
	}

	public void mostrarDatos() {
		System.out.println();
		System.out.println("nombre: " + this.getNombre() + 
				"\ncod: " + this.getCod() + 
				"\nprecio: " + this.getPrecio());
	}
	
	public void mostrarDatosConDesc() {
		System.out.println();
		System.out.println("nombre: " + this.getNombre() + 
				"\ncod: " + this.getCod() + 
				"\nprecio: " + this.getPrecio()+
				"\ndesc: "+"%"+this.getDescuento()+
				"\ndecuento total: "+this.calcularDescuento());
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return  descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}