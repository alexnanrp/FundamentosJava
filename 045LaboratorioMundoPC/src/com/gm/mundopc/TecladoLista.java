package com.gm.mundopc;

public class TecladoLista{
	//:::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::
	private static int contadorLista;
	private Teclado teclados[];
	private static final int maxTecladoLista = 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	public TecladoLista(){
		this.teclados = new Teclado[maxTecladoLista];
	}

	//get tipo:Teclado[], getTecladoLista, variable:teclados
	public Teclado[] getTecladoLista(){
			return teclados;
	}
	//set tipo:Teclado, setTecladoLista, variable:teclados
	public void setTecladoLista(Teclado teclados){
			this.teclados[contadorLista++]=teclados;
	}
}