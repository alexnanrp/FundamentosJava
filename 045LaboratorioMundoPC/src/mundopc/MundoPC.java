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
        String monitorMarca; double monitorCosto; int monitorExistencia, monitorContador=0, monitorArregloContador=0, monitorPulgadas;
        //=================================== Entrada ===================================
        String entrada; int entradaContador=0, entradaArregloContador = 0;
        //==================================== Raton ====================================
        String ratonMarca; double ratonCosto; int ratonExistencia, ratonContador=0, ratonEntrada, ratonArregloContador=0;
        //=================================== Teclado ===================================
        String tecladoMarca; double tecladoCosto; int tecladoExistencia, tecladoContador=0, tecladoEntrada, tecladoArregloContador=0;
        //=================================== Objetos ===================================
        ListaEntradas listaEntradas = new ListaEntradas();
        DispositivoEntradas[] entradaLista = listaEntradas.getArrayEntradas();

        RatonLista ratonLista = new RatonLista();
        Raton[] ratones = ratonLista.getRatonLista();

        TecladoLista tecladoLista = new TecladoLista();
        Teclado[] teclados = tecladoLista.getTecladoLista();
        //================================== Portales ===================================
        String portalEntradas="si", portalRaton="si", portalTeclado="si", portalMonitor="si";
        //Tipos Objetos
        //Creamos el objeto scanner
        Scanner scanner = new Scanner(System.in);
        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        //########################################## Entramos al stock ###########################################
        
        //=============================================== Entradas ===============================================
        
        System.out.println("Valores solicitados para el stock: ");
        //---------------------------------- CicloWhile ----------------------------------
        do{
            entradaContador = ++entradaContador; //Entrada para el contador que llevara el array
            entradaArregloContador = entradaContador - 1;//Variable que irá dentro del arreglo
            
            System.out.println("==========================================================");
            System.out.print("Tipo de entrada: ");
            entrada = scanner.nextLine();
            DispositivoEntradas dispositivoEntradas = new DispositivoEntradas();
            dispositivoEntradas.setTipoEntrada(entrada);

            listaEntradas.setArrayEntradas(dispositivoEntradas);
            System.out.print("¿Deseas ingresar una nueva entrada? [si/no]: ");
            portalEntradas = scanner.nextLine();
            
        } while(!portalEntradas.equals("no"));
        //---------------------------------- CicloWhile ----------------------------------
        
        //Imprimimos los valores para la entrada
        System.out.println("Los valores de las entradas son: ");
        //---------------------------------------- CicloFor ----------------------------------------
        for (int i = 0; i < entradaLista.length; i++) {
        	if(entradaLista[i] == null){break;}
            System.out.println("El tipo de entrada es: " + entradaLista[i].getTipoEntrada());
            System.out.println("El id de entrada es: "   + entradaLista[i].getIdTipoEntrada());
        }
        //---------------------------------------- CicloFor ----------------------------------------
        //=========================================================================================================
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Raton: ");
        //================================================= Raton =================================================
        do{
        	ratonContador = ++ratonContador;
        	ratonArregloContador = ratonContador - 1;
        	System.out.println("==========================================================");
            System.out.print("Marca del Raton: ");
            ratonMarca = scanner.nextLine();
            System.out.print("Costo del raton: ");
            ratonCosto = Double.parseDouble(scanner.nextLine());
            System.out.print("En existencia: ");
            ratonExistencia = Integer.parseInt(scanner.nextLine());
            System.out.println("Elige el tipo de entrada: ");
            //---------------------------------------- CicloFor ----------------------------------------
            for (int i = 0; i < entradaLista.length; i++) {
            	if(entradaLista[i] == null){break;}
                System.out.println(entradaLista[i].getIdTipoEntrada() + ": " + entradaLista[i].getTipoEntrada());
            }
            //---------------------------------------- CicloFor ----------------------------------------
            System.out.println("==========================");
            System.out.println("0: Insertar otra Entrada.");
            System.out.println("==========================");
            System.out.print("Tipo de entrada: ");
            ratonEntrada = Integer.parseInt(scanner.nextLine()) -1;
            
            if(ratonEntrada == -1){
            	System.out.print("Inserte el nombre de la nueva entrada: ");
            	entrada = scanner.nextLine();
            	Raton raton = new Raton(entrada,ratonMarca,entrada,ratonCosto,ratonExistencia);
            	ratonLista.setRatonLista(raton);
            }else{
                  Raton raton = new Raton();
                  raton.setRatonMarca(ratonMarca);
                  raton.setRatonCosto(ratonCosto);
                  raton.setRatonEntrada(entradaLista[ratonEntrada].getTipoEntrada());
                  raton.setRatonExistencia(ratonExistencia);
                  
                  ratonLista.setRatonLista(raton);
            }

            System.out.print("¿Deseas ingresar una nueva entrada? [si/no]: ");
            portalRaton = scanner.nextLine();
        } while(!portalRaton.equals("no"));
        //---------------------------------------- CicloFor ----------------------------------------
        for (int i = 0; i < ratones.length; i++) {
            	if(ratones[i] == null){break;}
                System.out.println(ratones[i].getIdRaton() + ". Marca: " + ratones[i].getRatonMarca() + ", Entrada: " + ratones[i].getRatonEntrada() + ", Existencia(s): " + ratones[i].getRatonExistencia());
        }
        //---------------------------------------- CicloFor ----------------------------------------
        //=========================================================================================================
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Teclado: ");
        //================================================ Teclado ================================================
        do{
        	tecladoContador = ++tecladoContador;
        	tecladoArregloContador = tecladoContador - 1;
        	System.out.println("==========================================================");
            System.out.print("Marca del Teclado: ");
            tecladoMarca = scanner.nextLine();
            System.out.print("Costo del teclado: ");
            tecladoCosto = Double.parseDouble(scanner.nextLine());
            System.out.print("En existencia: ");
            tecladoExistencia = Integer.parseInt(scanner.nextLine());
            System.out.println("Elige el tipo de entrada: ");
            //---------------------------------------- CicloFor ----------------------------------------
            for (int i = 0; i < entradaLista.length; i++) {
            	if(entradaLista[i] == null){break;}
                System.out.println(entradaLista[i].getIdTipoEntrada() + ": " + entradaLista[i].getTipoEntrada());
            }
            //---------------------------------------- CicloFor ----------------------------------------
            System.out.println("==========================");
            System.out.println("0: Insertar otra Entrada.");
            System.out.println("==========================");
            System.out.print("Tipo de entrada: ");
            tecladoEntrada = Integer.parseInt(scanner.nextLine()) -1;
            
            if(tecladoEntrada == -1){
            	System.out.print("Inserte el nombre de la nueva entrada: ");
            	entrada = scanner.nextLine();
            	Teclado teclado = new Teclado(entrada,tecladoMarca,entrada,tecladoCosto,tecladoExistencia);
            	tecladoLista.setTecladoLista(teclado);
            }else{
                  Teclado teclado = new Teclado();
                  teclado.setTecladoMarca(tecladoMarca);
                  teclado.setTecladoCosto(tecladoCosto);
                  teclado.setTecladoEntrada(entradaLista[tecladoEntrada].getTipoEntrada());
                  teclado.setTecladoExistencia(tecladoExistencia);
                  
                  tecladoLista.setTecladoLista(teclado);
            }

            System.out.print("¿Deseas ingresar una nueva entrada? [si/no]: ");
            portalTeclado = scanner.nextLine();
        } while(!portalTeclado.equals("no"));
        //---------------------------------------- CicloFor ----------------------------------------
        for (int i = 0; i < teclados.length; i++) {
            	if(teclados[i] == null){break;}
                System.out.println(teclados[i].getIdTeclado() + ". Marca: " + teclados[i].getTecladoMarca() + ", Entrada: " + teclados[i].getTecladoEntrada() + ", Existencia(s): " + teclados[i].getTecladoExistencia());
        }
        //---------------------------------------- CicloFor ----------------------------------------
        //=========================================================================================================
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Monitor: ");
        //================================================ Monitor ================================================
        do{
        	monitorContador = ++monitorContador;
        	monitorArregloContador = monitorContador - 1;
        	System.out.println("==========================================================");
            System.out.print("Marca del Monitor: ");
            monitorMarca = scanner.nextLine();
            System.out.print("Costo del Monitor: ");
            monitorCosto = Double.parseDouble(scanner.nextLine());
            System.out.print("En existencia: ");
            monitorExistencia = Integer.parseInt(scanner.nextLine());
            System.out.print("Pulgadas del Monitor: ");
            monitorPulgadas = Integer.parseInt(scanner.nextLine());
            
                  Monitor monitor = new Monitor();
                  monitor.setMonitorMarca(monitorMarca);
                  monitor.setMonitorCosto(monitorCosto);
                  monitor.setMonitorExistencia(monitorExistencia);
                  monitor.setMonitorPulgadas(monitorPulgadas);
//                  tecladoLista.setTecladoLista(teclado);

            System.out.print("¿Deseas ingresar una nueva entrada? [si/no]: ");
            portalMonitor = scanner.nextLine();
        } while(!portalMonitor.equals("no"));
        //=========================================================================================================






        

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