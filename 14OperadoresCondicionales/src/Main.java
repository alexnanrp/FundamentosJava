public class Main{
	public static void main(String[] args){
		//Operador AND --> &&
	    //Definir variable donde se tenga el Rangos
	    int a = 3, valorMinimo = 0, valorMaximo = 10;
	    System.out.println("El valor de la variable \"a\" es: " + a);
	    System.out.println("El valor de la variable \"valorMinimo\" es: " + valorMinimo);
	    System.out.println("El valor de la variable \"valorMaximo\" es: " + valorMaximo);
	    System.out.println();

	    //Valores máximos y mínimos
        System.out.println("Valores máximos y mínimos");
	    boolean confirma = (a >= valorMinimo) && (a <= valorMaximo);
        String resp;
        if(confirma == true)
        	resp = "          ###Dentro del RANGO### \nLa variable \"a\":" + a + 
                   "es Mayor o igual a la variable \"valorMinimo\":" + valorMinimo + "\n" + 
                   "y Menor que la variable \"valorMaximo\": " + valorMaximo;
        else
        	resp = "          ###Fuera del RANGO### \nLa variable \"a\":" + a + 
                   "es Menor o igual a la variable \"valorMinimo\":" + valorMinimo + "\n" +
                   "o Mayor que la variable \"valorMaximo\": " + valorMaximo;
        System.out.println(resp);



        //Operador OR --> ||
	    
	    System.out.println("El valor de la variable \"a\" es: " + a);
	    System.out.println("El valor de la variable \"valorMinimo\" es: " + valorMinimo);
	    System.out.println("El valor de la variable \"valorMaximo\" es: " + valorMaximo);
	    System.out.println();

	    //Valores máximos y mínimos
        System.out.println("Valores máximos y mínimos");
	    boolean confirma2 = (a >= valorMinimo) || (a <= valorMaximo);

        if(confirma2 == true)
        	resp = "          ###Dentro de algún RANGO### \nLa variable \"a\":" + a + 
                   "es Mayor o igual a la variable \"valorMinimo\":" + valorMinimo + "\n" + 
                   "O Menor que la variable \"valorMaximo\": " + valorMaximo;
        else
        	resp = "          ###Fuera de los 2 RANGOS### \nLa variable \"a\":" + a + 
                   "es Menor o igual a la variable \"valorMinimo\":" + valorMinimo + "\n" +
                   "Y Mayor que la variable \"valorMaximo\": " + valorMaximo;
        System.out.println(resp);

        System.out.println("\n\n");


        //Ejemplo "Vacaciones Padre"
        //Si el padre esta de vacaciones pódrá asistir al juego de su hijo
        //Se generan las variables
        int mesVacPadr = 5, diaVacIniPadr = 15, diaVacFinPadr=25; //Parametros padre
        int mesJueHijo = 5, diaJueHijo = 18; //Parametros hijo
        boolean irJuego = (mesVacPadr) == (mesJueHijo) && (diaJueHijo >= diaVacIniPadr) && (diaJueHijo <= diaVacFinPadr);
        
        if(irJuego == true)
        	resp = "El padre SI podrá ir a ver el juego de su hijo.";
        else
        	resp = "El padre NO podrá ir al juego de su hijo.";
        
        System.out.println(resp);


	}
}