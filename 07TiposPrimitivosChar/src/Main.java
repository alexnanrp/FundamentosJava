public class Main{
	public static void main(String[] args){
	    System.out.println("bits tipo char: " + Character.SIZE);
	    System.out.println("bytes tipo char: " + Character.BYTES);
	    System.out.println("valor minimo tipo char: " + Character.MIN_VALUE);
	    System.out.println("valor maximo tipo char: " + Character.MAX_VALUE);

	    System.out.println();
        
        char c = '@'; //IMPORTANTE se usa comilla SIMPLE (') <-- char es un "Valor Primitivo"
	                  // String es un tipo "Object"


        //para saber más de las longitudes o como utilizar mas este valor se puede ver en esta liga
        //https://en.wikipedia.org/wiki/List_of_Unicode_characters
        char code = '\u0021'; // valor unicode "!"
        System.out.println("Valor char unicode u0021: " + code);

        char codeDec = 33; // valor decimal "!"
        System.out.println("Valor char decimal 33: " + codeDec);

        char codeChar = '!'; // valor character "!"
        System.out.println("Valor char !: " + codeChar);


	}
}