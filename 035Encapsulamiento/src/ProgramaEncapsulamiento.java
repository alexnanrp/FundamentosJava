public class ProgramaEncapsulamiento{
    public static void main(String[] args){
        //Creamos el objeto
        Programa programa1 = new Programa("Java",true,10);

        System.out.println("programa1.getPrograma(): " + programa1.getPrograma());
        System.out.println("programa1.isConocimiento(): " + programa1.isConocimiento());
        System.out.println("programa1.getHoras(): " + programa1.getHoras());
        
        
        System.out.println("\n");
        

        //Matrices
        String [] arrayPrograma = new String[6];
        arrayPrograma[0] = "Java";
        arrayPrograma[1] = "NodeJS";
        arrayPrograma[2] = "Javascript";
        arrayPrograma[3] = "Microstrategy";
        arrayPrograma[4] = "WebFocus";
        arrayPrograma[5] = "Visual Basic";

        boolean [] arrayConocimiento = new boolean[6];
        arrayConocimiento[0] = true;
        arrayConocimiento[1] = true;
        arrayConocimiento[2] = true;
        arrayConocimiento[3] = true;
        arrayConocimiento[4] = true;
        arrayConocimiento[5] = false;

        int [] arrayHoras = new int[6];
        arrayHoras[0] = 10;
        arrayHoras[1] = 60;
        arrayHoras[2] = 500;
        arrayHoras[3] = 600;
        arrayHoras[4] = 350;
        arrayHoras[5] = 0;

        //Imprimimos los valores
        for (int i=0; i<arrayPrograma.length; i++){
        	programa1.setPrograma(arrayPrograma[i]);
        	programa1.setConocimiento(arrayConocimiento[i]);
        	programa1.setHoras(arrayHoras[i]);

        	System.out.println(programa1);
        	
        }

        
        

    }
}