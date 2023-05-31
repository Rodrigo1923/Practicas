package Iniciar;

import javax.swing.JOptionPane;

import Ordenar.Codigos;
import Tools.ToolsPanel;

public class Run {

	public static void main(String[] args) {
		menu("Nuevo Arreglo,Ver,BurSeñ,DobleBur,Shell,SelecDir,Binaria,InserDir,HeapSort,QuickRec,Radix,Intercal,MDir,MNa,Exit");
	}
	
	public static void menu(String menu){  
		Codigos or = new Codigos(10);
		or.almacenaAleatorios();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Nuevo Arreglo":
					or.almacenaAleatorios();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "Ver":
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "BurSeñ":
					or.burbujaSeñal();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "DobleBur":
					or.dobleBurbuja();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "Shell":
					or.shellIncreDecre();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "SelecDir":
					or.seleDirecta();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "InserDir":
					or.inserDirecta();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "Binaria":
					or.binaria();
					break;
				case "HeapSort":
					or.heapSort();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "QuickRec":
					or.quicksortRecursivo();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "Radix":
					or.radix();
					ToolsPanel.imprimePantalla(or.impresionDatos());
					break;
				case "Intercal":
					or.intercalación();
					break;
				case "MDir":
					or.mezclaDirecta();
					break;
				case "MNa":
					or.mezclaNatural();
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}
	
	

}
