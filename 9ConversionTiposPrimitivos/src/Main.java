import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int edad1 = Integer.parseInt("20"); //Funciona cuando es es de tipo int
        var edad2 = Integer.parseInt("20"); //Tambien al declarar el tipo var
        double valorPi = Double.parseDouble("3.14"); //Lo mismo para tipo double
        //Tambien para los tipos primitivos: long,float, boolean etc.. (No funciona para los char)
        System.out.println("La edad1 es: " + edad1);
        System.out.println("La edad2 es: " + edad2);
        System.out.println("El valor de la variable \'valorPi\' es: " + valorPi);

        System.out.println();
        System.out.println("Ejemplo char para \"hola\":");
        //Ejemplo char
        //Recordar usar dobles comillas para string
        char c0 = "hola".charAt(0); //Se elige la letra h
        char c1 = "hola".charAt(1); //Se elige la letra o
        char c2 = "hola".charAt(2); //Se elige la letra l
        char c3 = "hola".charAt(3); //Se elige la letra a

        System.out.println("valor para c0: "+ c0);
        System.out.println("valor para c1: "+ c1);
        System.out.println("valor para c2: "+ c2);
        System.out.println("valor para c3: "+ c3);
        
        //Scanner con tipo int
        System.out.println();
        var scanner = new Scanner(System.in);
        System.out.println("Por favor de ingresar su edad:");
        int edad = Integer.parseInt(scanner.nextLine().trim()); //Se usa .trim() para quitar los espacios
        System.out.println("Tu edad es de: " + edad + " años");

        //Scanner con tipo char
        System.out.println();
        System.out.println("Porfavor escribe una o varias frases: ");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("El primer caracter de tus frase o frases es: " + caracter);

        //Scanner de un tipo primitivo a un tipo String
        String edadTexto = String.valueOf(25);
        String valorPiTexto = String.valueOf(valorPi);
        System.out.println("edadTexto = " + edadTexto);
        System.out.println("valorPiTexto = " + valorPiTexto);

        System.out.println();

        String valorPiTexto2 = "" + valorPi;
        System.out.println("valorPiTexto2 = " + valorPiTexto2);

        //Byte
        byte b = 10; // 8 bits
        short s = b; // 16 bits

        //Error solo se puede hacer con un casting
        short s2 = 15; // 16 bits
        //byte b2 = s2;  //8 bits
        // de mayor bits a menor bits (solo si se esta segurto de hacer la conversión)
        byte b2 = (byte) s2;


    }
}