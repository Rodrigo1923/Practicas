
public class Lin {
	
	public static boolean secuencialLineal(int[] a, int valor) {
		boolean existe = false;
		
		for(int i = 0; i<a.length; i++) {
			if(valor == a[i]) {
				existe = true;
			}
		}
		
		return existe;
	}
	
}
