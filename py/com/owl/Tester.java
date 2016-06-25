package py.com.owl;

import py.com.owl.empresa.entidades.Persona;
import py.com.owl.empresa.entidades.Empleado;

public class Tester {
	
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Rafael";
		p1.setApellido("Benegas");
		p1.setSexo("Masculino");
		p1.setEdad(28);

		Empleado empleado = new Empleado();
		empleado.setNombre("Rafael");
		empleado.setApellido("Benegas");
		empleado.setSexo("Masculino");
		empleado.setEdad(28);

		System.out.println(p1.toString());
		System.out.println(empleado.toString());
	}
}