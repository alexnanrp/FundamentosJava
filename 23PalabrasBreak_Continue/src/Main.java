public class Main{
	public static void main(String[] args){
        //Solo es una linea de senrtencia no es necesario usar llaves
        //continue sirve para saltar código siguiente
        //break para detener el ciclo

        //break rompe el ciclo
        System.out.println("Comando break:");
        for(var i=0; i<3; i++){
        	if(i % 2 == 0)
        		//continue;
        	        System.out.println("i:" + i);
                break;
        }

        //continue si se cumple la condición entonces 
        //se salta hasta la siguiente iteracion del ciclo for
        System.out.println();
        System.out.println("Comando continue:");
        for(var i=0; i<3; i++){
        	if(i % 2 != 0)
        		continue;
        	        System.out.println("i:" + i);
                //break;
        }

	}
}