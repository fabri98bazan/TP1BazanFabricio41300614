package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public Persona() {
		
	}

	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	//Inicio de la seccion de metodos
	public int calcularEdad() {
		int edad;
		Calendar fecha = Calendar.getInstance();
		fecha.getTime();
		edad=fecha.get(Calendar.YEAR)-this.getFechaNac().get(Calendar.YEAR);
		return edad;
	}
	
	public String obtenerEstacionNacimiento() {
        int mes = this.getFechaNac().get(Calendar.MONTH) + 1; // Los meses en Calendar empiezan desde 0

        String estacion = null;
        if(mes>=3 && mes<7)
        	estacion="Otonio";
        else
        {
        	if(mes>=7 && mes<9)
        		estacion="Invierno";
        	else
        	{
        		if(mes>=9 && mes<12)
        			estacion="Primavera";
        		else
        			estacion="Verano";
        	}
        }
        	

        
        return estacion;
    }
	
	public String mencionarSigno() {
		int mes=this.getFechaNac().get(Calendar.MONTH)+1;
		int dia=this.getFechaNac().get(Calendar.DAY_OF_MONTH);
		
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else { // Del 19 de febrero al 20 de marzo
            return "Piscis";
        }
	}
	
	
	public void mostrarDatos() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: "+this.getNombre()+
				"\nFecha nacimiento: "+sdf.format(this.getFechaNac().getTime())+
				"\nEdad: "+calcularEdad()+
				"\nSigno: "+mencionarSigno()+
				"\nEstacion: "+obtenerEstacionNacimiento());
	}
	
	
	//Fin de la seccion de metodos
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
}
