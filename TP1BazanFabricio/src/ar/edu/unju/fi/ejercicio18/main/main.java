package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class main {
	
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Pais>paises=new ArrayList<>();
		ArrayList<DestinoTuristico>destinos=new ArrayList<>();
		cargarPaises(paises);
		Integer opc=0;
		do
		{
			mostrarMenu();
			opc=manejarExcepcionIngresoNumEntero();
			switch(opc)
			{
				case 1:
					DestinoTuristico n_destino=generarDestino(paises);
					destinos.add(n_destino);
					break;
					
				case 2:
					if(destinos.size()>0)
						mostrarDestinos(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
				case 3:
					if(destinos.size()>0)
						modificarPaisDestino(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
				case 4:
					if(destinos.size()>0)
						limpiarDestinos(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
				case 5:
					if(destinos.size()>0)
						eliminarUnDestino(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
				case 6:
					if(destinos.size()>0)
						mostrarDestinosOrdenadosPorNombres(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
				case 7:
					mostrarPaises(paises);
					break;
					
				case 8:
					if(destinos.size()>0)
						mostrarListaDestinosPorPais(destinos);
					else
						System.out.println("No hay destinos cargados");
					break;
					
			}
			
		}while(opc!=9);
	}
	
	public static void mostrarMenu() {
		System.out.println("1) Alta de destino turístico");
		System.out.println("2) Mostrar todos los destinos turisticos");
		System.out.println("3) Modificar el país de un destino turístico");
		System.out.println("4) Limpiar de destino turísticos");
		System.out.println("5) Eliminar un destino turístico");
		System.out.println("6) Mostrar los destinos ordenados por nombre");
		System.out.println("7) Mostrar todos los países");
		System.out.println("8) Mostrar los destinos turísticos que pertenecen a un país");
		System.out.println("9) Salir");
		System.out.print("\nIngrese opcion: ");
	}
	
	public static int manejarExcepcionIngresoNumEntero() {
		boolean band=false;
		int n=0;
		do
		{
			band=false;
			try
			{
				n=sc.nextInt();
				band=true;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Error al ingresar");
				sc.next();
				
			}
		}while(band==false);
		return n;
	}
	
	public static double manejarExcepcionIngresoNumReal() {
		boolean band=false;
		double n=0;
		do
		{
			band=false;
			try
			{
				n=sc.nextDouble();
				band=true;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Error al ingresar");
				sc.next();
				
			}
		}while(band==false);
		return n;
	}
	
	
	public static String controlIngresoPalabra() {
		boolean band=false;
		String nombre;
		do {
			nombre=sc.nextLine();
			if(nombre.length()<3 || nombre.matches(".*[^a-zA-Z].*")==true)
				System.out.println("Debe ingresar correctamente");
			else
				band=true;
		}while(band==false);
		return nombre;
	}
	
	public static Integer controlCantidad()
	{
		Integer cant=0;
		do
			cant=manejarExcepcionIngresoNumEntero();
		while(cant<0 || cant>50);
		return cant;
	}
	
	public static void cargarPaises(ArrayList<Pais> paises)
	{
		Pais p1=new Pais(214,"Argentina");
		paises.add(p1);
		Pais p2=new Pais(235,"Colombia");
		paises.add(p2);
		Pais p3=new Pais(225,"Uruguay");
		paises.add(p3);
		Pais p4=new Pais(211,"Chile");
		paises.add(p4);
		Pais p5=new Pais(241,"México");
		paises.add(p5);
		Pais p6=new Pais(239,"Peru");
		paises.add(p6);
		Pais p7=new Pais(245,"Brasil");
		paises.add(p7);
	}
	
	public static void mostrarPaises(ArrayList<Pais> paises)
	{
		for(Pais pais:paises)
		{
			pais.mostrarDatosPais();
		}
	}
	
	public static void mostrarDestinos(ArrayList<DestinoTuristico> destinos)
	{
		int i=1;
		for(DestinoTuristico dest:destinos)
		{
			System.out.println("*******DESTINO NRO: "+i+" **********");
			dest.mostrarDatosDestino();
			i++;
		}
	}
	
	public static double controlIngresoPrecio()
	{
		double precio=0;
		do
			precio=manejarExcepcionIngresoNumReal();
		while(precio<2000 || precio>9999);
		return precio;
	}
	
	public static DestinoTuristico generarDestino(ArrayList<Pais> paises)
	{
		System.out.println("***SECCION DE ALTA DESTINO***");
		Pais pais=new Pais();
		boolean band=false;
		DestinoTuristico n_destino=new DestinoTuristico();
		System.out.print("Ingrese codigo del destino: ");
		Integer cod_destino=manejarExcepcionIngresoNumEntero();
		System.out.print("Ingrese nombre del destino: ");
		String nom_destino=controlIngresoPalabra();
		System.out.print("Ingrese precio: ");
		double prec_destino=controlIngresoPrecio();
		int cod_pais=0;
		
		do
		{
			System.out.print("Ingrese codigo de pais: ");
			cod_pais=manejarExcepcionIngresoNumEntero();
			for(Pais aux:paises)
			{
				if(aux.getCod()==cod_pais)
				{
					pais=aux;
					band=true;
					
				}
			}
		}while(band==false);
		
		System.out.print("Ingrese cantidad de días: ");
		Integer cant_dias=controlCantidad();
		n_destino.setNombre(nom_destino);
		n_destino.setCodigo(cod_destino);
		n_destino.setPrecio(prec_destino);
		n_destino.setPais(pais);
		n_destino.setCant_dias(cant_dias);
		
		return n_destino;
	}
	
	public static void modificarPaisDestino(ArrayList<DestinoTuristico> destinos)
	{
		System.out.println("**SECCION DE MODIFIACION DE PAIS**");
		System.out.print("Ingrese codigo del destino: ");
		int cod_dest=manejarExcepcionIngresoNumEntero();
		boolean band=false;
		for(DestinoTuristico dest:destinos)
		{
			if(dest.getCodigo()==cod_dest)
			{
				System.out.println("DESTINO: "+dest.getNombre());
				System.out.print("Ingrese nuevo nombre de Pais: ");
				String nuevo_nombre=controlIngresoPalabra();
				System.out.print("Ingrese nuevo codigo: ");
				int nuevo_cod=manejarExcepcionIngresoNumEntero();
				dest.getPais().setCod(nuevo_cod);
				dest.getPais().setNombrePais(nuevo_nombre);
				band=true;
			}
			break;
		}
		
		if(band==false)
			System.out.println("No se encontró destino");
	}
	
	public static void limpiarDestinos(ArrayList<DestinoTuristico> destinos)
	{
		System.out.println("*****DESTINOS LIMPIOS*****");
		destinos.clear();
	}
	
	public static void eliminarUnDestino(ArrayList<DestinoTuristico> destinos)
	{
		System.out.println("**SECCION DE ELIMINACION DE PAIS**");
		System.out.print("Ingrese codigo de destino: ");
		int cod_elim=manejarExcepcionIngresoNumEntero();
		boolean band=false;
		for(int i=0;i<destinos.size() && band==false ;i++)
		{
			DestinoTuristico elim_dest=destinos.get(i);
			if(cod_elim==destinos.get(i).getCodigo())
			{
				System.out.println("DESTINO A ELIMINAR: ");
				elim_dest.mostrarDatosDestino();
				destinos.remove(elim_dest);
				band=true;
			}
		}
	}
	
	public static void mostrarDestinosOrdenadosPorNombres(ArrayList<DestinoTuristico> destinos) {
        // Crear un comparador para ordenar por nombre
		//Implementamos la interfaz Comparador para comparar el nombre de ambos destinos y reordenarlos
        Comparator<DestinoTuristico> comparadorNombre = new Comparator<DestinoTuristico>() {
            @Override
            public int compare(DestinoTuristico dest1, DestinoTuristico dest2) {
                return dest1.getNombre().compareTo(dest2.getNombre());
            }
            //Esta parte se trabaja repetidamente para ordenar todos los elementos del array
        };

        // Ordenar los jugadores utilizando el comparador
        Collections.sort(destinos, comparadorNombre);

        // Mostrar los destinos ordenados
        System.out.println("**DESTINOS ORDENADOS POR NOMBRE**");
        for (DestinoTuristico dest : destinos) {
            dest.mostrarDatosDestino();
        }
    }
	
	public static void mostrarListaDestinosPorPais(ArrayList<DestinoTuristico> destinos)
	{
		System.out.println("***DESTINOS QUE COMPARTEN UN PAIS***");
		System.out.print("Ingrese el codigo del pais: ");
		int cod_pais=manejarExcepcionIngresoNumEntero();
		for(DestinoTuristico dest: destinos)
		{
			if(dest.getPais().getCod()==cod_pais)
				dest.mostrarDatosDestino();
		}
	}

}
