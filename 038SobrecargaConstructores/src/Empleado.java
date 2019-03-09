public class Empleado extends Persona{
	//Definimos Atributos
	private double sueldo;

	//Agrageamos constructor publico
	public Empleado(String nombre, int edad, double sueldo){
		super(nombre,edad);
		this.sueldo=sueldo;
	}

	//Agregamos metodos
	//get tipo:double getSueldo variable:sueldo
	public double getSueldo(){
			return sueldo;
	}
	//set tipo:double setSueldo variable:sueldo
	public void setSueldo(double sueldo){
			this.sueldo=sueldo;
	}

	@Override
	public String toString(){
	    return  super.toString()    + "\n" +
	            "Empleado:{ "       + "\n" +
	            "sueldo: " + sueldo + "\n" +
	            "}" + "\n"
	           ; 
	}
}
