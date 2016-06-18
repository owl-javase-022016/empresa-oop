package py.com.owl;

import py.com.owl.empresa.entidades.*;

public class Tester{
	public static void main(String[] args){
		Persona p1 = new Persona();
		p1.nombre = ("Liz");
		p1.setApellido("Torres");
		p1.setSexo("Femenino");
		p1.setEdad(30);

		Empleado empleado = new Empleado();
		empleado.setNombre("Juan");
		empleado.setApellido("Perez");
		empleado.setSexo("Masculino");
		empleado.setEdad(25);

		Persona.Documento personaDocumento = p1.new Documento();

		System.out.println(p1.getCodigoInternoPersona());
	}

}
