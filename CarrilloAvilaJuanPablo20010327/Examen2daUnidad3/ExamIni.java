package MemoriaDinamica;

import javax.swing.JOptionPane;

import DobleLiga.DatosDesordenadosDobleLiga;
import DobleLiga.Nodito;
import Tools.ToolsPanel;

public class ExamIni {

	public static void main(String[] args) {
		menu("Insertar,Mostrar,Eliminar,Exit");
	}
	
	public static void menu(String menu){  
		Examen Lista = new Examen();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Insertar": 
					String nombre = ToolsPanel.leerString("Ingresa tu nombre");
					String apellido= ToolsPanel.leerString("Ingresa tu apellido");
					int edad = ToolsPanel.leerInt("Ingresa tu edad");
					String folio="";
					for(int i=0; i<=3; i++) {
						folio+=""+Lista.generaRandom(0, 10);
					}
					String correo=Lista.generarCorr(nombre, folio);
					Lista.insertarFinal(nombre, apellido, edad, correo, folio);
					break;
				case "Mostrar": 
					ToolsPanel.imprimePantalla(Lista.mostrarLista());
					break;
				case "Eliminar":
					String bus = ToolsPanel.leerString("Que nombre quieres eliminar de la lista");
					Noditos busc = Lista.buscarLista(bus);
					if(busc!=null) {
						Lista.eliminar(busc);
						ToolsPanel.imprimePantalla("Datos eliminados");
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
