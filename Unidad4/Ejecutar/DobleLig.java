package Ejecutar;

import javax.swing.JOptionPane;

import DobleLiga.DatosDesordenadosDobleLiga;
import DobleLiga.Nodito;
import Tools.ToolsPanel;

public class DobleLig {
	
	public static void main(String[] args) {
		menu0("Push,Pop,Peek,Free,Imprimir,Exit");
	}

	public static void menu0(String menu){  
		DatosDesordenadosDobleLiga Lista = new DatosDesordenadosDobleLiga();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "PushFr": Lista.insertarFrente((ToolsPanel.leerString("Ingresa un numero")));
				break;
				case "PushFi": Lista.insertarFinal((ToolsPanel.leerString("Ingresa un numero"))); 
					break;
				
				case "Buscar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodito op=Lista.buscarListas(ToolsPanel.leerString("Que dato buscas"));
						if(op==null) {
							ToolsPanel.imprimeError("El dato no existe");
						}else {
							ToolsPanel.imprimePantalla(""+op.getInfo());
						}
					}
					break;
				
				case "Mostrar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						ToolsPanel.imprimePantalla(Lista.mostrarLista());
					}
					break;
					
				case "Eliminar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodito op = Lista.buscarListas(ToolsPanel.leerString("Que numero quieres eliminar"));
						if(op==null) {
							ToolsPanel.imprimeError("Este dato no existe");
						}else {
							Lista.Eliminar(op);
						}
					}
					break;
				case "Modificar":
						if(Lista.isListaVacia()) {
							ToolsPanel.imprimeError("Lista vacia");
						}else {
							Nodito op=Lista.buscarListas(ToolsPanel.leerString("Que dato deseas modificar"));
							if(op==null) {
								ToolsPanel.imprimeError("Este dato no existe");
							}else {
								Lista.Modificar(op);
							}
						}
					break;
				
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
