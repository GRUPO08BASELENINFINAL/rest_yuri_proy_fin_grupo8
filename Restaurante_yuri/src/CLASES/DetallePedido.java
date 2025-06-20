package CLASES;

public class DetallePedido {
	private int idDetalle;
	private Pedido pedido;
    private Menu menu;
    private int cantidad;
    private double precio_uni;
    private double subtotal;
    
	public DetallePedido(int idDetalle, Pedido pedido, Menu menu, int cantidad, double precio_uni, double subtotal) {
		
		this.idDetalle = idDetalle;
		this.pedido = pedido;
		this.menu = menu;
		this.cantidad = cantidad;
		this.precio_uni = precio_uni;
		this.subtotal = subtotal;
	}




	public int getIdDetalle() {
		return idDetalle;
	}




	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}




	public Pedido getPedido() {
		return pedido;
	}




	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}




	public Menu getMenu() {
		return menu;
	}




	public void setMenu(Menu menu) {
		this.menu = menu;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	public double getPrecio_uni() {
		return precio_uni;
	}




	public void setPrecio_uni(double precio_uni) {
		this.precio_uni = precio_uni;
	}




	public double getSubtotal() {
		return subtotal;
	}




	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}




	public String toString() {
        return cantidad + " x " + menu.getNombre() + "";
    }
    
}

