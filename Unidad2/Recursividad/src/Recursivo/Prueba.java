package Recursivo;

import javax.swing.JOptionPane;

import Tools.ToolsPanel;

public class Prueba {

	public static void main(String[] args) {
		
		//FuncionIterativa1.tablaMul((byte) 5);
		//System.out.print(FuncionesRecursivas.TablaMul((byte) 6, (byte)1));
		//disenar un metodo de clase que imprima los datos almacenados e un arreglo
		int a[]= {1,2,3,4,5};
		//System.out.println(FuncionesRecursivas.imprimeArray(a));
		ToolsPanel.imprimePantalla(FuncionesRecursivas.imprimeArrayRec(a, (byte) 0));

	}

}
