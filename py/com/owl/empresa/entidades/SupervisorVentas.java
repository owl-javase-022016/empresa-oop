package py.com.owl.empresa.entidades;

import java.util.Date;

public class SupervisorVentas extends Vendedor {

	public void liquidarEmpleado(String motivoLiquidacion, Date fechaUltimoDiaTrabajo) {
		System.out.println("Liquidando Supervisor...\nTrabajó hasta el "+fechaUltimoDiaTrabajo);
		System.out.println("Motivo de liquidación: "+motivoLiquidacion);
	}
}