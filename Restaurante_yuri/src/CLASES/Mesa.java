package CLASES;

public class Mesa {
	private int idMesa;
	private int numero;
	private String estado;
	public Mesa(int idMesa, int numero, String estado) {
		super();
		this.idMesa = idMesa;
		this.numero = numero;
		this.estado = estado;
	}
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	

}
