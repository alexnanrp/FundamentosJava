import java.util.Scanner;

public class CajaVolumen{
    public static void main(String[] args){
    	//Se crean las variables
    	int ancho,alto,profundo;
        
        //==================== Obteniendo valores ======================
    	//Se llama a el objeto Scanner
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Proyecto: Volumen de una caja.\n\n");
    	//Ancho
    	System.out.println("Ancho.\nPor favor ingrese el valor del ancho de la caja: ");
    	ancho = Integer.parseInt(scanner.nextLine());
    	//Alto
    	System.out.println("Alto.\nPor favor ingrese el valor del alto de la caja: ");
    	alto = Integer.parseInt(scanner.nextLine());
    	//Profundidad
    	System.out.println("Profundo.\nPor favor ingrese el valor de profundidad de la caja: ");
    	profundo = Integer.parseInt(scanner.nextLine());
        //==================== Obteniendo valores ======================

    	//========================== Resultado =========================
    	//Llamammos al objeto Caja
    	Caja cajaObj1 = new Caja(ancho,alto,profundo);

    	//Imprimiendo los valores
    	System.out.println();
    	System.out.println("alto: " + alto);
    	System.out.println("ancho: " + ancho);
    	System.out.println("profundo: " + profundo);
    	
    	//Imprimiendo el resultado
    	System.out.println();    	
    	System.out.println("El volumen de la caja es: " + cajaObj1.volumen());
    	    	    	
    	//========================== Resultado =========================



    	
        
    }
}