//Especificando rutade paquete
package com.gm.ventas;

//Clase publica
public class Producto{
    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    //Constructor con argumentos vacios
    //Agregamos el contador a la variable idContador
    private Producto(){
    	this.idProducto = contadorProducto++;
    }

    //Constructor con 2 argumentos
    public Producto(String nombre, double precio){
    	this(); //Llamamos las varables en el contrusctor privado
    	this.nombre=nombre;
    	this.precio=precio;

    }

    //get tipo:String, getNombre, variable:nombre
    public String getNombre(){
    		return this.nombre;
    }
    //set tipo:String, setNombre, variable:nombre
    public void setNombre(String nombre){
    		this.nombre=nombre;
    }

    //get tipo:double, getPrecio, variable:precio
    public double getPrecio(){
    		return this.precio;
    }
    //set tipo:double, setPrecio, variable:precio
    public void setPrecio(double precio){
    		this.precio=precio;
    }

    //get idProducto
    public int getIdProducto(){
    		return this.idProducto;
    }

    @Override
    public String toString(){
        return "Producto:{" + "\n" +
               "idProducto: " + idProducto + "\n" +
               "nombre: " + nombre + "\n" +
               "precio: " + precio + "\n" +
               "}"        + "\n" 
               ; 
    }
}
