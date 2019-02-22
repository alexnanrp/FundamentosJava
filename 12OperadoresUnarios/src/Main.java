public class Main{
	public static void main(String[] args){
	    //la variable b invierte el valor de positivo a negativo 
	    //el valor de la variable a
	    int a = 3;
	    int b = -a;

	    //Valores originales
	    System.out.println("El valor original de la variable \"a\" es: " + a);
	    System.out.println("El valor original de la variable \"b\" es: " + b);

	    System.out.println();

	    //Operadores de tipo boolean
	    //"d" es la inversión de "c"
	    System.out.println("Operadores boolean:");
	    boolean c = true;
	    boolean d = !c;
	    System.out.println("El valor de \"c\" es: " + c);
	    System.out.println("El valor inverso de \"c\" es: " + d);

	    System.out.println();

	    //Operador post-incremento
	    System.out.println("post-incremento:");
	    //post incremento, primero asigna la sumatoria al valor de la variable "e"
	    //a la variable "f" y a la siguiente ocurrencia donde se encuentre
	    //la variable "e" se incremente el valor.
        // Donde "e" es igual a 4 y "f" igual a 3
	    int e = 3;
	    int f = e++; 	                 
	    System.out.println("El valor de la variable \"e\" es: " + e); // "e" vale 4 
	    System.out.println("El valor de la variable \"f\" es: " + f); // "f" vale 3 hasta la siguiente ejecución
        

        System.out.println();

	    //Operador de pre-incremento
	    System.out.println("pre-incremento:");
	    //pre incremento, incrementa el valor de la variable "e" a la primera ejecución
	    //conjuntamente la variable "f" se le asigna el valor de "e" ya incrementado
        // Donde "e" es igual a 4 y "f" también es igual a 4
	    int g = 3;
	    int h = ++g; 	                 
	    System.out.println("El valor de la variable \"g\" es: " + g); // "g" vale 4 (ya que se incremento en la primera ejecución)
	    System.out.println("El valor de la variable \"h\" es: " + h); // "h" vale 4

	    System.out.println();	    

	    //Operador post-decremento
        System.out.println("post-decremento:");
	    //post decremento, primero asigna la resta al valor de la variable "i"
	    //a la variable "j" y a la siguiente ocurrencia donde se encuentre
	    //la variable "i" se decrementa el valor.
        // Donde "i" es igual a 2 y "j" igual a 3
	    int i = 3;
	    int j = i--; 	                 
	    System.out.println("El valor de la variable \"i\" es: " + i); // "i" vale 2 
	    System.out.println("El valor de la variable \"j\" es: " + j); // "j" vale 3 hasta la siguiente ejecución
        

        System.out.println();


	    //Operador pre-decremento
	    System.out.println("pre-incremento:");
	    //pre decremento, resta el valor de la variable "k" a la primera ejecución
	    //conjuntamente la variable "l" se le asigna el valor de "k" ya restado
        // Donde "k" es igual a 2 y "l" también es igual a 2
	    int k = 3;
	    int l = --k; 	                 
	    System.out.println("El valor de la variable \"k\" es: " + k); // "k" vale 2 (ya que se incremento en la primera ejecución)
	    System.out.println("El valor de la variable \"l\" es: " + l); // "l" vale 2

	    System.out.println();	

	}
}