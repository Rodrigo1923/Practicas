package Test;

import javax.swing.JOptionPane;
import Proyecto.buscar;
import Tools.ToolsPanel;

public class Prueba {

	public static void main(String[] args) {
		
		menu3("AgregarOr,BuscarOr,Imprimir,Eliminar,Modificar,Salir");

	}
	
	public static void menu3(String menu){  
		String sel="";
		buscar obj = new buscar((byte) 10);
		byte pos=0;
		do {
				sel=boton(menu);
				switch(sel){
				case "AgregarOr":
					obj.AgregaOr();
					break;
				case "BuscarOr":
					pos = obj.buscarSecOrdenado(ToolsPanel.leerInt("Inserta un numero a buscar"));
					if(pos<0) {
						ToolsPanel.imprimeError("No se encontro, va en la posicion: "+ pos*-1);
					}else {
						ToolsPanel.imprimePantalla("La posicion es: "+ pos);
					}
					break;
				case "Eliminar":
					obj.eliminar();
					break;
				case "Imprimir":
					obj.imprimeDatos();
					break;
				case "Modificar":
					if(obj.validaVacio())
						ToolsPanel.imprimeError("Array vacio");
					else
						obj.modificar(ToolsPanel.leerInt("Que numero quieres cambiar"));
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
