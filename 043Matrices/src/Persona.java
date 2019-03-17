public class Persona{
	//Atributo privado
	private String nombre;

	//Constructor con argumento
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
	    return "Persona:{" + "\n" +
	           "nombre: "  + nombre +
	           "}"         + "\n" 
	           ; 
	}
}