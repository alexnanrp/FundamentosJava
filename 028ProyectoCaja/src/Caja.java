public class Caja{
    int ancho,alto,profundo;

    //Constructor Vacio
    Caja(){

    }

    //Constructor con tres argumentos
    Caja(int ancho, int alto, int profundo){
    	this.ancho=ancho;
    	this.alto=alto;
    	this.profundo=profundo;
    }

    //Metoso que calcula el volumen
    int volumen(){
    	return (ancho * alto * profundo);
    }
}