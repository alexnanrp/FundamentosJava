//Cuando se le aplica "final" ya no se le puede agregar extends para heredar
public final class ClaseFinal{
	//Variables marcadas como finales
	//Se le conoce como constante cuando se le aplica
	//un static y final ya que se asocia con la clase
	//y una vez que se le asigna el valor ya no se podrá
	//modificar el valor de la variable
	public static final int VAR_PRIMITIVO = 10;


	//Variables marcadas como finales para tipos "Object"
	//la referencia "new Persona()" ya no se puede cambiar
	//pero el objeto Persona si se puede modificar
	//lo unico fijo es la referencia de la variable
	public static final Persona VAR_PERSONA = new Persona();

	//Metodo final, se estudiará más a detalle en el "tema de sobrescritura"
	//Si se quiere modificar el metodo desde otra clase ya no será posible
	public final void metodoFinal(){

	}
	
}