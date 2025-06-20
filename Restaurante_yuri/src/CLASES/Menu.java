package CLASES;

public class Menu {
	private int idMenu;
    private String nombre;
    private String tipo_categoria;
    private double precio;
	public Menu(int idMenu, String nombre, String tipo_categoria, double precio) {
		super();
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.tipo_categoria = tipo_categoria;
		this.precio = precio;
	}
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_categoria() {
		return tipo_categoria;
	}
	public void setTipo_categoria(String tipo_categoria) {
		this.tipo_categoria = tipo_categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
