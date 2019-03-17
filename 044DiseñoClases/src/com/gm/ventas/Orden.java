//Generamos ruta de paquete
package com.gm.ventas;

public class Orden{
	//Atributos;
	private int idOrden;
	private static int contadorOrden;
	//Arreglo para el objeto "Producto".
	private Producto productos[];
	//Contador par ver el numero de productos que van solicitando.
	private static int ContadorProductos;
	//Constante para ver el máximo valor que acepta el arreglo.
	private static final int MAX_PRODUCTOS = 10;
	//Se crea el constructor sin argumentos.
	public Orden(){
		this.idOrden = ++contadorOrden;
		//Inicializamos el arreglo de productos.
		this.productos = new Producto[MAX_PRODUCTOS];
	}

	//Agregamos los productos.
	public void agregarProducto(Producto productos){
		//Si los productos agregados no superan el máximo de productos
		//agragamos el nuevo producto al arreglo.
	    if(this.ContadorProductos < MAX_PRODUCTOS){
	    	//agregamos  el nuevo producto al arreglo
	    	//e incrementamos el contador de productos.
	    	this.productos[ContadorProductos++] = productos;
	    }else{
	    	System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
	    }
	}

	public double calcularTotal(){
	    double total = 0;
	    for (int i = 0; i<ContadorProductos; i++) {
	    	total += this.productos[i].getPrecio();
	    }

	    return total;
	}

	public void mostrarOrden(){
	    System.out.println("Orden #: " + idOrden);
	    System.out.println("Total de la orden: $" + calcularTotal());
	    System.out.println("Los productos en la orden son: ");
	    for (int i=0; i<ContadorProductos; i++) {
	    	    	System.out.println("Producto: " + productos[i].getNombre() + " Precio $: " + productos[i].getPrecio());
	    	    	
	    	    }	    
	    
	}


	
	
}