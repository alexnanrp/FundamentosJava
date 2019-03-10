//En caso de tener muchas clases que importar del mismo paquete
//en vez de utilizar "com.gm.Utileria" se puede usar "com.gm.*" (Esto no hace que todas las clases se carguen en memoria no hay problema de memoria)
//para traer todas las clases respectivas a ese paquete.
import com.gm.Utileria;

//Otra forma de llamarlo seria "com.gm.Utileria.imprimir("Hola");"
public class EjemploPaquetes{
    public static void main(String[] args){
        Utileria.imprimir("Hola");
    }
}

