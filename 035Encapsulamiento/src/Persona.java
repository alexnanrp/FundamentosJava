public class Persona{
    //Atributos
    private String nombre, apellido;
    private boolean borrado;
    
    //Constructor vacio
    public Persona(){}

    //Constructor
    public Persona(String nombre, String apellido, boolean borrado){
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.borrado = borrado;

    }

    public String getNombre(){
    	return this.nombre;
    }

    public void setNombre(String nombre){
    	this.nombre = nombre;
    }

    public String getApellido(){
    	return apellido;
    }

    public void setApellido(String apellido){
    	this.apellido = apellido;
    }

    public boolean isBorrado(){
    	return this.borrado;
    }

    public void setBorrado(boolean borrado){
    	this.borrado = borrado;
    }


    public String toString(){
    	return "Nombre: " + nombre + " Apellido: " + " Borrado: " + borrado;
    }
}