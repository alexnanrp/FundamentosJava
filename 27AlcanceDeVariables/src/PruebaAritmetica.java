public class PruebaAritmetica{
    public static void main(String[] args){
    	//Variables locales
        int operandoA=6,operandoB=2;

        //Creamos un objeto de la clase Aritmetica enviuando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA,operandoB);
        
        //Imprimir valores de los operandos
        System.out.println("operandoA: " + operandoA);
        System.out.println("operandoB: " + operandoB);      
        
        //Imprimiendo varibles de Clase
        //Se elmiminan hasta que se quite el objeto de "Aritmetica"
        System.out.println("\nVariables de Clase:");
        System.out.println("objeto1.a: " + objeto1.a);
        System.out.println("objeto1.b: " + objeto1.b);
        

        //Imprimiendo resultados variables locales
        //Las variables desaparecen al terminar los metodos
        System.out.println("\nVariables locales:");
        
        System.out.println("Resultado de la suma: " + objeto1.sumar());
        System.out.println("Resultado de la resta: " + objeto1.restar());
        System.out.println("Resultado de la división: " + objeto1.dividir());
        System.out.println("Resultado de la multiplicación: " + objeto1.multiplicar());
                                                                                    

    }

    //public void otroMetodo(){
    //    System.out.println("operandoA: " + operandoA);
    //    
    //}
}