public class SobrecargaConstructores{
    public static void main(String[] args){
        //Creamos objeto de tipo "Persona"
        Persona persona1 = new Persona("Lilia",22);
        System.out.println("persona: \n" + persona1);
                    
        //Creamos el objeto de tipo "Empleado"
        Empleado empleado1 = new Empleado("Pedro",33,18000);
        System.out.println("empleado: \n" + empleado1);
        

    }
}