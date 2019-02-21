public class Main{
	public static void main(String[] args){
	     //float, double
		System.out.println("bits tipo float: " + Float.SIZE);
		System.out.println("bytes tipo float: " + Float.BYTES);
		System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
		System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

		System.out.println();
        
        System.out.println("bits tipo double: " + Double.SIZE);
		System.out.println("bytes tipo double: " + Double.BYTES);
		System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
		System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

		System.out.println();

		float floatVar = 0.5F; //Se necesita llamar la variable "float" con una "F" al final para ser flotante 
		                       //De lo contrario lo toma como tipo double

		double doubleVar = 0.10; //En este caso se asigna automaticamente como tipo double sin embargo también es posible 
		                         //poner la letra "D" generalmente se usa esto cuando es un tipo "entero"

		var floatVar2 = .05F;  //Para llamar un var a tipo float se le puede poner el caracter "F"

		var doubleVar2 = .05D;  //Para llamar un var a tipo double también se le puede poner el caracter "D" (opcional)


	}
}