package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class main {

	public static void main(String[] args) {
		generarProducto();
	}
	
	public static void generarProducto() {
		int cantProd=0;
		Scanner sc=new Scanner(System.in);
		while(cantProd<3) {
			Producto p=new Producto();
			System.out.print("Ingrese nombre del producto: ");
			String nombre=sc.next();
			System.out.print("Ingrese el codigo del producto: ");
			Integer cod=sc.nextInt();
			System.out.print("Ingrese el precio del producto: ");
			double prec=sc.nextDouble();
			System.out.print("Desea aniadir descuento? ingrese s/S para afirmativo: ");
			char a=sc.next().charAt(0);
			if(a=='s' || a=='S')
			{
				int desc=0;
				do
				{
					System.out.print("Ingrese descuento: ");
					desc=sc.nextInt();
				}while(desc<=0 || desc>50);
				p.setDescuento(desc);
				p.setPrecio(prec);
				p.calcularDescuento();
			}
			else
			{
				p.setPrecio(prec);
			}
			p.setCod(cod);
			p.setNombre(nombre);
			
			p.mostrarDatos();
			if(a=='s'||a=='S') {
				System.out.println("Precio  del producto con descuento: ");
				p.mostrarDatosConDesc();
			}
				
			cantProd++;
		}
		sc.close();
	}

}
