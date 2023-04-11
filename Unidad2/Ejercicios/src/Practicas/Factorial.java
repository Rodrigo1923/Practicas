package Prueba;

public class Factorial {

	//Iterativo
	public static double factorial(int dato) {
		
		int f=1, c=1;
		while(c<=dato) {
			f*=c;
			c++;
		}
		return f;
	}
	
	//Recursivo
	
	public static int factoR(int dato/*dato=5*/, int c) {//c=1
		if(dato==0 || dato==1) return 1;
		else {
			if(c<dato) {
				return c/*c=1*/*=factoR(dato, c+1/*c=2*/);
			}else
				return c;
		}
	}
	
	
}
