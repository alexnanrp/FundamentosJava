public class Main{
	public static void main(String[] args){
	    //Validar estación del año dependiendo del mes que se proporcione

	    //Como solo es una linea de código se puede uusar la condicional sin llaves "{}"
	    int mes=1;//Mes del año
        String estacion;
	    if(mes==1 || mes==2 || mes==12)
	    	estacion="Invierno";
	    else if(mes==3 || mes==4 || mes==5)
            estacion="Primavera";
        else if(mes==9 || mes==10 || mes==11)
        	estacion="Otoño";
        else
        	estacion="Mes incorrecto";
	    
	    System.out.println(estacion);
	}
}