package Programas;

import Tools.ToolsPanel;

public class DatoSimple {
	
	 private Object datos[];
	 private byte p;
	 
	 public DatoSimple(byte tam)
	 {
		 datos=new Object[tam];
		 p=-1;
	}
	 
	 public boolean validaVacio()
	 {
		return (p==-1); 
	 }
	 
	 public void almacenarDato()
	 {
		 if(p<datos.length)
		 {
			 datos[p+1]=ToolsPanel.leerString("Escribe un nombre de persona");
			 p++;
		 }
		 else ToolsPanel.imprimeError("Array lleno");
		 
	 }
	 
	 public void imprimeDatos()
	 {
		 String cad="";
		 for (int i = 0; i <=p; i++) {
			 cad+=i+"["+datos[i]+"]"+"\n";
			
		}
		 ToolsPanel.imprimePantalla("datos del array\n"+cad);
	 }
	 
	 public byte buscarSecuencial(Object dat) {
		 
		 byte i=0;
		 while(i<=p && !dat.equals(datos[i]))
			 i++;
			 
		 return (dat.equals(datos[i]))?i:-2;
	 }
	 
	 public void eliminaDatos(byte pos) {
		 byte j=0;
		 for(j=pos; j<=p; j++) {
			 datos[j]=datos[j+1];
		 }
		 p--;
	 }
	 
	 public void editaDato(byte dat) {
		datos[dat]=ToolsPanel.leerString("Ingresa el nuevo nombre"); 
	 }
	 
}
