package ar.edu.unju.fi.ejercicio2;

import java.lang.Math;

public class main {

	public static void main(String[] args) {
		String nombrePais, numTelefono;
		int edadPersona;
		double altEdificio, precioProdSuper, cos;
		nombrePais="Argentina";
		numTelefono="+543884654082";
		edadPersona=36;
		altEdificio=12.6;
		precioProdSuper=52.6;
		cos=Math.cos(0.5);
		System.out.println("El nombre del país: "+nombrePais+
							"\nEl número de telefono: "+numTelefono+
							"\nLa edad de la persona: "+edadPersona+
							"\nLa Altura del edificio: "+altEdificio+
							"\nEl precio de un producto del Supermercado: "+precioProdSuper+
							"\nEl coseno de 0.5: "+cos);
	}

}
