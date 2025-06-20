package CLASES;

import java.sql.Date;

import java.time.DateTimeException;
import java.util.ArrayList;

public class Pedido {
	private int idPedido;
    private Cliente cliente;
    private Empleado empleado;
    private Mesa mesa;
    private Date fechapedido;
    private String estadopedido;
    private double totalpedido;
    private ArrayList<DetallePedido> detalles; //esto no se porque va pero observacion
    private boolean esDelivery; //este seria si es tipo delivery o local no?
    
	
    public Pedido(int idPedido, Cliente cliente, Empleado empleado, Mesa mesa, Date fechapedido, String estadopedido,
			double totalpedido, ArrayList<DetallePedido> detalles, boolean esDelivery) {
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.empleado = empleado;
		this.mesa = mesa;
		this.fechapedido = fechapedido;
		this.estadopedido = estadopedido;
		this.totalpedido = totalpedido;
		this.detalles = detalles;
		this.esDelivery = esDelivery;
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public Date getFechapedido() {
		return fechapedido;
	}


	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}


	public String getEstadopedido() {
		return estadopedido;
	}


	public void setEstadopedido(String estadopedido) {
		this.estadopedido = estadopedido;
	}


	public double getTotalpedido() {
		return totalpedido;
	}


	public void setTotalpedido(double totalpedido) {
		this.totalpedido = totalpedido;
	}


	public ArrayList<DetallePedido> getDetalles() {
		return detalles;
	}


	public void setDetalles(ArrayList<DetallePedido> detalles) {
		this.detalles = detalles;
	}


	public boolean isEsDelivery() {
		return esDelivery;
	}


	public void setEsDelivery(boolean esDelivery) {
		this.esDelivery = esDelivery;
	}


	public String toString() {
        return "Pedido #" + idPedido + " Cliente: " + cliente.getNombre() + (esDelivery ? " (Delivery)" : " (Local)");
    } 
}
