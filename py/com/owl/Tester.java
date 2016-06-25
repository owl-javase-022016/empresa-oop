package py.com.owl;

import py.com.owl.empresa.entidades.Persona;
import py.com.owl.empresa.entidades.Empleado;
import py.com.owl.empresa.entidades.Vendedor;
import py.com.owl.empresa.entidades.SupervisorVentas;

import py.com.owl.empresa.entidades.Liquidable;
import py.com.owl.empresa.entidades.Bonificable;

import py.com.owl.empresa.NominaEmpleados;
import py.com.owl.empresa.NominaVendedores;

import java.util.Date;

public class Tester {
	
	public double totalBonificacionesAPagar;

	public static void main(String[] args) {
		Empleado jose = new Vendedor();
		jose.setCantidadHijos(2);

		Empleado victor = new SupervisorVentas();
		victor.setCantidadHijos(1);

		Empleado marta = new Vendedor();

		Tester t = new Tester();
		t.acumularBonificaciones(jose);
		t.acumularBonificaciones(victor);
		t.acumularBonificaciones(marta);

		System.out.println(t.totalBonificacionesAPagar);
		NominaEmpleados nomina = new NominaVendedores();

		Empleado e = nomina.obtenerEmpleado(0);
	}


	public void probarPolimorfismo(Liquidable empleado) {
		empleado.liquidarEmpleado("Despido por reducción de empleados.", new Date());
	}

	public void acumularBonificaciones(Empleado empleado) {
		int hijos = empleado.getCantidadHijos();
		totalBonificacionesAPagar += obtenerBonificacion(empleado);
	}

	public double obtenerBonificacion(Bonificable b) {
		return b.calcularBonificacionFamiliar();
	}
}