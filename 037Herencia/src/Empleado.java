public class Empleado extends Persona{
	//Atributo publicos se heredan los atributos no 
	//ya que son privados
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleados;

	public Empleado(String nombre, double sueldo){
		//super siempre debe ser la primera linea del constructor
		//Estamos llamando a la clase padre "Persona"
		//Inicializamos el atributo nombre de la clase padre "Persona"
		super(nombre);
		//Inicializamos los atributos de la clase idEmpleado;
		this.idEmpleado = ++contadorEmpleados;//El contador empieza desde 1 ++contadorEmpleados

		this.sueldo = sueldo;
	}

	//Metodos
	//get idEmpleado
	public int getIdEmpleado(){
			return idEmpleado;
	}
	//set idEmpleado
	public void setIdEmpleado(int idEmpleado){
			this.idEmpleado=idEmpleado;
	}

	//get sueldo
	public double getSueldo(){
			return sueldo;
	}
	//set sueldo
	public void setSueldo(double sueldo){
			this.sueldo=sueldo;
	}

	@Override
	public String toString(){
	    return super.toString() + "\n" +
	           "Empleado{"  + "\n" +
	           "idEmpleado: " + idEmpleado + "\n" +
	           "sueldo: " + sueldo + "\n" + "}";
	}

}