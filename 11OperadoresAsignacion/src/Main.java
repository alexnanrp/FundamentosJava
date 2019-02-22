public class Main{
	public static void main(String[] args){
	    //Operador de asignación
	    int a =3, b=2;
	    int c = a;
        //Valores originales
        System.out.println("El valor original de la variable \"a\" es: " + a);
        System.out.println("El valor original de la variable \"b\" es: " + b);
        System.out.println();
	    //Operador de composición
	    a += 1;// a = a + 1;
	    System.out.println("El valor de la variable \"a\" es: " + a);

	    a += 3;// a = a + 3;
	    System.out.println("El valor de la variable \"a\" es: " + a);
        System.out.println();
	    //Esto se puede aplicar a cualquier operación suma, resta, 
	    //multiplicación, división y operador de modulo
	    //Multiplicación: *=, División: /=, Operador de modulo: %=
	    b -= 1;// b = b - 1;
	    System.out.println("El valor de la variable \"b\" es: " + b);


	}
}