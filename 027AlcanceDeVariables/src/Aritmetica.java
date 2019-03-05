public class Aritmetica{
	//Atributos de la clase
	int a, b;

	//El constructor vacio "Sin argumentos" es necesario para crear un objeto
	//"Si no lo creamos el compilador lo crea automáticamente"
	Aritmetica(){

	}

	
	//Se INICIALIZAN los valores "Constructor"
	//Usando "this" ya no hay ambiguedad si 
	//se usa el mismo nombre de la variable
	Aritmetica(int a, int b){
        this.a=a;//this.a es el atributo de la clase y =a <-- es el argumento del metodo.
        this.b=b;//this.b es el atributo de la clase y =b <-- es el argumento del metodo. 
	}

	//Este metodo toma los atributos de la clase
	//Solo se puede regresar un único valor
    int sumar(){
    	return (a + b);
    }
    
    //Metodo restar
    int restar(){
    	return (a - b);
    }

    //Metodo multiplicar
    int multiplicar(){
    	return (a * b);
    }

    //Metodo dividir
    int dividir(){
    	return (a / b);
    }
}