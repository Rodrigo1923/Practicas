
public class Expo {

	public static int exponencial(int[] a, int valor) {
		
		int tamaño = a.length;
		if(a[0]== valor) {
			return 0;
		}
		
		int i=1;
		while(i<tamaño && a[i] <= valor) {
			i *= 2;
		}
		
		return busquedaBinaria(a, valor, i/2, Math.min(i, tamaño - 1));
		
	}
	
	public static int busquedaBinaria(int[] a, int clave, int inicio, int fin) {
		if(fin>=inicio) {
			int medio = inicio+(fin - inicio)/2;
			
			if(a[medio] == clave) {
				return medio;
			}
			
			if(a[medio]>clave) {
				return busquedaBinaria(a, clave, inicio, medio-1);
			}
			
			return busquedaBinaria(a, clave, medio+1, fin);
			
		}
		
		return -1;
	}
	
}
