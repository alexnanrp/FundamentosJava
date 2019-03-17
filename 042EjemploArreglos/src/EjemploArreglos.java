public class EjemploArreglos{
    public static void main(String[] args){
        //1. Declaramos un arreglo de tipo enteros.
        int edades[];

        //2. Instanciar el arreglo de enteros.
        //De cuantos elementos va a constar esta arreglo
        edades = new int[3];

        //3.Inicializamos los valores de arreglos de enteros.
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //Imprimir los valores a la salida estandar
        //4. Leer cada uno de los valores del arreglo
        System.out.println("Arreglo de enteros en el indice 0: " + edades[0]);
        System.out.println("Arreglo de enteros en el indice 1: " + edades[1]);
        System.out.println("Arreglo de enteros en el indice 2: " + edades[2]);

        System.out.println();
        
        
        //*********************
        //Arreglo para "Object"
        //*********************
        System.out.println("Arreglo de tipo Object: \"Persona\" ");

        //1. Declarar un arreglo de tipo Object
        Persona personas[];

        //2. Instanciar el arreglo de tipo Object
        personas = new Persona[4];

        //3. Inicializar los valores del arreglo
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        //4. Imprimir los valores del arreglo
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        System.out.println("Arreglo personas indice 3: " + personas[3]);

        System.out.println();
        


        //*****************************************
        //Arreglo utilizando notación simplificada.
        //*****************************************

        //Declarar, instanciar e inicializar los valores del arreglo
        String nombres[] = {"Sara","Laura","Carlos","Carmen"};

        System.out.println("Arreglo utilizando notación simplificada.");
        //Imprimir los elementos con un ciclo for
        for (int i=0; i<nombres.length; i++) {
        	System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        	
        }

        
    }
}