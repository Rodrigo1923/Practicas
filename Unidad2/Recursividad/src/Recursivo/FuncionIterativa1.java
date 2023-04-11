package Recursivo;


public class FuncionIterativa1 {

	public static void tablaMul(byte num) {
		String tabla="";
		for(int j=1; j<=10; j++) {
			tabla = num+"*"+j+"="+(num*j)+"\n";
		}
		System.out.print(tabla);
	}
	
}
