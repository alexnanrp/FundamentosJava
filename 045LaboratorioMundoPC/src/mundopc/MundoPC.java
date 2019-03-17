package mundopc;
import com.gm.mundopc.*;
import java.util.Scanner;

public class MundoPC{
    public static void main(String[] args){
        //################################### STOCK/Tienda ###################################
        //:::::::::::::::::::::::::::::::::::: Atributos ::::::::::::::::::::::::::::::::::::: 
        //==================================== Marca ====================================
        String computadoraMarca; double computadoraCosto; int computadoraExistencia;
        //=================================== Monitor ===================================
        String monitorMarca; double monitorCosto; int monitorExistencia;
        //=================================== Entrada ===================================
        String entrada; int entradaContador=0, entradaArregloContador = 0;
        //==================================== Raton ====================================
        String ratonMarca, ratonEntrada; double ratonCosto; int ratonExistencia, ratonContador=0, ratonArregloContador=0;
        //=================================== Teclado ===================================
        String tecladoMarca, tecladoEntrada; double tecladoCosto; int tecladoExistencia, tecladoContador;
        //=================================== Objetos ===================================
        DispositivoEntradas arrayDispEntradas[];//Inicializamos el arreglo 
        arrayDispEntradas = new DispositivoEntradas[50];
        //================================== Portales ===================================
        String portalEntradas="si", portalRaton="si", portalMonitor="si";
        //Tipos Objetos
        StockEntradas stockEntradas = new StockEntradas(); 
        StockEntradas arrayStockEntradas[]; 
        //Creamos el objeto scanner
        Scanner scanner = new Scanner(System.in);
        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        //########################################## Entramos al stock ###########################################
        
        //=============================================== Entradas ===============================================
        
        System.out.println("Valores solicitados para el stok: ");
        //---------------------------------- CicloWhile ----------------------------------
        do{
            entradaContador = ++entradaContador; //Entrada para el contador que llevara el array
            entradaArregloContador = entradaContador - 1;//Variable que irá dentro del arreglo
            
            System.out.println("==========================================================");
            System.out.print("Tipo de entrada: ");
            entrada = scanner.nextLine();
            arrayDispEntradas[entradaArregloContador] = new DispositivoEntradas();
            arrayDispEntradas[entradaArregloContador].setTipoEntrada(entrada);    
            System.out.print("¿Deseas ingresar una nueva entrada? [si/no]: ");
            portalEntradas = scanner.nextLine();
            
        } while(!portalEntradas.equals("no"));
        //---------------------------------- CicloWhile ----------------------------------

        //Imprimimos los valores para la entrada
        System.out.println("Los valores de las entradas son: ");
        //---------------------------------------- CicloFor ----------------------------------------
        for (int i = 0; i < arrayDispEntradas.length; i++) {
        	if(arrayDispEntradas[i] == null){return;}
            System.out.println("El tipo de entrada es: " + arrayDispEntradas[i].getTipoEntrada());
            System.out.println("El id de entrada es: "   + arrayDispEntradas[i].getIdTipoEntrada());
        }
        //---------------------------------------- CicloFor ----------------------------------------
        //=========================================================================================================



        //================================================= Raton =================================================
        do{
        	ratonContador = ++ratonContador;
        	ratonArregloContador = ratonContador - 1;
        	
        } while(!portalRaton.equals("si"));




        

        /*
        System.out.println("Valores solicitados para el stok: ");
        System.out.println();
        System.out.println("Por favor ingrese la marca de la computadora: ");
        computadoraMarca = scanner.nextLine();
        System.out.println("Por favor ingrese el costo unitario: ");
        computadoraCosto = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor ingrese las existencias: ");
        computadoraExistencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Computadora: \""+computadoraMarca+"\", en existencia: " + computadoraExistencia + " y el costo unitario es: " +computadoraCosto);
        System.out.println();

        System.out.println("Por favor ingrese la marca del monitor: ");
        monitorMarca = scanner.nextLine();
        System.out.println("Por favor ingrese el costo unitario: ");
        monitorCosto = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor ingrese las existencias: ");
        monitorExistencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Monitor: \""+monitorMarca+"\", en existencia: " + monitorExistencia + " y el costo unitario es: " + monitorCosto);
        System.out.println();

        System.out.println("Por favor ingrese la marca del raton: ");
        ratonMarca = scanner.nextLine();
        System.out.println("Por favor ingrese la entrada del raton: ");
        ratonEntrada = scanner.nextLine();
        System.out.println("Por favor ingrese el costo unitario: ");
        ratonCosto = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor ingrese las existencias: ");
        ratonExistencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Raton: \""+ratonMarca+"\", con entrada tipo: \"" + ratonEntrada + "\" en existencia: " + ratonExistencia + " y el costo unitario es: " + ratonCosto);
        System.out.println();
        

        System.out.println("Por favor ingrese la marca del teclado: ");
        tecladoMarca = scanner.nextLine();
        System.out.println("Por favor ingrese la entrada del teclado: ");
        tecladoEntrada = scanner.nextLine();
        System.out.println("Por favor ingrese el costo unitario: ");
        tecladoCosto = Double.parseDouble(scanner.nextLine());
        System.out.println("Por favor ingrese las existencias: ");
        tecladoExistencia = Integer.parseInt(scanner.nextLine());
        System.out.println("Teclado: \""+ tecladoMarca +"\", con entrada tipo: \"" + tecladoEntrada + "\" en existencia: " + tecladoExistencia + " y el costo unitario es: " + tecladoCosto);
        System.out.println();
        */


    }
}