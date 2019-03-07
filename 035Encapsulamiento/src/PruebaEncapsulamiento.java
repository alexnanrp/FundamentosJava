public class PruebaEncapsulamiento{
    public static void main(String[] args){
    	//Los atributos en la clase Persona son privados
    	//Es por eso que entramos en los metodos public 
        Persona persona1 = new Persona("Juan","Esparza",true);
        
        System.out.println("persona1.getNombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1.getNombre: " + persona1.getNombre());

        System.out.println("persona1.getApellido: " + persona1.getApellido());
        persona1.setApellido("Valdez");
        System.out.println("persona1.getApellido: " + persona1.getApellido());

        System.out.println("persona1.getBorrado: " + persona1.isBorrado());
        persona1.setBorrado(false);
        System.out.println("persona1.getBorrado: " + persona1.isBorrado());

        System.out.println(persona1);
        
        
    }
}