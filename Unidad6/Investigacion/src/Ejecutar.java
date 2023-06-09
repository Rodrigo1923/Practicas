import javax.swing.JOptionPane;

import Tools.ToolsPanel;

public class Ejecutar {
	
	
	public static void main(String[] args) {
		
		menu1("Desordenado,Ordenado,Exit");
	}
	
	public static void desordenados(String menu1){
		String sel="";
		do {
				sel=boton(menu1);
				switch(sel){
				case "Knuth":
					Knuth();
					break;
				case "Salto":
					salto();
					break;
				case "Fibonacci":
					fib();
					break;
				case "Exponencial":
					expo();
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void ordenado(String menu1){
		String sel="";
		do {
				sel=boton(menu1);
				switch(sel){
				case "Interpolacion":
					interpolacion();
					break;
				case "Binario":
					binario();
					break;
				case "Lineal":
					Lineal();
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu1(String menu){
		String Ordenado= "Interpolacion,Binario,Lineal,Exit";
		String Desordenado = "Knuth,Salto,Fibonacci,Exponencial,Exit";
		String sel="";
		
				do {
				sel=boton(menu);
				switch(sel){
				case "Ordenado":
					ordenado(Ordenado);
					break;
				case "Desordenado":
					desordenados(Desordenado);
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	
	
	public static void Knuth() {
		Metodo_Knuth k = new Metodo_Knuth();
		
		String text = ToolsPanel.leerString("Ingresa una cadena de texto");
		String buscar = ToolsPanel.leerString("Que palabra de la cadena de texto quieres encontrar");
		
		int result = k.BuscarPatron(text, buscar);
		
		if(result != -1) {
			ToolsPanel.imprimePantalla("La palabra : '"+buscar+"' esta a partir de la posicion: "+result);
		}else {
			ToolsPanel.imprimeError("Esta palabra no existe en el texto "+result);
		}
		
	}
	
	public static void interpolacion() {
		
		Interpolacion op = new Interpolacion();
		
		double[] x = {1.0, 2.0, 3.0, 4.0, 5.0, 7.0};
		double[] y = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0};
		
		double xValue = 4.5;
		
		double ValorInter = op.InterpolacionLin(x, y, xValue);
		
		if(ValorInter!=-1) {
			ToolsPanel.imprimePantalla("Valor interpolado: "+ValorInter);
		}else {
			ToolsPanel.imprimeError("Este valor no se encontro");
		}
		
	}
	
	public static void salto() {
		
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = ToolsPanel.leerInt("{1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30}\nIngresa el dato:");
		
		int r = Salto.SaltoBusqueda(arr, x);
		
		if(r==-1) {
			ToolsPanel.imprimeError("El dato que buscas no se encuentra en la lista");
		}else {
			ToolsPanel.imprimePantalla("El dato que buscas esta en la posicion: "+r+" \nArreglo:"+ mostrarArr(arr));
		}
		
	}
	
	public static void binario() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = ToolsPanel.leerInt("{1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30}\nIngresa el dato");
		
		int r = Binario.buscar(arr, x);
		
		if(r==-1) {
			ToolsPanel.imprimeError("El dato que buscas no se encuentra en la lista");
		}else {
			//ToolsPanel.imprimePantalla("Los datos ingresados son: {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30}");
			ToolsPanel.imprimePantalla("El dato que buscas esta en la posicion: "+r+" \nArreglo:"+mostrarArr(arr));
		}
		
	}
	
	public static void fib() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Fibo.fibonacci(arr, x);
		
		if(r==-1) {
			ToolsPanel.imprimeError("El dato que buscas no se encuentra en la lista");
		}else {
			ToolsPanel.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
	}
	
	public static void expo() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Expo.busquedaBinaria(arr, x, 0, 14);
		
		if(r==-1) {
			ToolsPanel.imprimeError("El dato que buscas no se encuentra en la lista");
		}else {
			ToolsPanel.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
	}
	
	public static void Lineal() {
		int[] arr = {1, 3, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		boolean r = Lin.secuencialLineal(arr, x);
		
		if(r) {
			ToolsPanel.imprimeError("El dato que buscas no se encuentra en la lista");
		}else {
			ToolsPanel.imprimePantalla("El dato que buscas se encuentra en la lista");
		}
	}
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}
	public static String mostrarArr(int[]arr) {
		String cad="";
		for(int i=0;i<arr.length-1;i++) {
			cad+=arr[i]+", ";
		}
		return cad;
	}
	}


