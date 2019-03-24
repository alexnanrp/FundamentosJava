package com.gm.mundopc;
public class DispositivoEntradas{
	//::::::::::::::::::::::::::::::::::::: Atributos :::::::::::::::::::::::::::::::::::::
	private int idTipoEntrada;
	private static int contadorTipoEntrada;
	public String tipoEntrada;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
	//============ Se crea el constructor sin argumentos ============
	public DispositivoEntradas(){
		this.idTipoEntrada = ++contadorTipoEntrada;
	}

	//============ Constructor con argumentos ============
	public DispositivoEntradas(String tipoEntrada){
		this();
		this.tipoEntrada = tipoEntrada;
	}

	//================= Metodos set y get =================

	//get tipo:String, getTipoEntrada, variable:tipoEntrada
	public String getTipoEntrada(){
			return tipoEntrada;
	}
	//set tipo:String, setTipoEntrada, variable:tipoEntrada
	public void setTipoEntrada(String tipoEntrada){
			this.tipoEntrada=tipoEntrada;
	}

	//get idTipoEntrada
	public int getIdTipoEntrada(){
			return idTipoEntrada;
	}

}

