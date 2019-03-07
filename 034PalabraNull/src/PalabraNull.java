public class PalabraNull{
    public static void main(String[] args){
        //Creamos un nuevo objeto (persona1)
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1.obtenerNombre(): " + persona1.obtenerNombre());

        //Creamos un objeto (persona2) con el mismo valor que (persona1) "Pasando referencia"
        Persona persona2 = persona1;
        System.out.println("persona2.obtenerNombre(): " + persona2.obtenerNombre());

        //Hacemos que persona1 ya no apunte al objeto (Persona)
        persona1=null;//Es candidata para que la elimine el recolector de basura
        
        System.gc();//garbage collector solo planifica la llamada no es llamado tal cual
                    //En cuanto pueda la maquina virtual de java podria ejecutar el recolector de basura
                    //Los objetos que ya no contengan una referencia de alguna variable
                    //Son candidatos a eliminarse de la memoria y ahorrar espacio de memoria
        if(persona1 != null)
        System.out.println("persona1.obtenerNombre(): " + persona1.obtenerNombre());
        
        //persona2 sigue ligado al objeto Persona
        System.out.println("persona2.obtenerNombre(): " + persona2.obtenerNombre());

        persona2 = null; //En el momento que persona1 y persona2 son nulos significa que
                         //Ninguna variable esta haciendo uso del objeto (Persona)
                         //Es hasta ese momento que el garbage collector puede hacer candidata para
                         //quitar de memoria al objeto (Persona)


        pe        
        
    }
}


//Creamos la clase Persona
class Persona{
	//Creamos el Atributo nombre
    String nombre;

    //Creamos el constructor que alberga los argumentos
    Persona(String nombre){
    	this.nombre = nombre;
    }

    //Creamos el metodo con salida String (obtenerNombre)
    public String obtenerNombre(){
    	return this.nombre;
    }
}