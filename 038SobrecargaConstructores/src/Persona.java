public class Persona{
	//Atributos
	private int idPersona;
	private String nombre;
	private int edad;
	private static int contadorPersonas;

	//Constructor privado
	private Persona(){
		this.idPersona = ++contadorPersonas;
	}

	//Sobrecarga de un constructor
	//Constructor completo sobrecarga
	public Persona(String nombre, int edad){
		this();
		this.nombre=nombre;
		this.edad=edad;
	}

	@Override
	public String toString(){
	    return "Persona:{ " +  "\n" +
	           "idPersona: " + idPersona + "\n" +
	           "nombre: " + nombre + "\n" +
	           "edad: " + edad + "\n" +
	           "}: " + "\n" ;
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

	//get tipo:int getEdad atributo:edad
	public int getEdad(){
			return edad;
	}
	//set tipo:int setEdad atributo:edad
	public void setEdad(int edad){
			this.edad=edad;
	}
}