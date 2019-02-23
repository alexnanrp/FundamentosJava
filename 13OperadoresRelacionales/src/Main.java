public class Main{
	public static void main(String[] args){
		//Inicializamos variables
        int a = 3, b = 2;
        System.out.println("El valor de \"a\" es: " + a);
        System.out.println("El valor de \"b\" es: " + b);
        System.out.println();
        
        String resp;
        //Operador de igualdad
        System.out.println("Operador de igualdad.");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean c = (a == b);
        if(c == true)
        	resp = " Si ";
        else
        	resp = " No ";
        System.out.println("¿La variable \"a\" es igual a la variable \"b\"?: " + resp);
        System.out.println();
       
        //Operador de desigualdad
        System.out.println("Operador de desigualdad");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean d = (a != b);
        if(d == true)
        	resp = " Si ";
        else
        	resp = " No ";
        System.out.println("¿La variable \"a\" es des-igual a la variable \"b\"?: " + resp);
        System.out.println();
        
        //Trabajando con cadenas
        System.out.println("Cadenas");
        String  str1 = "hola", str2 = "hola";
        System.out.println("La cadena \"str1\" es: " + str1);
        System.out.println("La cadena \"str2\" es: " + str2);
        //Para los String se utiliza el comando .equals ya que el valor no es un "tipo primitivo",
        //es un objeto
        boolean e = str1.equals(str2); 
        if(e == true)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La cadena \"str1\" es des-igual a la cadena \"str2\"?: " + resp);
        System.out.println();
        
        //Operador Mayor que.
        System.out.println("Operador Mayor que");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean f = (a>b);
        if(f == true)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"a\" es Mayor que la variable \"b\"?: " + resp);
        System.out.println();

        //Operador Menor que.
        System.out.println("Operador Menor que");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean g = (a<b);
        if(g == true)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"a\" es Menor que la variable \"b\"?: " + resp);
        System.out.println();

        //Operador Mayor o Igual que.
        System.out.println("Operador Mayor o Igual que");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean h = (a>=b);
        if(h == true)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"a\" es Mayor o Igual que la variable \"b\"?: " + resp);
        System.out.println();

        //Operador Menor o Igual que.
        System.out.println("Operador Menor o Igual que");
        //Generamos una variable de tipo boolean para que nos regrese true o false
        boolean i = (a<=b);
        if(i == true)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"a\" es Menor o Igual que la variable \"b\"?: " + resp);
        System.out.println();

        //Par o Impar.
        System.out.println("Par o Impar");
        //Generamos una variable de entero "int" para obtener un 0 o un valor diferente de 0
        int j = (a%2), k = (b%2);
        System.out.println("El valor de la variable \"j\" es: " + j);
        System.out.println("El valor de la variable \"k\" es: " + k);
        if(j == 0)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"a\" es Par ?: " + resp);

        if(k == 0)
        	resp = "Si";
        else
        	resp = "No";
        System.out.println("¿La variable \"b\" es Par ?: " + resp);
        

        //Ejercicio: edad de una persona
        int edad = 24;
        int adulto = 18;
        boolean adultoMayor = (edad >= adulto);
        if(adultoMayor == true)
        	resp = "La persona es un adulto";
        else
        	resp = "La persona es menor";
        
        System.out.println(resp);


        

	}
}