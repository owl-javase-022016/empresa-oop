package py.com.owl.empresa.entidades;

import java.util.Date;

public interface Liquidable {

	void liquidarEmpleado(String motivoLiquidacion, Date fechaUltimoDiaTrabajo);
}