package com.gm.mundopc;
public class Raton extends DispositivoEntradas{
	//::::::::::::::::::::::::::::::: Atributos :::::::::::::::::::::::::::::::
	//identificador unico  del raton.
	private int idRaton;
	//Contador de tipo estático para no ser parte del objeto si no de la clase
	private static int contadorRaton;
	private int ratonExistencia;
	private String ratonMarca, ratonEntrada;
	private double ratonCosto;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//===========================================
	//====Dependen de la clase "Raton"====
	//===========================================

    //Constructor vacio sin argumentos
    //y se implementa el contador de la orden
    public Raton(){
    	this.idRaton = ++contadorRaton;
    }

    public Raton(String tipoEntrada, String ratonMarca, String ratonEntrada, double ratonCosto, int ratonExistencia){
    	super(tipoEntrada);
    	this.idRaton = ++contadorRaton;
    	this.ratonMarca=ratonMarca;
    	this.ratonEntrada=ratonEntrada;
    	this.ratonCosto=ratonCosto;
    	this.ratonExistencia = ratonExistencia;
    }

    //====================== Metodos ======================
    //get tipo:String, getRatonMarca, variable:ratonMarca
    public String getRatonMarca(){
    		return ratonMarca;
    }
    //set tipo:String, setRatonMarca, variable:ratonMarca
    public void setRatonMarca(String ratonMarca){
    		this.ratonMarca=ratonMarca;
    }

    //get tipo:String, getRatonEntrada, variable:ratonEntrada
    public String getRatonEntrada(){
    		return ratonEntrada;
    }
    //set tipo:String, setRatonEntrada, variable:ratonEntrada
    public void setRatonEntrada(String ratonEntrada){
    		this.ratonEntrada=ratonEntrada;
    }
    //get tipo:double, getRatonCosto, variable:ratonCosto
    public double getRatonCosto(){
    		return ratonCosto;
    }
    //set tipo:double, setRatonCosto, variable:ratonCosto
    public void setRatonCosto(double ratonCosto){
    		this.ratonCosto=ratonCosto;
    }
    //get tipo:int, getRatonExistencia, variable:ratonExistencia
    public int getRatonExistencia(){
    		return ratonExistencia;
    }
    //set tipo:int, setRatonExistencia, variable:ratonExistencia
    public void setRatonExistencia(int ratonExistencia){
    		this.ratonExistencia=ratonExistencia;
    }

    //get idRaton
    public int getIdRaton(){
    		return idRaton;
    }
    //=====================================================

}

