package TestEjecucion;

import javax.swing.JOptionPane;

import Programas.DatoSimple;
import Tools.ToolsPanel;

public class Test {

	public static void main(String[] args) {
		menu3("Agregar,Imprimir,Buscar,Eliminar,Salir");
	}
	
	public static void menu3(String menu){  
		String sel="";
		DatoSimple obj = new DatoSimple((byte) 10);
		byte pos=0;
		do {
				sel=boton(menu);
				switch(sel){
				case "Agregar": obj.almacenarDato() ;break;
				
				case "Imprimir": obj.imprimeDatos() ;break;
				
				case "Buscar":
					if(obj.validaVacio()) {
						ToolsPanel.imprimeError("Array vacio");
					}else {
						pos = obj.buscarSecuencial(ToolsPanel.leerString("Nombre a buscar"));
						if(pos!=-2) {
							ToolsPanel.imprimePantalla("Se encuentra en la posicion: "+pos);
						}else {
							ToolsPanel.imprimeError("Dato no encontrado");
						}
					}
					break;
					
				case "Eliminar":
					if(obj.validaVacio()) {
						ToolsPanel.imprimeError("Array vacio");
					}else {
						pos = obj.buscarSecuencial(ToolsPanel.leerString("Nombre a eliminar"));
						if(pos!=-2) {
							obj.eliminaDatos(pos);
							obj.imprimeDatos();
						}else {
							ToolsPanel.imprimeError("No se encontro el nombre a eliminar");
						}
					}
					break;
					
				case "Salir": break;
				}//switch
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}

}
