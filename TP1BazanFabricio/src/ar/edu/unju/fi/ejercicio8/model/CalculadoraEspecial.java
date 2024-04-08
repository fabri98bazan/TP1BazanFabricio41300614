package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		
	}
	
	//Inicio de seccion de metodos
	public int calcularSumatoria(int n) {
		int sumatoria=0;
		for(int k=1;k<=n;k++)
		{
			sumatoria+=Math.pow((k*(k+1))/2, 2);
		}
		return sumatoria;
	}
	
	public int calcularProductoria(int n) {
		int productoria=1;
		for(int k=1;k<=n;k++)
		{
			productoria*=k*(k+4);
		}
		return productoria;
	}
	
	//Fin de seccion de metodos

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
