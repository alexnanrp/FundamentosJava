package mundopc;
import com.gm.mundopc.*;
public class Compras{
	//:::::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::::
	private double comprasCosto;
	private String comprasEquipo;

	private Cpu comprasCpus[];
	private static int comprasCpusContador;
	private static final int maxComprasCpus = 50;

	private Monitor comprasMonitores[];
	private static int comprasMonitoresContador;
	private static final int maxComprasMonitores = 50;

	private Teclado comprasTeclados[];
	private static int comprasTecladosContador;
	private static final int maxComprasTeclados = 50;

	private Raton comprasRatones[];
	private static int comprasRatonesContador;
	private static final int maxComprasRatones = 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::: Constructores ::::::::::::::::::::::::::
	public Compras(){
		this.comprasCpus = new Cpu[maxComprasCpus];
		this.comprasMonitores = new Monitor[maxComprasMonitores];
		this.comprasTeclados = new Teclado[maxComprasTeclados];
		this.comprasRatones = new Raton[maxComprasRatones];
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


	//::::::::::::::::::::::::::::: Metodos :::::::::::::::::::::::::::::
	//get comprasCpus
	public Cpu[] getComprasCpus(){
			return comprasCpus;
	}
	//set comprasCpus
	public void setComprasCpus(Cpu comprasCpus){
			this.comprasCpus[comprasCpusContador++]=comprasCpus;			
	}

	//get comprasMonitores
	public Monitor[] getComprasMonitores(){
			return comprasMonitores;
	}
	//set comprasMonitores[]
	public void setComprasMonitores(Monitor comprasMonitores){
			this.comprasMonitores[comprasMonitoresContador++]=comprasMonitores;
	}

	//get comprasTeclados
	public Teclado[] getComprasTeclados(){
			return comprasTeclados;
	}
	//set comprasTeclados[]
	public void setComprasTeclados(Teclado comprasTeclados){
			this.comprasTeclados[comprasTecladosContador++]=comprasTeclados;
	}

	//get comprasRatones[]
	public Raton[] getComprasRatones(){
			return comprasRatones;
	}
	//set comprasRatones
	public void setComprasRatones(Raton comprasRatones){
			this.comprasRatones[comprasRatonesContador++]=comprasRatones;
	}

	public String getCarritoTotal(){
		for(int i=0; i<= comprasCpusContador; i++){
			if(comprasCpus[i] == null){break;}
			comprasEquipo = comprasEquipo + comprasCpus[i].toString() + "\n";
			comprasCosto = this.comprasCpus[i].getCpuCosto() + comprasCosto;	
		}

		for(int i=0; i<= comprasMonitoresContador; i++){
			if(comprasMonitores[i] == null){break;}
			comprasEquipo = comprasEquipo + comprasMonitores[i].toString() + "\n";
			comprasCosto = this.comprasMonitores[i].getMonitorCosto() + comprasCosto;	
		}

		for(int i=0; i<= comprasTecladosContador; i++){
			if(comprasTeclados[i] == null){break;}
			comprasEquipo = comprasEquipo + comprasTeclados[i].toString() + "\n";
			comprasCosto = this.comprasTeclados[i].getTecladoCosto() + comprasCosto;	
		}

		for(int i=0; i<= comprasRatonesContador; i++){
			if(comprasRatones[i] == null){break;}
			comprasEquipo = comprasEquipo + comprasRatones[i].toString() + "\n";
			comprasCosto = this.comprasRatones[i].getRatonCosto() + comprasCosto;	
		}

		return "Equipos: " + comprasEquipo + "\n\n\nCosto: " + comprasCosto;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}