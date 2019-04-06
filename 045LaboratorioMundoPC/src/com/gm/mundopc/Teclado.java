package com.gm.mundopc;
public class Teclado extends DispositivoEntradas{
	//:::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::
	private int idTeclado, tecladoExistencia;
	private static int contadorTeclado;
	private String tecladoMarca, tecladoEntrada;
	private double tecladoCosto;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	public Teclado(){
		this.idTeclado = ++contadorTeclado;
	}

	public Teclado(String tipoEntrada, String tecladoMarca, String tecladoEntrada, double tecladoCosto, int tecladoExistencia){
		super(tipoEntrada);
		this.idTeclado = ++contadorTeclado;
		this.tecladoMarca=tecladoMarca;
		this.tecladoEntrada=tecladoEntrada;
		this.tecladoCosto=tecladoCosto;
		this.tecladoExistencia=tecladoExistencia;
	}

	//================================== Metodos ==================================
	//get tipo:String, getTecladoMarca, variable:tecladoMarca
	public String getTecladoMarca(){
			return tecladoMarca;
	}
	//set tipo:String, setTecladoMarca, variable:tecladoMarca
	public void setTecladoMarca(String tecladoMarca){
			this.tecladoMarca=tecladoMarca;
	}

	//get tipo:String, getTecladoEntrada, variable:tecladoEntrada
	public String getTecladoEntrada(){
			return tecladoEntrada;
	}
	//set tipo:String, setTecladoEntrada, variable:tecladoEntrada
	public void setTecladoEntrada(String tecladoEntrada){
			this.tecladoEntrada=tecladoEntrada;
	}

	//get tipo:double, getTecladoCosto, variable:tecladoCosto
	public double getTecladoCosto(){
			return tecladoCosto;
	}
	//set tipo:double, setTecladoCosto, variable:tecladoCosto
	public void setTecladoCosto(double tecladoCosto){
			this.tecladoCosto=tecladoCosto;
	}

	//get tipo:int, getTecladoExistencia, variable:tecladoExistencia
	public int getTecladoExistencia(){
			return tecladoExistencia;
	}
	//set tipo:int, setTecladoExistencia, variable:tecladoExistencia
	public void setTecladoExistencia(int tecladoExistencia){
			this.tecladoExistencia=tecladoExistencia;
	}

	//get idTeclado
	public int getIdTeclado(){
			return idTeclado;
	}

	@Override
	public String toString(){
	    return this.idTeclado + 
	           ". Marca: " + this.tecladoMarca + 
	           ", Entrada: " + this.tecladoEntrada + 
	           ", Existencia(s): " + this.tecladoExistencia +
	           ", Costo: " + this.tecladoCosto
	           ; 
	}
	//=============================================================================

}