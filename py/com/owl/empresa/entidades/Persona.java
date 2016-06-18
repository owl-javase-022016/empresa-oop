package py.com.owl.empresa.entidades;

public class Persona{
	
	public class Documento{};	
	
	private String nombre;
	private String apellido;
	private String sexo;
	private int edad;
	public static String VERSION = "1.0.0";

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}	

	public String getSexo(){
		return sexo;
	}

	public void setSexo (String sexo){
		this.sexo = sexo;
	}	

	public int getEdad(){
		return edad;
	}

	public void setEdad (int edad){
		this.edad = edad;
	}	
	

	protected int getCodigoInternoPersona(){
		return 50;
	}

	public String toString(){
		return nombre + " " + apellido + ". Sexo " + sexo + ". Edad " + edad;	
	}

}
