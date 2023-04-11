package Recursivo;

public class ListaOctal {
	
	public static String decimalOctalR(int n) {
		if(n!=0) {
			return decimalOctalR(n/8)+n%8;
		}else {
			return "";
		}
	}
	
	public static String listaOctal(int k) {
		if(k<=20) {
			return "\n"+k+" Octal "+decimalOctalR(k)+listaOctal(k+1);
		}else {
			return "";
		}
	}
	
}
