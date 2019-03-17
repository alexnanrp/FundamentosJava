public class Persona{
	//Atributos privados
	private String nombre;

	//Constructor para los argumentos
	public Persona(String nombre){
		this.nombre = nombre;
	}

	//get tipo:String, getNombre, variable:nombre
	public String getNombre(){
			return nombre;
	}
	//set tipo:String, setNombre, variable:nombre
	public void setNombre(String nombre){
			this.nombre=nombre;
	}

	@Override
	public String toString(){
	    return 
	           "Persona:{" + "\n" +
	           "nombre: "  + nombre  + "\n" +
	           "}"         + "\n" 
	           ; 
	}
}