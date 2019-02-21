public class Main{
	public static void main(String[] args){
	    //boolean
	    System.out.println("true tipo boolean: " + Boolean.TRUE);
	    System.out.println("false tipo boolean: " + Boolean.FALSE);

	    System.out.println();

	    boolean booleanVar = true;
	    
	    if(booleanVar)
	    	System.out.println("La variable booleanVar contiene un valor verdadero");
	    else
	    	System.out.println("La variable booleanVar contiene un valor falso");

        //======================================================================
	    //Ejercico calificar la edad de una persona "Validar si es adulta o no"
	    //======================================================================

	    //Es adulta si la persona tiene 18 o más años de edad

	    var edad = 15;
	    var adulto = edad >= 18; // se esta utilizando un valor de tipo "boolean" ya que se esta 
	                             // utilizando el operador relacional: ">="  <-- parecido a una pregunta
	                             // regresando un valor "true" o "false"
        
        System.out.println();

	    if(adulto)
	    	System.out.println("Eres mayor de edad, puedes pasar");
	    else
	    	System.out.println("Eres menor de edad, no puedes pasar");
                              

	}
}