package Recursivo;

import javax.swing.JOptionPane;

import Tools.ToolsPanel;

public class FuncionesRecursivas {
	private static String lista="";

	public static String FuncionIterativa1(int j, int n){
		
		if(j<=n) {
			return "\n"+j+FuncionIterativa1(j+1, n);
		}else return "";
		
	}
	
	public static String funcioIterativa3(int j, int n) {
		
		return (j<=n)? "\n"+j+funcioIterativa3(j+1, n):"";
		
	}
	
	public static String TablaMul(byte num, byte j) {
		if(j<=10) {
			TablaMul((byte) num,(byte) (j+1));
			return num+"*"+j+"="+(num*j)+"\n";
		}else {
			return "";
		}
	}
	
	public static void imprimeArray(int a[]) {
		String lista="";
		for(byte j=0; j<a.length; j++) {
			lista+=j+"["+a[j]+"]\n";
		}
		ToolsPanel.imprimePantalla(lista);
	}
	
	public static String imprimeArrayRec(int a[], byte j) {
		if(j<a.length) {
			imprimeArrayRec(a, (byte)(j+1));
			return lista+=j+"["+a[j]+"]\n";
		}else return "";
	}
	
	//disenar un metodo de clase que resiba un valor entero e imprima una tabla de multiplicar
}
