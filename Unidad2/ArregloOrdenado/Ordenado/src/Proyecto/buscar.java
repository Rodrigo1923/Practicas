package Proyecto;

import Tools.ToolsPanel;

public class buscar {
	
	private int datos[];
	private byte p;
	
	public buscar(byte tam) {
		
		datos= new int[tam];
		 p=-1;
		
	}
	
	public void imprimeDatos()
	 {
		 String cad="";
		 for (int i = 0; i <=p; i++) {
			 cad+=i+"["+datos[i]+"]"+"\n";
			
		}
		 ToolsPanel.imprimePantalla("datos del array\n"+cad);
	 }
	
	public boolean validaVacio()
	 {
		return (p==-1); 
	 }
	
	public byte buscarSecOrdenado(int dato) {
		
			byte i=0;
			while(i<=p && datos[i] < dato) {
				i++;
			}

			return (byte) ((i>p || datos[i] > dato)?-i:i);
		
	}
	
	public void AgregaOr() {
		
		if(validaVacio()) {
			
			datos[p+1]=ToolsPanel.leerInt("Ingrese el numero");
			p++;

			
		}else {
			
			int dato=ToolsPanel.leerInt("Ingrese el numero");
			int pos=buscarSecOrdenado(dato);
			if(pos>=0) {
				
				ToolsPanel.imprimePantalla("Ya existe");
				
			}else {
				pos*=-1;
				for(int k=p; k>=pos; k--) {
					datos[k+1]=datos[k];
				}
				p++;
				
			}
			datos[pos]=dato;
		}
		
	}
	
	public void eliminar() {
		
		if(validaVacio()) {
			ToolsPanel.imprimeError("Array vacio");
		}else {
			int dato = ToolsPanel.leerInt("Que numero quiere eliminar");
			int pos = buscarSecOrdenado(dato);
			if(pos>=0) {
				for(int k=pos; k<=p; k++) {
					datos[k]=datos[k+1];
				}
				p--;
			}else {
				ToolsPanel.imprimeError("El numero no existe");
			}
		}
		
	}
	
	public void modificar(int dato) {
		
		int pos = buscarSecOrdenado(dato);
		boolean ban=true;
		if(pos>=0) {
			do {
				int dato2=ToolsPanel.leerInt("A que numero lo desa cambiar");
				if(pos!=0 && pos!=p) {
					if(dato2>=datos[pos+1] || dato2<=datos[pos-1]) {
						ToolsPanel.imprimeError("El numero tiene que estar entre "+datos[pos-1]+" y "+ datos[pos+1]);
					}
					else {
						datos[pos]=dato2;
						ban = false;
					}
				}else{
					if(pos>=p && dato2<=datos[pos-1]) {
						ToolsPanel.imprimeError("El numero no puede ser menor que "+datos[pos-1]);
					}else {
						if(pos==0 && dato2>=datos[1]) {
							ToolsPanel.imprimeError("El numero no puede ser mayor que "+datos[1]);
						}
						else {
							datos[pos]=dato2;
							ban = false;
						}
					}
				}
			}while(ban);
		}else {
			ToolsPanel.imprimeError("Este numero no existe");
		}
		
	}
	
}
