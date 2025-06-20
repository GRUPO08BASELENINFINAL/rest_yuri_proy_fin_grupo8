package CLASES;

public class Empleado extends Persona {
	private String puesto;

	public Empleado(int idPersona, String nombre, String puesto) {
		super(idPersona, nombre);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
