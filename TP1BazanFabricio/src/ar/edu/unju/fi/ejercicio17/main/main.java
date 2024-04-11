package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.time.LocalDate;

public class main {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc=0;
		ArrayList<Jugador>jugadores=new ArrayList<>();
		do
		{	
			System.out.flush();
			mostrarMenu();
			opc=manejarExcepcionIngresoNumEntero();
			switch(opc)
			{
				case 1:
					Jugador nJugador=generarJugador();
					jugadores.add(nJugador);
					break;
				case 2:
					if(jugadores.size()>0)
						mostrarJugador(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
				case 3:
					if(jugadores.size()>0)
						mostrarJugadoresOrdenadosPorApellido(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
				case 4:
					if(jugadores.size()>0)
						modificarJugador(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
				case 5:
					if(jugadores.size()>0)
						eliminarJugador(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
				case 6:
					if(jugadores.size()>0)
						mostrarCantidaddejugadores(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
				case 7:
					if(jugadores.size()>0)
						mostrarCantidaddejugadoresNacionalidad(jugadores);
					else
						System.out.println("No se añadieron jugadores");
					break;
			}
			System.out.println("Presione cualquier tecla para continuar...");
			pressAnyKeyToContinue();
			System.out.flush();
		}while(opc!=8);
		System.out.print("Fin del programa");
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
	
	public static Float manejarExcepcionIngresoNumFloat() {
		boolean band=false;
		Float n=(float) 0.0;
		do
		{
			band=false;
			try
			{
				n=sc.nextFloat();
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
	
	public static void mostrarMenu() {
		System.out.println("1) Alta a jugador");
		System.out.println("2) Mostrar datos del jugador");
		System.out.println("3) Mostrar jugadores ordenados por apellido");
		System.out.println("4) Modificar datos del jugador");
		System.out.println("5) Eliminar Jugador");
		System.out.println("6) Mostrar cantidad total de jugadores");
		System.out.println("7) Mostrar la cantidad de jugadores en un equipo");
		System.out.println("8) Salir");
		System.out.println("\nIngrese opcion: ");
	}

	
	
	public static String controlIngresoPalabra() {
		boolean band=false;
		String nombre;
		do {
			nombre=sc.next();
			if(nombre.length()<3 || nombre.matches(".*[^a-zA-Z].*")==true)
				System.out.println("Debe ingresar correctamente");
			else
				band=true;
		}while(band==false);
		return nombre;
	}
	
	public static int validarFechaAño() {
		int a=0;
		do
			a=manejarExcepcionIngresoNumEntero();
		while(a<1950 || a>2018);
		
		return a;
	}
	
	public static int validarFechaMes() {
		int a=0;
		do
			a=manejarExcepcionIngresoNumEntero();
		while(a<1 || a>12);
		
		return a;
	}
	
	public static int validarFechaDia(int mes) {
		int a=0;
		boolean band=false;
		do
		{
			do
				a=manejarExcepcionIngresoNumEntero();
			while(a<1 || a>31);
			
			if(mes==2 && a<29)
				band=true;
			else
			{
				if((mes==1 && a<=31) || (mes==3 && a<=31) ||(mes==5 && a<=31) ||(mes==7 && a<=31) ||(mes==8 && a<=31) ||(mes==10 && a<=31) ||(mes==12 && a<=31))
					band=true;
				else
				{
					if((mes==4 && a<=30) || (mes==6 && a<=30) ||(mes==9 && a<=30) ||(mes==11 && a<=30))
						band=true;
				}
			}
		}while(band==false);
		return a;
	}
	
	public static Float ingresarEstatura() {
		Float estatura;
		do
			estatura=manejarExcepcionIngresoNumFloat();
		while(estatura<1.5 || estatura>2.5);
		return estatura;
	}
	
	public static Float ingresarPeso() {
		Float peso;
		do
			peso=manejarExcepcionIngresoNumFloat();
		while(peso<52 || peso>120);
		return peso;
	}
	
	public static Jugador generarJugador() {
		System.out.println("**DAR DE ALTA A UN JUGADOR**");
		Jugador j=new Jugador();
		System.out.print("Ingrese nombre del jugador: ");
		String nombre=controlIngresoPalabra();
		System.out.print("Ingrese apellido del jugador: ");
		String apellido=controlIngresoPalabra();
		System.out.print("Ingrese Nacionalidad del jugador: ");
		String nacionalidad=controlIngresoPalabra();
		System.out.print("Ingrese año de nacimiento(1950-2018): ");
		int anioNac=validarFechaAño();
		System.out.print("Ingrese mes de nacimiento(1-12): ");
		int mesNac=validarFechaMes();
		System.out.print("Ingrese día de nacimiento(1-31): ");
		int dia=validarFechaDia(mesNac);
		LocalDate fechaNac=LocalDate.of(anioNac, mesNac, dia);
		System.out.print("Ingrese estatura: ");
		Float est=ingresarEstatura();
		System.out.print("Ingrese Peso: ");
		Float peso=ingresarPeso();
		System.out.println("Ingrese una opcion, a cual posicion jugará: ");
		String posicion = null;
		int opc=0;
		do
		{	
			System.out.println("1. Delantero");
			System.out.println("2. Medio");
			System.out.println("3. Defensa");
			System.out.println("4. Arquero");
			opc=manejarExcepcionIngresoNumEntero();
			switch(opc)
			{
				case 1:
					posicion="Delantero";
					break;
				case 2:
					posicion="Medio";
					break;
				case 3:
					posicion="Defensa";
					break;
				case 4:
					posicion="Arquero";
					break;
			}
		}while(opc<0 || opc>=5);
		
		j.setNombre(nombre);
		j.setApellido(apellido);
		j.setNacionalidad(nacionalidad);
		j.setFechaNac(fechaNac);
		j.setEstatura(est);
		j.setPeso(peso);
		j.setPosicion(posicion);
		return j;
	}
	
	public static void mostrarJugador(ArrayList<Jugador> jugadores) {
		  System.out.println("**MOSTRAR DATOS DE UN JUGADOR**");
	        boolean encontrado = false;
	        String nombreAux, apellidoAux;
	        System.out.print("Ingrese nombre del jugador: ");
	        nombreAux = controlIngresoPalabra();
	        System.out.print("Ingrese apellido del jugador: ");
	        apellidoAux = controlIngresoPalabra();
	        
	        for (Jugador jugador : jugadores) {
	            if (nombreAux.equals(jugador.getNombre()) && apellidoAux.equals(jugador.getApellido())) 
	            {
	                encontrado = true;
	                System.out.println("**DATOS DEL JUGADOR**");
	                jugador.mostrarDatos();
	                break; // Terminar el bucle si se encuentra el jugador
	            }
	        }
	        
	        if (!encontrado) {
	            System.out.println("No se encontró jugador");
	        }
	}
	
	
	public static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
        // Crear un comparador para ordenar por apellido
		//Implementamos la interfaz Comparador para comparar el apellido de ambos jugadores y reordenarlos
        Comparator<Jugador> comparadorApellido = new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                return jugador1.getApellido().compareTo(jugador2.getApellido());
            }
            //Esta parte se trabaja repetidamente para ordenar todos los elementos del array
        };

        // Ordenar los jugadores utilizando el comparador
        Collections.sort(jugadores, comparadorApellido);

        // Mostrar los jugadores ordenados
        System.out.println("**JUGADORES ORDENADOS POR APELLIDO**");
        for (Jugador jugador : jugadores) {
            jugador.mostrarDatos();
        }
    }
	
	public static void modificarJugador(ArrayList<Jugador> jugadores) {
		 System.out.println("**MODIFICAR DATOS DE UN JUGADOR**");
		 boolean band=false;
		 int pos = 0;
	     String nombreAux, apellidoAux;
	     System.out.print("Ingrese nombre del jugador: ");
	     nombreAux = controlIngresoPalabra();
	     System.out.print("Ingrese apellido del jugador: ");
	     apellidoAux = controlIngresoPalabra();
	     for (Jugador jugador:jugadores) {
	    	 if (jugador.getNombre().equals(nombreAux) && jugador.getApellido().equals(apellidoAux)) {
	    		 System.out.print("Ingrese NUEVO nombre del jugador: ");
	    			String nombre=controlIngresoPalabra();
	    			System.out.print("Ingrese NUEVO  apellido del jugador: ");
	    			String apellido=controlIngresoPalabra();
	    			System.out.print("Ingrese NUEVA Nacionalidad del jugador: ");
	    			String nacionalidad=controlIngresoPalabra();
	    			System.out.print("Ingrese  NUEVO año de nacimiento(1950-2018): ");
	    			int anioNac=validarFechaAño();
	    			System.out.print("Ingrese  NUEVO mes de nacimiento(1-12): ");
	    			int mesNac=validarFechaMes();
	    			System.out.print("Ingrese NUEVO  día de nacimiento(1-31): ");
	    			int dia=validarFechaDia(mesNac);
	    			LocalDate fechaNac=LocalDate.of(anioNac, mesNac, dia);
	    			System.out.print("Ingrese NUEVA  estatura: ");
	    			Float est=ingresarEstatura();
	    			System.out.print("Ingrese NUEVO  Peso: ");
	    			Float peso=ingresarPeso();
	    			System.out.println("Ingrese una NUEVA opcion, a cual posicion jugará: ");
	    			String posicion = null;
	    			int opc=0;
	    			do
	    			{	
	    				System.out.println("1. Delantero");
	    				System.out.println("2. Medio");
	    				System.out.println("3. Defensa");
	    				System.out.println("4. Arquero");
	    				opc=manejarExcepcionIngresoNumEntero();
	    				switch(opc)
	    				{
	    					case 1:
	    						posicion="Delantero";
	    						break;
	    					case 2:
	    						posicion="Medio";
	    						break;
	    					case 3:
	    						posicion="Defensa";
	    						break;
	    					case 4:
	    						posicion="Arquero";
	    						break;
	    				}
	    			}while(opc<0 || opc>=5);
	    			jugador.setNombre(nombre);
	    			jugador.setApellido(apellido);
	    			jugador.setNacionalidad(nacionalidad);
	    			jugador.setFechaNac(fechaNac);
	    			jugador.setEstatura(est);
	    			jugador.setPeso(peso);
	    			jugador.setPosicion(posicion);
	            break; // Termina el bucle después de encontrar el jugador
	        }
	    }
	}
	
	public static void eliminarJugador(ArrayList<Jugador> jugadores)
	{
		 System.out.println("**ELIMINAR UN JUGADOR**");
		 boolean band=false;
		 int pos = 0;
	     String nombreAux, apellidoAux;
	     System.out.print("Ingrese nombre del jugador: ");
	     nombreAux = controlIngresoPalabra();
	     System.out.print("Ingrese apellido del jugador: ");
	     apellidoAux = controlIngresoPalabra();
	     for(int i=0;i<jugadores.size() && band==false;i++)
	     {
	    	 Jugador jugador=jugadores.get(i);
	    	 if(jugador.getNombre().equals(nombreAux) && jugador.getApellido().equals(apellidoAux))
	    	 {	
	    		 System.out.println("jugador a eliminar: ");
	    		 jugador.mostrarDatos();
	    		 jugadores.remove(jugador);
	    		 band=true;
	    	 }
	     }
	}
	
	public static void mostrarCantidaddejugadores(ArrayList<Jugador> jugadores)
	{
		int i=0;
		for(Jugador juga:jugadores)
			i++;
		System.out.println("CANTIDAD DE JUGADORES EN TOTAL: "+i);
	}

	public static void mostrarCantidaddejugadoresNacionalidad(ArrayList<Jugador> jugadores)
	{
		int i=0;
		System.out.print("Ingrese una Nacionalidad: ");
		String nac=controlIngresoPalabra();
		for(Jugador juga:jugadores)
		{
			if(juga.getNacionalidad().equals(nac))
				i++;
		}
		System.out.println("CANTIDAD DE JUGADORES DE LA NACIONALIDAD "+nac+": "+i);
	}
	
	static public void pressAnyKeyToContinue()
	{
	    String seguir;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Press Enter key to continue...");
	    try
	    {
	        seguir = teclado.nextLine();
	    }
	    catch(Exception e)
	    {}
	}
	
	
}
