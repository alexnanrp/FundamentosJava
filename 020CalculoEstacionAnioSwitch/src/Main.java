import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mes = Integer.parseInt(scanner.nextLine()); //Mes del Año
        String estacion;

        switch (mes){
        	case 1: case 2: case 12:
        	    estacion="Invierno";
        	    break;
        	case 3: case 4: case 5:
        	    estacion="Primavera";
        	    break;
        	case 6: case 7: case 8:
        	    estacion="verano";
        	    break;
        	case 9: case 10: case 11:
        	    estacion="Otoño";
        	    break;
        	default:
        	    estacion="Mes Incorrecto";
        	    break;
        }

        System.out.println(estacion);
	}
}