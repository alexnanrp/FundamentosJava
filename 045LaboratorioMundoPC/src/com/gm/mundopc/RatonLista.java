package com.gm.mundopc;
public class RatonLista{
	//:::::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::::
	private static int contadorRatonLista;
	private Raton ratones[];
	private static final int maxRatonLista = 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	public RatonLista(){
		this.ratones = new Raton[maxRatonLista];
	}

	//get tipo:Raton[], getRatonLista, variable:ratones
	public Raton[] getRatonLista(){
			return ratones;
	}
	//set tipo:Raton[], setRatonLista, variable:ratones
	public void setRatonLista(Raton ratones){
			this.ratones[contadorRatonLista++]=ratones;
	}

	@Override
	public String toString(){
	    return ratones[contadorRatonLista].getIdRaton() + 
	           ". Marca: " + ratones[contadorRatonLista].getRatonMarca() + 
	           ", Entrada: " + ratones[contadorRatonLista].getRatonEntrada() + 
	           ", Existencia(s): " + ratones[contadorRatonLista].getRatonExistencia(); 
	}
}