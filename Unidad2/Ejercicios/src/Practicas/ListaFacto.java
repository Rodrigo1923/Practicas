package Programas;

public class ListaFacto {
	
	public static double factorialR(int dato,int c) {
		if(dato==0 || dato==1) return 1;
		else {
			if(c<=dato) {
				return c*factorialR(dato, c+1);	
			}else {
				return 1;
			}
		}
	}

	public static String listaFactoriales(int k) {
		if(k<=15) {
			return "\n"+k+" Factorial "+ factorialR(k, 1)+listaFactoriales(k+1);
		}else {
			return "";
		}
	}
	
}
