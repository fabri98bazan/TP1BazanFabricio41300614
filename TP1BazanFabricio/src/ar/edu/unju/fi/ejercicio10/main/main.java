package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.*;

public class main {

	public static void main(String[] args) {
		generarPizza();
	}
	
	public static void generarPizza() {
		int cantPizza=0;
		Float area;
		Scanner sc= new Scanner(System.in);
		while(cantPizza<3)
		{
			Pizza pizza=new Pizza();
			boolean ingredientes;
			Float precio;
			System.out.print("Ingrese el diametro de la pizza 20, 30 o 40: ");
			int diam=sc.nextInt();
			System.out.print("¿Desea agregar ingredientes?: ");
			char resp=sc.next().charAt(0);
			
			if(resp=='s' || resp=='S')
				ingredientes=true;
			else
				ingredientes=false;
			
			switch(diam) {
				case 20:
					precio=(float) 4500.0;
					if(ingredientes==false)
						pizza.setPrecio(precio);
					else
					{
						pizza.setPrecio(precio);
						precio=pizza.calcularPrecio(diam);
						pizza.setPrecio(precio);
					}
					pizza.setDiametro(diam);
					pizza.setIng_especiales(ingredientes);
					area=pizza.calcularArea((float) diam);
					pizza.setArea(area);
					pizza.mostrarDatos();
					break;
				
				case 30:
					precio=(float) 4800.0;
					if(ingredientes==false)
						pizza.setPrecio(precio);
					else
					{
						pizza.setPrecio(precio);
						precio=pizza.calcularPrecio(diam);
						pizza.setPrecio(precio);
					}
					pizza.setDiametro(diam);
					pizza.setIng_especiales(ingredientes);
					area=pizza.calcularArea((float) diam);
					pizza.setArea(area);
					pizza.mostrarDatos();
					break;
					
				case 40:
					precio=(float) 5500.0;
					if(ingredientes==false)
						pizza.setPrecio(precio);
					else
					{
						pizza.setPrecio(precio);
						precio=pizza.calcularPrecio(diam);
						pizza.setPrecio(precio);
					}
					pizza.setDiametro(diam);
					pizza.setIng_especiales(ingredientes);
					area=pizza.calcularArea((float) diam);
					pizza.setArea(area);
					pizza.mostrarDatos();
					break;
					
				default:
					System.out.println("Numero ingresado no valido...");
			}
			cantPizza++;
		}
		sc.close();
	}

}
