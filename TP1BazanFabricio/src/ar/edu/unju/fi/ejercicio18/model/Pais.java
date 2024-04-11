package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private int cod;
	private String nombrePais;
	
	public Pais() {
		
	}

	public Pais(int cod, String nombrePais) {
		this.cod = cod;
		this.nombrePais = nombrePais;
	}

	public void mostrarDatosPais()
	{
		System.out.print("\nPais: "+this.getNombrePais()+
						"\nCodigo: "+this.getCod()+
						"\n");
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	
	
}
