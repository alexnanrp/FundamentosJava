package com.gm.mundopc;
public class ArrayEntradas{
	//Atributos
	private static int contadorArrayEntradas;
	//Objetos de tipo arreglo
	private DispositivoEntradas arrayEntradas[];
	private static final int maxArrayEntradas = 50;

	public ArrayEntradas(){
		this.arrayEntradas = new DispositivoEntradas[maxArrayEntradas];
	}


	//get tipo:DispositivoEntradas, getDispositivoEntradas, variable:arrayEntradas
	public DispositivoEntradas[] getDispositivoEntradas(){
			return arrayEntradas;
	}

	//set tipo:DispositivoEntradas, setDispositivoEntradas, variable:arrayEntradas
	public void setDispositivoEntradas(DispositivoEntradas arrayEntradas){
			this.arrayEntradas[contadorArrayEntradas++]=arrayEntradas;
	}


}