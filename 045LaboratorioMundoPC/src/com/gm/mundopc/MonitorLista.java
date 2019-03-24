package  com.gm.mundopc;

public class MonitorLista{
	//::::::::::::::::::::::::::::::: Atributos :::::::::::::::::::::::::::::::
	private static int contadorMonitorLista;
	private Monitor monitores[];
	private static final int maxMonitorLista = 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//::::::::::::::::::::::::::::: Constructores :::::::::::::::::::::::::::::
	public MonitorLista(){
		this.monitores = new Monitor[maxMonitorLista];
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::::::::: Metodos ::::::::::::::::::::::::::::::::
	public Monitor[] getMonitorLista(){
		return monitores;
	}

	public void setMonitorLista(Monitor monitores){
		this.monitores[contadorMonitorLista++]=monitores;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}