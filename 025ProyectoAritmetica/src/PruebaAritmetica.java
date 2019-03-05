public class PruebaAritmetica{
    public static void main(String[] args){
    	//Creamos un Objeto de la clase Aritmetica
    	Aritmetica aritmetica = new Aritmetica();

    	//Llamamos al metodo sumar y recibimos el valor devuelto
    	int resultado = aritmetica.sumar(5,3);
    	System.out.println("resultado: " + resultado);
    }
}