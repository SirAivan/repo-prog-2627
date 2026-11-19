package com.iesteis.prog.ud4;

import   java.util.Scanner;
public class TestPersona
{
	public static void main(String[] args)
	{
		Persona p = new Persona();
		Scanner   teclado = new Scanner(System.in);
		String nombre;

		System.out.print("Edad de la persona  ");
		int edad = teclado.nextInt();
		p.setEdad(edad);
		teclado.nextLine();
		System.out.print(" Introduce el Nombre de la persona  ");
		nombre = teclado.nextLine();
		p.setNombre(nombre);

		System.out.println(p.toString());
	}
}