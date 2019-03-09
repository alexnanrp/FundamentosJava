import java.util.Date;

public class Cliente extends Persona{
	//Atributos
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes; //Contador con static para no generar otro objeto y que se reinicie el contador

	//Constructor vacio
	public Cliente(){}

	//Constructor con argumentos
	public Cliente(Date fechaRegistro, boolean vip){
		this.idCliente = ++contadorClientes;	
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	    
	}

	//Generamos los metodos

	//get fechaRegistro
	public Date getFechaRegistro(){
			return fechaRegistro;
	}
	//set fechaRegistro
	public void setFechaRegistro(Date fechaRegistro){
			this.fechaRegistro=fechaRegistro;
	}

	//is vip <-- is es lo mismo que get
	public boolean isVip(){
			return vip;
	}
	//set vip
	public void setVip(boolean vip){
			this.vip=vip;
	}

	@Override
	public String toString(){
	    return super.toString()  + "\n" +

	           "idCliente: "     + idCliente + "\n" +
	           "fechaRegistro: " + fechaRegistro + "\n" +
	           "vip: " + vip + "\n" + "}";
	}
}