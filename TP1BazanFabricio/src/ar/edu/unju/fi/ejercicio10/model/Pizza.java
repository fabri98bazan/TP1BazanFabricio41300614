package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private Float precio;
	private Float area;
	private boolean ing_especiales;
	private final int AD_ING1=500;
	private final int AD_ING2=750;
	private final int AD_ING3=1000;
	
	public Pizza() {
		
	}
	
	//Inicio de seccion de metodos
	
	public Float calcularPrecio(int d)
	{
		switch(d)
		{
			case 20:
				this.precio+=AD_ING1;
				break;
			case 30:
				this.precio+=AD_ING2;
				break;
			case 40:
				this.precio+=AD_ING3;
				break;
		}
		return this.precio;
	}
	
	public void mostrarDatos() {
		System.out.println();
		System.out.println("Diametro: " + this.getDiametro() + 
				"\nIngredientes: " + this.isIng_especiales() + 
				"\nprecio: " + this.getPrecio()+
				"\nArea: " + this.getArea());
	}
	
	public Float calcularArea(Float diametro) {
		return this.area=(float) (Math.PI*Math.pow(this.diametro, 2));
	}
	
	//Fin de seccion de metodos
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public Float getArea() {
		return area;
	}
	
	public void setArea(Float area) {
		this.area = area;
	}
	
	public boolean isIng_especiales() {
		return ing_especiales;
	}
	
	public void setIng_especiales(boolean ing_especiales) {
		this.ing_especiales = ing_especiales;
	}
	
	public int getAD_ING1() {
		return AD_ING1;
	}
	public int getAD_ING2() {
		return AD_ING2;
	}
	
	public int getAD_ING3() {
		return AD_ING3;
	}
	
	
}
