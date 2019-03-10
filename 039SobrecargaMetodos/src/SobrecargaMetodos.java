public class SobrecargaMetodos{
	public static void main(String[] args){
		//Mandamos a llamar directamente los operadores sumar.
		//Ya que el metodo es estatico lo podemos llamar directamente "Operaciones.sumar()".

		//Metodo int int
		System.out.println("Resultado1: (a + b) = " + Operaciones.sumar(3,4));
		System.out.println();

		//Metodo int double
		System.out.println("Resultado2: (a + b) = " + Operaciones.sumar(5,4.1));
		System.out.println();

		//Metodo double int
		System.out.println("Resultado3: (a + b) = " + Operaciones.sumar(7.1,6));
		System.out.println();

		//¿Cúal es el metodo que se manda a llamar si utilizamos los siguientes argumentos?
		System.out.println("Resultado4: (a + b) = " + Operaciones.sumar(3,4L)); //Se manda a llamar un (int,double) ya que un double y un long son de 64 bytes
		System.out.println();

		//¿Cúal es el metodo que se manda a llamar si utilizamos los siguientes argumentos?
		System.out.println("Resultado4: (a + b) = " + Operaciones.sumar(5F,'A')); //Se manda a llamar un (double,int) ya que un "float" lo soporta un "double" y el "char" lo soporta el "int"
		System.out.println();
	}
}