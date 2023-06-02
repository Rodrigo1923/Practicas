
public class Binario {

	public static int buscar( int [] arreglo, int dato) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos;
		 while (inicio <= fin) {
		     pos = (inicio+fin) / 2;
		     if ( arreglo[pos] == dato )
		       return pos;
		     else if ( arreglo[pos] < dato ) {
		  inicio = pos+1;
		     } else {
		  fin = pos-1;
		     }
		 }
		 return -1;
	}
	
}
