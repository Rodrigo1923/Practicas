package Operaciones;

import javax.swing.JOptionPane;

import MemoriaDinamica.Nodo;
import Tools.ToolsPanel;

public class Ejecutar {

	public static void main(String[] args) {
		menu1("PushFr,PushFi,Buscar,Mostrar,Modificar,Exit");
	}
	
	public static void menu1(String menu){  
		Ordenado<Integer> Lista = new Ordenado();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "PushFr": Lista.insertarFrente((ToolsPanel.leerInt("Ingresa un numero")));
				break;
				case "PushFi": Lista.insertarFinal((ToolsPanel.leerInt("Ingresa un numero"))); 
					break;
				
				case "Buscar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodo obj = Lista.buscarLista(ToolsPanel.leerInt("Que numero buscas"));
						if(obj!=null) {
							ToolsPanel.imprimePantalla("Numero buscado: "+obj.getInfo());
							obj = Lista.buscarAnterior(obj);
							if(obj==null) {
								ToolsPanel.imprimeError("Es el primero numero, no tiene uno anterior.");
							}else {
								ToolsPanel.imprimePantalla("Su numero anterior es: "+obj.getInfo());
							}
						}else {
							ToolsPanel.imprimePantalla("Este numero no existe");
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
						Nodo op = Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres eliminar"));
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
							Nodo op=Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres modificar"));
							if(op==null) {
								ToolsPanel.imprimeError("Este numero no existe");
							}else {
								Lista.Modificar(op);
							}
						}
					break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu2(String menu){  
		Desordenado<Integer> Lista = new Desordenado();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "PushFr": Lista.insertarFrente((ToolsPanel.leerInt("Ingresa un numero")));
				break;
				case "PushFi": Lista.insertarFinal((ToolsPanel.leerInt("Ingresa un numero"))); 
					break;
				
				case "Buscar":
					if(Lista.isListaVacia()) {
						ToolsPanel.imprimePantalla("Lista vacia");
					}else {
						Nodo obj = Lista.buscarLista(ToolsPanel.leerInt("Que numero buscas"));
						if(obj!=null) {
							ToolsPanel.imprimePantalla("Numero buscado: "+obj.getInfo());
							obj = Lista.buscarAnterior(obj);
							if(obj==null) {
								ToolsPanel.imprimeError("Es el primero numero, no tiene uno anterior.");
							}else {
								ToolsPanel.imprimePantalla("Su numero anterior es: "+obj.getInfo());
							}
						}else {
							ToolsPanel.imprimePantalla("Este numero no existe");
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
						Nodo op = Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres eliminar"));
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
							Nodo op=Lista.buscarLista(ToolsPanel.leerInt("Que numero quieres modificar"));
							if(op==null) {
								ToolsPanel.imprimeError("Este numero no existe");
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
