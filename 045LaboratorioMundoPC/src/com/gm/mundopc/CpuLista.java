package com.gm.mundopc;

public class CpuLista{
	//:::::::::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::::
	private static int cpuListaContador;
	private Cpu cpus[];
	private static final int maxCpuLista= 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::::::: Constructores ::::::::::::::::::::::::::
	public CpuLista(){
		this.cpus = new Cpu[maxCpuLista];
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//::::::::::::::::::::::::::::::: Metodos :::::::::::::::::::::::::::::::
	//get cpus
	public Cpu[] getCpuLista(){
			return cpus;
	}

	//set cpus
	public void setCpuLista(Cpu cpus){
			this.cpus[cpuListaContador++]=cpus;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}