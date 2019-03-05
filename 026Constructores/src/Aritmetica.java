public class Aritmetica{
	//Atributos de la clase
	int a, b;
	//Los Constructores INICIALIZAN UN OBJETO al momento de la creacion
	//Reserva memoria para la creación del objeto
    //Los constructores solo se ejecutan una sola vez
    //No devuelven ningún valor por lo tanto no hay "return"
    //El nombre del constructor debe ser identico al nombre de la clase ejemplo: "Aritmetica"



	//El constructor vacio "Sin argumentos" es necesario para crear un objeto
	//"Si no lo creamos el compilador lo crea automáticamente"
	Aritmetica(){

	}

	//Constructor con argumentos sirve para declarar los valores de las
	//variables del objeto desde el mismo momento de la creación
	//Sis se crea este constructor se debe de crear el constructor vacio ya que el 
	//comnpilador JAVA NO lo creará de default
	//Se INICIALIZAN los valores
	Aritmetica(int arg1, int arg2){
        a=arg1;
        b=arg2;
	}

	//Este metodo toma los atributos de la clase
	//Solo se puede regresar un único valor
    int sumar(){
    	return (a + b);
    }
}