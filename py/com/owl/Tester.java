package py.com.owl;

import py.com.owl.empresa.entidades.*;

public class Tester {
	
	public static void main (String[] argS) {
		Persona  p1 = new Persona ();
		p1.setNombre("JuanManuel");
		p1.setApellido("Mereles");
		p1.setSexo("Masculino");
		p1.setEdad(28);
		System.out.println(p1.toString());

		Empleado empleado = new Empleado();
		empleado.setNombre("JuanManuel");
		empleado.setApellido("Mereles");
		empleado.setSexo("Masculino");
		empleado.setEdad(28);

		System.out.println(empleado.toString());
		System.out.println(p1.getCodigoInternoPersona());
	}
}