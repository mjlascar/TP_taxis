package negocio;

import java.util.GregorianCalendar;

/**
 * Clase pedido, es un formulario el cual llena el cliente con sus requisitos para el viaje
 */
public class Pedido {
	private String zona;
	private boolean mascota, baul;
	private int cantPasajeros;
	private double distancia;
	private GregorianCalendar fecha;
	private Cliente cliente;
	private String condicionPedido;
	
	/**
	 * Constructor de Pedido, recibe los requerimientos del cliente y los ordena
	 * 
	 * Pre: fecha= GregorianCalendar valida; zona != null and !=""; cantPasjeros mayor a 0, cliente!=null
	 * Post: Se crea el formulario de pedido
	 * 
	 * @param fecha: fecha y hora del pedido
	 * @param zona: String con el nombre de la zona
	 * @param mascotas: Boolean que confirma si el cliente lleva mascota
	 * @param baul: Boolean que confirma si el cliente necesitara un baul
	 * @param cantPasajeros: cantidad de pasajeros que viajaran
	 * @param cliente: cliente que hizo el pedido
	 */
	public Pedido(double distancia, GregorianCalendar fecha, String zona, boolean mascotas, boolean baul, int cantPasajeros, Cliente cliente) {
		this.distancia= distancia;
		this.fecha=fecha;
		this.zona= zona;
		this.mascota= mascotas;
		this.baul= baul;
		this.cantPasajeros = cantPasajeros;
		this.cliente = cliente;
	}

	public String getZona() {
		return zona;
	}

	public boolean isMascota() {
		return mascota;
	}

	public boolean isBaul() {
		return baul;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getDistancia() {
		return distancia;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}
	
	public String getUserCliente() {
		return this.cliente.getUser();
		
	}
	
	
	
}
