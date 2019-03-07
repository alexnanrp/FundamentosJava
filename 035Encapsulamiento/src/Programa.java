public class Programa{
	//Creamos los atributos
	private String programa;
	private boolean conocimiento;
	private int horas;

	//Constructor vacio
	public Programa(){}

	//Constructor que define las variables solo a través de la llamada objeto
	public Programa(String programa, boolean conocimiento, int horas){
		this.programa = programa;
		this.conocimiento = conocimiento;
		this.horas=horas;
	}
    //=================================================
	//Metodos get "Obtener" y set "agregar o modificar"
	//=================================================
	//get Obtener
	public String getPrograma(){
		return this.programa;
	}
	//set Agregar
	public void setPrograma(String programa){
		this.programa=programa;
	}

	//is Obtener true o false
	public boolean isConocimiento(){
		return this.conocimiento;
	}
	//set Agregar
	public void setConocimiento(boolean conocimiento){
		this.conocimiento=conocimiento;
	}

	//get Obtener
	public int getHoras(){
		return this.horas;
	}
	//set Agregar
	public void setHoras(int horas){
		this.horas=horas;
	}


	//objeto print
    public String toString(){
    	return "Nombre del programa: " + this.programa + "\n" +
    	       "¿Conocimiento del Programa?: " + this.conocimiento + "\n" +
    	       "Horas trabajadas: " + this.horas + "\n\n";
    }


}