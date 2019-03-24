import com.gm.mundopc.*;
public class Compras{
	//:::::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::::
	private CpuLista comprasCpus[];
	private static int comprasCpusContador;
	private static final int maxComprasCpus = 50;

	private MonitorLista comprasMonitores[];
	private static int comprasMonitoresContador;
	private static final int maxComprasMonitores = 50;

	private TecladoLista comprasTeclados[];
	private static int comprasTecladosContador;
	private static final int maxComprasTeclados = 50;

	private RatonLista comprasRatones[];
	private static int comprasRatonesContador;
	private static final int maxComprasRatones = 50;
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	//:::::::::::::::::::::::::: Constructores ::::::::::::::::::::::::::
	public Compras(){
		this.comprasCpus = new CpuLista[maxComprasCpus];
		this.comprasMonitores = new MonitorLista[maxComprasMonitores];
		this.comprasTeclados = new TecladoLista[maxComprasTeclados];
		this.comprasRatones = new RatonLista[maxComprasRatones];
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


	//::::::::::::::::::::::::::::: Metodos :::::::::::::::::::::::::::::
	//get comprasCpus
	public CpuLista[] getComprasCpus(){
			return comprasCpus;
	}
	//set comprasCpus[]
	public void setComprasCpus(CpuLista comprasCpus){
			this.comprasCpus[comprasCpusContador++]=comprasCpus;
	}

	//get comprasMonitores
	public MonitorLista[] getComprasMonitores(){
			return comprasMonitores;
	}
	//set comprasMonitores[]
	public void setComprasMonitores(MonitorLista comprasMonitores){
			this.comprasMonitores[comprasMonitoresContador++]=comprasMonitores;
	}

	//get comprasTeclados
	public TecladoLista[] getComprasTeclados(){
			return comprasTeclados;
	}
	//set comprasTeclados[]
	public void setComprasTeclados(TecladoLista comprasTeclados){
			this.comprasTeclados[comprasTecladosContador++]=comprasTeclados;
	}

	//get comprasRatones[]
	public RatonLista[] getComprasRatones(){
			return comprasRatones;
	}
	//set comprasRatones
	public void setComprasRatones(RatonLista comprasRatones){
			this.comprasRatones[comprasRatonesContador++]=comprasRatones;
	}
	//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
}