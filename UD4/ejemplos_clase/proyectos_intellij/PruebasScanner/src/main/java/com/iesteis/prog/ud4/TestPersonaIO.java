package com.iesteis.prog.ud4;


public class TestPersonaIO
{
	public static void main(String[] args)
	{
		Persona p = new Persona();
		String nombre;

		System.out.print("Edad de la persona  ");
		int edad = Integer.parseInt(IO.readln());
		p.setEdad(edad);
		System.out.print(" Introduce el Nombre de la persona  ");
		nombre = IO.readln();
		p.setNombre(nombre);

		System.out.println(p.toString());
	}
}