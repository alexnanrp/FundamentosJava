public class Main{
	public static void main(String[] args){
        
	    var x = 5;
	    var y = 10;
	    var z = ++x + y--;//x = 6, y = 10
	    System.out.println("El valor de x es: " + x);//x se incrementa hasta la siguiente llamada ahora vale 6
	    System.out.println("El valor de y es: " + y);//y se des-incrementa en la primera llamada y ahora es 9
	    System.out.println("El valor de la formula (++x + y--) es: x: " + x + " + y: " + y +" = " + z);
        

	}
}