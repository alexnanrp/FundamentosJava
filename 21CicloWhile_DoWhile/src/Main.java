public class Main{
	public static void main(String[] args){
        
        var i=0;
        System.out.println("While");
        //se puede omitir las llaves si solo es una linea de código
	    while(i < 3){
          System.out.println(i);
          i++;
	    };
        
        var j=0;
        System.out.println("Ciclo Do While");
        //se puede omitir las llaves si solo es una linea de código
	    do {
          System.out.println(j);
          j++;
	    } while(j < 3);
	}
}