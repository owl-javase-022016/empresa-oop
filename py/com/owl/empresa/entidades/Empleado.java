package py.com.owl.empresa.entidades;

import java.util.Date;

public abstract class Empleado extends Persona implements Liquidable, Bonificable {
	private final double SALARIO_MINIMO_VIGENTE = 1800000.0;

	private double montoLiquidacion;
	private int cantidadHijos;
	private int idEmpleado;

	public double calcularBonificacionFamiliar() {
		double bonificacionPorHijo = SALARIO_MINIMO_VIGENTE * 5 / 100;
		return bonificacionPorHijo * this.cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos=cantidadHijos;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado=idEmpleado;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}
}