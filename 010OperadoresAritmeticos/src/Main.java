public class Main{
	public static void main(String[] args){
		// las variable se pueden separar por comas "," exceptuando el tipo "var"
		//valores
        int a=3, b=2;
        System.out.println();
        System.out.println("Valores:");
        System.out.println("el resultado de la variable a es: " + a);  
        System.out.println("el resultado de la variable b es: " + b);  
        //Suma
        int c = a + b;
        System.out.println("Suma:");
        System.out.println("el resultado de la variable c es: " + c);
        
        //El resultado no es el esperado ya que hay una cadena de tipo String 
        //que concatena los valores numericos en vez de sumarlos
        System.out.println("el resultado de la suma a + b es: " + a + b);

        //Para lograr la suma de los valores hay meter los valores dentro de un 
        //parentesis debido al concepto de contexto String ya que con los parentesis
        //Primero se realiza la suma y despues la concatenación
        System.out.println("el resultado de la suma a + b es: " + (a + b));

        //El mismo caso sucede cuando se pone los valores primero a la izquierda y despues
        //el texto ya que primero realiza la operacion sumatoria y despues la concatenación
        //Sin la necesidad de agregar el parentesis
        System.out.println(a + b + " Es el resultado de la suma a + b");
        
        System.out.println();
        System.out.println("Resta:");

        //Resta
        int d = a - b;
        System.out.println("el resultado de la variable d es: " + d);

        //Error al querer concatenar un String con una resta
        //ya que primero trata de concatenar el texto con el valor a y despues
        //realizar una resta de un tipo String con un tipo int que es el valor "c"

        //###### System.out.println("el resultado de la resta a - b es: " + a - b);#######        

        //Para realizar correctamente esta operación hay que agregar los parentesis
        //para que primero realice la operación resta de los dos valores y despues
        //los concatene
        System.out.println("el resultado de la resta a - b es: " + (a - b));
        
        System.out.println();
        System.out.println("Multiplicación:");

        //Multiplicación
        int e = a * b;
        System.out.println("el resultado de la variable e es: " + e);  

        System.out.println();
        System.out.println("División:");

        //División
        int f = a / b;
        System.out.println("el resultado de la variable f es: " + f);  

        System.out.println();
        System.out.println("División Flotante:");

        //División flotante
        float g = 3F / b; // se deja el caracter F para que la operación arroje un valor flotante
        System.out.println("el resultado de la variable g es: " + g);  

        System.out.println();
        System.out.println("División Double:");

        //División double
        double h = 3D / b; // se deja el caracter D para que la operación arroje un valor de tipo Double
        System.out.println("el resultado de la variable h es: " + h);  
       
        System.out.println();
        System.out.println("División residuo (modulo):");

        //División residuo "modulo"
        double i = a % b; //Operación de modulo regresa el "residuo" de una división
        System.out.println("el resultado de la variable i es: " + i);        


        //Ejercicio saber si un número es par o impar
        System.out.println();
        System.out.println("Par o impar:");

        //División residuo "modulo"
        int numParImp = 15;
        int j = numParImp % 2; //Operación de modulo regresa el "residuo" de una división
        if(j == 0)
        	System.out.println("El numero: " + numParImp + " es par");        
        else
        	System.out.println("El numero: " + numParImp + " es impar");






	}
}