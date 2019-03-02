public class Main{
	public static void main(String[] args){

		var numero=4;
		var texto="Número desconocido";

		switch(numero){
			case 1:
			    texto="El número es uno.";
			    break;
			case 2:
			    texto="El número es dos.";
			    break;
			case 3:
			    texto="El número es tres.";
			    break;
			default:
			    texto="Número desconocido";
			    break;
		};

		System.out.println(texto);

	}
}