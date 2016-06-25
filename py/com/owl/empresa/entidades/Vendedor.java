package py.com.owl.empresa.entidades;

import java.util.Date;

public class Vendedor extends Empleado {

	public void liquidarEmpleado(String motivoLiquidacion, Date fechaUltimoDiaTrabajo) {
		System.out.println("Liquidando Vendedor...\nTrabajó hasta el "+fechaUltimoDiaTrabajo);
		System.out.println("Motivo de liquidación: "+motivoLiquidacion);
	}

	public void pagarComisiones(){
		System.out.println("Calculando comisiones a pagar.\nGenerando pagos...");
	}

	public double calcularBonificacionFamiliar() {
		double calculoPrevio = super.calcularBonificacionFamiliar();
		System.out.println("Se pagará "+calculoPrevio+" al Vendedor.");
		return calculoPrevio;
	}
}