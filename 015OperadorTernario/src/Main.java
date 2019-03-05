public class Main{
	public static void main(String[] args){
	    //Simplificación de la estructura if...else
	    //Preguntar si un número es par o impar
	    int numero = 20;
	    String resp;
	    //El valor ternario se realiza con el signo "?", todo lo que esta antes de ":"
	    //se considera verdadero, lo que esta despues se considera falso.
	    var resultado = (numero%2 == 0) ? "El número: " + numero + " es par.":"El número: " + numero + " es impar.";
	    System.out.println(resultado);

	    System.out.println();
        
        var par = (numero%2 == 0) ? true:false;
        if(par)
        	resp = "El número: " + numero + " es par.";
        else
        	resp = "El número: " + numero + " es impar.";
        System.out.println(resp);

	}
}