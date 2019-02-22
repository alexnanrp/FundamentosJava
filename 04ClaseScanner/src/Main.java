import java.util.Scanner; //se declara donde se encuentra el componente Scanner

public class Main {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		String saludar = "Saludos";
		
		System.out.println("Por favor ingresa tu nombre: ");
	    var usuario = scanner.nextLine();
	    System.out.println(saludar + " " + usuario);
	}
}