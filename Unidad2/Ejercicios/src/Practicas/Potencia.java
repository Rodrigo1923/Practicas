package Practicas;

import Tools.ToolsPanel;

public class Potencia {

	public static void potencia(int num, int pot) {
		int aux=num;
		for(int i=1; i<pot; i++)
			aux*=num;
		
		ToolsPanel.imprimePantalla(""+aux);
		
	}
	
	public static int recPot(int num, int pot, int aux) {
		if(pot!=0) {
			aux*=num;
			return recPot(num, pot-1, aux);
		}
		return aux;
	}
	
}
