public class Operaciones{
	//Metodos sumar

	public static int sumar(int a, int b){
		System.out.println("metodo sumar(int,int)");
		System.out.println("valores: a=" + a + ", b=" + b);
		return (a + b);
	}

	//Sobrecarga de metodos.
	//La sobrecarga de metodos viene cuando hay dos o mas metodos
	//con el mismo nombre pero con diferentes argumentos.
	//El orden de los argumentos debe ser diferente 
	public static double sumar(double a, double b){
		System.out.println("metodo sumar(double,double)");
		System.out.println("a:" + a + " + b:" + b);
		return (a + b);
	}

	//En este caso los argumentos quedan como double ya que tiene
	//mas espacio en memoria que int esto es automatico por java.
	public static double sumar(int a, double b){
		System.out.println("metodo sumar(int,double)");
		System.out.println("a:" + a + " + b:" + b);
		return (a + b);
	}	

	public static double sumar(double a, int b){
		System.out.println("metodo sumar(double,int)");
		System.out.println("a:" + a + " + b:" + b);
		return (a + b);
	}	

}