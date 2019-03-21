package com.gm.mundopc;
public class Monitor{
	//::::::::::::::::::::: Atributos :::::::::::::::::::::
	private int idMonitor, monitorPulgadas, monitorExistencia;
	private static int contadorMonitor;
	private String monitorMarca;
	private double monitorCosto;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::::::::: Contructores ::::::::::::::::::::::::::::::::
	public Monitor(){
		this.idMonitor = ++contadorMonitor;
	}

	public Monitor(int monitorPulgadas, String monitorMarca, double monitorCosto, int monitorExistencia){
		this();
		this.monitorPulgadas = monitorPulgadas;
		this.monitorMarca = monitorMarca;
		this.monitorCosto = monitorCosto;
		this.monitorExistencia = monitorExistencia;
	}
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//::::::::::::::::::::::::::::::: Metodos :::::::::::::::::::::::::::::::
	//get tipo:int, getPulgadasMonitor, variable:monitorPulgadas
	public int getMonitorPulgadas(){
			return monitorPulgadas;
	}
	//set tipo:int, setPulgadasMonitor, variable:monitorPulgadas
	public void setMonitorPulgadas(int monitorPulgadas){
			this.monitorPulgadas=monitorPulgadas;
	}

	//get tipo:String, getMarcaMonitor, variable:monitorMarca
	public String getMonitorMarca(){
			return monitorMarca;
	}
	//set tipo:String, setMarcaMonitor, variable:monitorMarca
	public void setMonitorMarca(String monitorMarca){
			this.monitorMarca=monitorMarca;
	}

	//get tipo:double, getCostoMonitor, variable:monitorCosto
	public double getMonitorCosto(){
			return monitorCosto;
	}
	//set tipo:double, setCostoMonitor, variable:monitorCosto
	public void setMonitorCosto(double costoMonitor){
			this.monitorCosto=monitorCosto;
	}

	//get tipo:int, getMonitorExistencia, variable:monitorExistencia
	public int getMonitorExistencia(){
			return monitorExistencia;
	}
	//set tipo:int, setMonitorExistencia, variable:monitorExistencia
	public void setMonitorExistencia(int monitorExistencia){
			this.monitorExistencia=monitorExistencia;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}