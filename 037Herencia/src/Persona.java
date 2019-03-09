public class Persona{
	//Atributos
	private String nombre;
	private char genero;
	private int edad;
	private String direccion;

	//Constructor vacio
	public Persona(){}

	//Constructor con 1 argumento
	public Persona(String nombre){
		this.nombre = nombre;
	}

	//Constructor completo
	public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.direccion=direccion;
	}

	//Metodos

	//get nombre
	public String getNombre(){
			return nombre;
	}

	//set nombre
	public void setNombre(String nombre){
			this.nombre=nombre;
	}
    
    //get genero
	public char getGenero(){
			return genero;
	}

	//set genero
	public void setGenero(char genero){
			this.genero=genero;
	}

	//get edad
	public int getEdad(){
			return edad;
	}

	//set edad
	public void setEdad(int edad){
			this.edad=edad;
	}

	//get direccion
	public String getDireccion(){
			return direccion;
	}

	//set direccion
	public void setDireccion(String direccion){
			this.direccion=direccion;
	}

	@Override
	public String toString(){
	    return "Persona{"    + "\n" +
	           "nombre: "    + nombre    + "\n" +
	           "genero: "    + genero    + "\n" +
	           "edad: "      + edad      + "\n" +
	           "direccion: " + direccion + "\n" + "}";
	}

}