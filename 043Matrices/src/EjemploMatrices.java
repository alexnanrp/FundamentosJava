public class EjemploMatrices{
    public static void main(String[] args){
        //1. Declaramos una matriz de tipo entero
        int edades[][];

        //2. Instanciamos la matriz de tipos enteros.
        edades = new int[3][2];

        //3. Instanciar los valores de la matriz.
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        //4. Imprimimos los valores
        System.out.println("Matriz \"edades\" de tipo entero en el indice [0][0]: " + edades[0][0]);
        System.out.println("Matriz \"edades\" de tipo entero en el indice [0][1]: " + edades[0][1]);
        System.out.println("Matriz \"edades\" de tipo entero en el indice [1][0]: " + edades[1][0]);
        System.out.println("Matriz \"edades\" de tipo entero en el indice [1][1]: " + edades[1][1]);
        System.out.println("Matriz \"edades\" de tipo entero en el indice [2][0]: " + edades[2][0]);
        System.out.println("Matriz \"edades\" de tipo entero en el indice [2][1]: " + edades[2][1]);

        //********************
        //Matriz tipo "Object"
        //********************

        //1. Declaramos e instanciando la matriz de tipo "Object"
        Persona personas[][] = new Persona[1][2];

        //2. Asignamos los valores
        personas[0][0]= new Persona("Juan");
        personas[0][1]= new Persona("Karla");

        //3. Imprimir los valores
        System.out.println("Matriz \"personas\" de tipo Object en el indice [0][0]: " + personas[0][0]);
        System.out.println("Matriz \"personas\" de tipo Object en el indice [0][1]: " + personas[0][1]);

        //*********************************************
        //Recorrer los valores con un ciclo for anidado
        //*********************************************
        System.out.println();
        System.out.println("Recorrer los valores con un ciclo for anidado \"edades\".");
        
        for (int i = 0; i<edades.length; i++) {
        	for (int j=0; j<edades[i].length; j++) {
        		System.out.println("sentencia \"for\" Matriz \"edades\" de tipo entero en el indice ["+i+"]["+j+"]: " + edades[i][j]);
        	}
        }
        

        System.out.println();
        System.out.println();
        System.out.println("Recorrer los valores con un ciclo for anidado \"personas\".");
        
        for (int i = 0; i<personas.length; i++) {
        	for (int j=0; j<personas[i].length; j++) {
        		System.out.println("sentencia \"for\" Matriz \"personas\" de tipo Object en el indice ["+i+"]["+j+"]: " + personas[i][j]);
        	}
        }

        //*********************
        //Instanciar una matriz
        //*********************
        String nombres[][]={{"Teresa","Cesar","William"}, {"Yesenia","Esteban","Maria"}};

        System.out.println();
        System.out.println();
        System.out.println("Recorrer los valores con un ciclo for anidado \"nombres\".");
        
        for (int i = 0; i<nombres.length; i++) {
        	for (int j=0; j<nombres[i].length; j++) {
        		System.out.println("sentencia \"for\" Matriz \"nombres\" de tipo Object \"String\" en el indice ["+i+"]["+j+"]: " + nombres[i][j]);
        	}
        }

        
    }
}