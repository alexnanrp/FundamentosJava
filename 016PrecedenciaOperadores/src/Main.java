public class Main{
	public static void main(String[] args){
        
	    var x = 5;
	    var y = 10;
	    var z = ++x + y--;//x = 6, y = 10
	    System.out.println("El valor de x es: " + x);//x se incrementa hasta la siguiente llamada ahora vale 6
	    System.out.println("El valor de y es: " + y);//y se des-incrementa en la primera llamada y ahora es 9
	    System.out.println("El valor de z que representa la formula (++x + y--) es: x: " + x + " + y: " + y +" = " + z); //16

	    //Precedencia de operadores
	    System.out.println("Ejemplo de precedencia de operadores.");
	    
	    //La multiplicación y la división tienen más prioridad sobre la suma o la resta.
	    //De izquierda a derecha se encuentra la multiplicación por lo tanto es la primera operación que reqlizará
	    //despues la división y por último la suma
	    var resultado = 4 + 5 * 6 / 3;//4 +  (5*6)/3 --> 4+30/3 --> 4+(30/3) --> 4+10 -->14
	    System.out.println("El resultado de la operación: 4 + 5 * 6 / 3 es: " + resultado);

	    //Se puede modificar la operación manejando parentesis, ya que los parentesis tienen
	    //mayor prioridad
	    var resultado2 = (4 + 5) * (6 / 3);//9 * 2 --> 18
	    System.out.println("El resultado de la operación: (4 + 5) * (6 / 3) es: " + resultado2);

        

	}
}