public class PalabraThis{
    public static void main(String[] args){
        Persona persona = new Persona("Juan");
        
    }
}


class Persona{
	//Atributo
	String nombre;
    
    //Constructor que recibe un argumento
	Persona(String nombre){
		this.nombre=nombre;//Se esta manejando el argumento del constructor y el atributo de la clase
		                   //this apunta a un objeto de clase Persona

		//imprimir el objeto persona
		Imprimir imprimir = new Imprimir();
		imprimir.imprimir(this);//this contiene una referencia al objeto Persona
	}
}

class Imprimir{
	public void imprimir(Persona p){
		System.out.println("Impresión del argumento persona: " + p);//imprimiendo el valor del objeto persona
		System.out.println("Impresión del objeto actual (this): " + this);//this apunta a un objeto de tipo imprimir

	}
}