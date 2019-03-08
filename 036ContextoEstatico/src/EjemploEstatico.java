public class EjemploEstatico{
    public static void main(String[] args){
    	//Creamos el primer objeto
    	Persona persona1 = new Persona("Juan");
    	//Se manda a llamar de manera autoamtica "toString" por el metodo println
    	System.out.println("persona1: " + persona1);    	

    	//Creamos un segundo Objeto
    	Persona persona2 = new Persona("Karla");
    	System.out.println("persona2: " + persona2);

    	//Accediendo a contador persona se recomienda entrar por la clase "Persona"
    	//y no por el objeto "persona1" o "persona2"
    	System.out.println("contadorPersona: " + Persona.getContadorPersona());
    	
    	        
    }
}

class Persona{
	private int idPersona;
	private String nombre;

	//Si no es estatico se asocia a la clase y no a los objetos
	//En caso de quitar static se asocia al objeto y se reinicia el contador a cero
	private static int contadorPersona;

	//Constructor Vacio
	public Persona(){}

	//Constructor con los argumentos
	public Persona(String nombre){
		this.idPersona = contadorPersona++;
		this.nombre = nombre;
	}

	//Metodos get 
	public int getIdPersona(){
		return this.idPersona;
	}
	//Metodo set
	public void setIdPersona(int idPersona){
		this.idPersona = idPersona;
	}

	//Metodo get
	public String getNombre(){
		return this.nombre;
	}
	//Metodo set
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	//Metodo get se asocia con la clase y no con el objeto
	public static int getContadorPersona(){
		return contadorPersona;
	}

	//Concatenación toString
	public String toString(){
		return "idPersona: " + this.idPersona + " nombre: " + this.nombre;
	}


}