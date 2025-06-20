package CLASES;

public class Cliente extends Persona {
	private String telefono;
    private String direccion;
	public Cliente(int idPersona, String nombre, String telefono, String direccion) {
		super(idPersona, nombre);
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
    
}
