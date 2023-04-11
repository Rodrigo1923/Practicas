package Ejecutar;

import javax.swing.JOptionPane;

import EstructurasColas.ColaA;
import MemoriaDinamica.PilaC;
import PilaEstatica.PilaA;
import Tools.ToolsPanel;

public class Iniciar {

	public static void main(String[] args) {
		menu3("Push,Pop,Peek,Free,Mostrar,Exit");
	}
	
	public static void menu3(String menu){  
		PilaA<Integer> pila = new PilaA((byte)10);
		PilaC<Integer> pilaC =new PilaC();
		ColaA<Integer> ColaA = new ColaA((byte)10);
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": ColaA.pushCola(ToolsPanel.leerInt("Ingresa un numero")); ;break;
				
				case "Pop": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+ColaA.popCola()); ;break;
				
				case "Peek": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la cola: "+ColaA.peekCola());
					;break;
				
				case "Free": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
					else
						ColaA.freeCola();
						ToolsPanel.imprimeError("Pila vacia...");
					break;
				
				case "Mostrar": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("Pila vacia");
				else
					ToolsPanel.imprimePantalla(ColaA.toString()) ;break;
				
				case "Exit": ;break;
				
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
