package factura;

import java.util.Arrays;

/** Clase que inicializa un cliente con su identificador, su nombre y su factura con 
 * los productos de la misma. También calcula el precio total de la factura.
 * En esta clase se encuentra Main, los parámetros del cliente y el vector para la lista de
 * productos comprados.
 * @author Alberto
 * @version 1.0 
 * @see LineaFactura*/

public class Factura {
	
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**@param idCliente Identificador (código) del cliente
	 * @param nombreCliente  Nombre del cliente
	 * @param lineas Lista de productos comprados */
	
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada línea.
	 * @see LineaFactura#getTotal()	 
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	/** 
	 * @see LineaFactura#toString()
	 * 
	 */
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}


	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
