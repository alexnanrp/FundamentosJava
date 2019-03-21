package com.gm.mundopc;
public class ListaEntradas{
	//Atributos
	private static int contadorListaEntradas;
	//Objetos de tipo arreglo
	private DispositivoEntradas listaEntradas[];
	private static final int maxListaEntradas = 50;

	public ListaEntradas(){
		this.listaEntradas = new DispositivoEntradas[maxListaEntradas];
	}
	
	//get tipo:DispositivoEntradas, getArrayEntradas, variable:listaEntradas
	public DispositivoEntradas[] getArrayEntradas(){
			return this.listaEntradas;
	}

	//set tipo:DispositivoEntradas, setArrayEntradas, variable:arrayEntradas
	public void setArrayEntradas(DispositivoEntradas listaEntradas){
			this.listaEntradas[contadorListaEntradas++]=listaEntradas;
	}


}