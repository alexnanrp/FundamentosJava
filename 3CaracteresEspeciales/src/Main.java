public class Main {
	public static void main(String[] args){
        String nombre = "Karla";
        String apellido = "Esparza";

        System.out.println(nombre + " " + apellido);
        System.out.println("nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t"   + nombre);
        System.out.println("Retroceso: \b"   + nombre);
        System.out.println("Retorno de carro: \r"   + nombre);
        System.out.println("Comilla Simple: \'"   + nombre + "\'");
        System.out.println("Comilla Doble: \""   + nombre + "\"");
        System.out.println(nombre); //imprime nueva linea
        System.out.print(nombre); //no imprime nueva linea
	}
}