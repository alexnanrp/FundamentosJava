package com.gm.mundopc;

public class Cpu{
	//::::::::::::::::::::::::::::: Atributos :::::::::::::::::::::::::::::
	private int idCpu, cpuExistencia, cpuRam, cpuEspacio;
	private static int cpuContador;
	private double cpuCosto;
	private String cpuMarca;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//::::::::::::::::::::::::::: Constructores :::::::::::::::::::::::::::
	public Cpu(){
		idCpu = ++cpuContador;
	}

	public Cpu(String cpuMarca, double cpuCosto, int cpuExistencia, int cpuRam, int cpuEspacio){
		this();
		this.cpuMarca = cpuMarca;
		this.cpuCosto = cpuCosto;
		this.cpuExistencia = cpuExistencia;
		this.cpuRam = cpuRam;
		this.cpuEspacio = cpuEspacio;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::::::: Metodos ::::::::::::::::::::::::::::::
	//get tipo:String, getCpuMarca, variable:cpuMarca
	public String getCpuMarca(){
			return cpuMarca;
	}
	//set tipo:String, setCpuMarca, variable:cpuMarca
	public void setCpuMarca(String cpuMarca){
			this.cpuMarca=cpuMarca;
	}

	//get tipo:double, getCpuCosto, variable:cpuCosto
	public double getCpuCosto(){
			return cpuCosto;
	}
	//set tipo:double, setCpuCosto, variable:cpuCosto
	public void setCpuCosto(double cpuCosto){
			this.cpuCosto=cpuCosto;
	}

	//get tipo:int, getCpuExistencia, variable:cpuExistencia
	public int getCpuExistencia(){
			return cpuExistencia;
	}
	//set tipo:int, setCpuExistencia, variable:cpuExistencia
	public void setCpuExistencia(int cpuExistencia){
			this.cpuExistencia=cpuExistencia;
	}

	//get tipo:int, getCpuRam, variable:cpuRam
	public int getCpuRam(){
			return cpuRam;
	}
	//set tipo:int, setCpuRam, variable:cpuRam
	public void setCpuRam(int cpuRam){
			this.cpuRam=cpuRam;
	}

	//get tipo:int, getCpuEspacio, variable:cpuEspacio
	public int getCpuEspacio(){
			return cpuEspacio;
	}
	//set tipo:int, setCpuEspacio, variable:cpuEspacio
	public void setCpuEspacio(int cpuEspacio){
			this.cpuEspacio=cpuEspacio;
	}

	//get idCpu
	public int getIdCpu(){
			return idCpu;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}