public class Main{
	public static void main(String[] args){
		//No es necesario aplicar las llaves {} si solo se tiene que ejecutar 
		//una sola línea de código, en caso de no ser así es necesario aplicarlas
		//el else es opcional
		var numero = 2;
		if(numero == 1){
			System.out.println("numero uno");
		}
		else if(numero == 2){
			System.out.println("numero dos");
		}else if(numero == 3){
			System.out.println("numero tres");
		}else{
			System.out.println("numero desconocido");
		};

        //Segunda opción
        var texto = "Número desconocido";

        if(numero==1)
        	texto = "Número uno.";
        else if(numero == 2)
        	texto = "Número dos";
        else if(numero == 3)
        	texto = "numero 3";

        System.out.println(texto);


	}
}