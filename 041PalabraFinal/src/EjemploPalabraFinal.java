public class EjemploPalabraFinal{
    public static void main(String[] args){
        //Se intenta modificar un atributo marcado como final
        //Como la variable esta definida como final no se puede modificar
        //*******************************************************
        //ClaseFinal.VAR_PRIMITIVO = 10;//Esto no se puede hacer
        //*******************************************************

        //Tampoco es posible cambiar la referencia de una variable
        //de tipo "Object" ya que también esta marcada como final
        //*******************************************************
        //ClaseFinal.VAR_PERSONA = new Persona();
        //*******************************************************

        //Lo que si es posible es cambiar el contenido del objeto
        //que esta apuntando el objeto de la variable persona
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println("ClaseFinal.VAR_PERSONA.getNombre(): " + ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println("ClaseFinal.VAR_PERSONA.getNombre(): " + ClaseFinal.VAR_PERSONA.getNombre());


    }
}