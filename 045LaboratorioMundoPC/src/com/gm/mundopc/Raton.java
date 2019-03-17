package com.gm.mundopc;
public class Raton extends DispositivoEntradas{
	//Atributos
	//identificador unico  del raton.
	private int idRaton;
	//Contador de tipo estático para no ser parte del objeto si no de la clase
	private static int contadorRaton;

	//===========================================
	//====Dependen de la clase "Raton"====
	//===========================================
    private static final int maxComputadoras = 100;

    //Constructor vacio sin argumentos
    //y se implementa el contador de la orden
    public Raton(){
    	this.idRaton = ++contadorRaton;
    }


}