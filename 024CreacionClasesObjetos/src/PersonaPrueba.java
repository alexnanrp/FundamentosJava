public class PersonaPrueba{
    public static void main(String[] args){
    	//Creación de un Objeto
    	Persona persona1 = new Persona();

    	//Llamando a un  metodo del objeto creado
    	System.out.println("Valores por default del objeto persona");
    	//Modificar valores del Objeto Creado
    	persona1.nombre="Yadira";
    	persona1.apellidoPaterno="Mendoza";
    	persona1.apellidoMaterno="Yamen";
    	persona1.desplegarNombre();

    	System.out.println();
    	System.out.println("Se creo un segundo Metodo:");

    	//Creación de un segundo metodo
    	Persona persona2=new Persona();
        persona2.nombre="Carlos";
    	persona2.apellidoPaterno="Ramirez";
    	persona2.apellidoMaterno="Saldaña";
    	persona2.desplegarNombre();


    }
}