package Metodos;

public class Ejercicio {

	public static boolean numAmstrong(int valor) {
		
		int aux=valor, sum=0;
		
		while(aux>0) {
			
			sum+=Math.pow((aux%10), 3);
			aux/=10;
			
		}
		
		return(sum==valor);
	}
	
	public static int SumDivisores(int valor) {
		
		int sum=0;
		for(int i=0; i<=valor; i++) {
			
			if(valor%i==0) {
				
				sum+=i;
				
			}
			
		}
		
		return sum;
	}
	
	public static boolean ValidarAmigos(int dato1, int dato2) {
		return(dato1==SumDivisores(dato2) && dato2==SumDivisores(dato1));
	}
	
	public static void sumNum(int valor) {
		
		int sum=0;
		
		while(valor>0) {
			
			valor/=10;
			sum++;
			
		}
		System.out.println(sum);
	}
	
}
