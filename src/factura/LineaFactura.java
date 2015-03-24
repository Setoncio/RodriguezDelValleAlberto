package factura;

/** Clase que calcula el precio de cada producto.
 * En esta clase se encuentran los par�metros de los productos.
 * @author Alberto
 * @version 1.0 
 * @see Factura*/

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**@param idProducto Identificador (c�digo) del producto
	 * @param nombreProducto  Nombre del producto
	 * @param precio Precio por unidad del producto
	 * @param cantidad Cantidad de unidades compradas
	 * @param descuento Descuento de la unidad (no se est� utilizando) */
	
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	 * @see Factura#toString()
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una l�nea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad. 
	 * @see Factura#getTotal()	 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
