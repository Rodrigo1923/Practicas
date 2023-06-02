package Operaciones;

import MemoriaDinamica.Nodo;
import Tools.ToolsPanel;

public class Ordenado<T> implements OperaTDA<T>{

	private Nodo inicio;
	private Nodo f;
	
	@Override
	public void insertarFrente(T dato) {
		Nodo u = new Nodo(dato);
		if(isListaVacia()) {
			inicio=u;
			f=u;
		}else {
			if((int)dato>=(int)inicio.getInfo()) {
				ToolsPanel.imprimeError("El dato no puede ser mayor o igual a"+inicio.getInfo());
			}else {
				u.sig=inicio;
				inicio=u;
			}
		}
	}

	@Override
	public void insertarFinal(T dato) {
		Nodo u = new Nodo(dato);
		if(isListaVacia()) {
			inicio = u;
			f=u;
		}else {
			if((int)dato<=(int)f.getInfo()) {
				ToolsPanel.imprimePantalla("El dato no puede ser menor o igual que: "+f.getInfo());
			}else 
				f.sig=u;
		}
		f=u;
	}

	@Override
	public boolean isListaVacia() {
		return (inicio==null);
	}

	@Override
	public Nodo buscarLista(T dato) {
		Nodo i=inicio;
		while(i!=null && dato!=i.getInfo()) {
			i=i.getSig();
		}
		return (i!=null)? (Nodo)i:null;
	}
	
	public Nodo buscarAnterior(Nodo dato) {
		Nodo i=inicio;
		if(dato!=inicio) {
			while(dato!=i.getSig() && i.getSig()!=null) {
				i=i.getSig();
			}
		}else {
			i=null;
		}
		return (Nodo) i;
	}

	@Override
	public void Eliminar(Nodo existe) {
		if(existe==inicio) {
			inicio=inicio.sig;
			existe=null;
		}else {
			Nodo antes=buscarAnterior(existe);
			if(existe==f) {
				f=antes;
				f.sig=null;
				existe=null;
			}else {
				antes.sig=existe.sig;
				existe=null;
			}
		}
	}

	@Override
	public void Modificar(Nodo dato) {
		Nodo ant = buscarAnterior(dato);
		
		boolean ban = true;
		while(ban) {
			int datos =ToolsPanel.leerInt("A que numero lo quieres cambiar");
			if((int)ant.info>=0) {
				if(datos<=(int)ant.info) {
					ToolsPanel.imprimeError("El numero no puede ser menor o igual a: "+ant.info);
				}else {
					if(dato.sig!=null) {
						if(datos>=(int)dato.sig.info) {
							ToolsPanel.imprimeError("El numero no puede ser mayor o igual a: "+dato.sig.info);
						}
						else {
							dato.setInfo(datos);
							ban=false;
						}
					}else {
						dato.setInfo(datos);
						ban=false;
					}
				}
			}else {
				if(dato.sig!=null) {
					if(datos>=(int)dato.sig.info) {
						ToolsPanel.imprimeError("El numero no puede ser mayor o igual a: "+dato.sig.info);
					}
					else {
						dato.setInfo(datos);
						ban=false;
					}
				}else {
					dato.setInfo(datos);
					ban=false;
				}
			}
		}
		
	}

	@Override
	public String mostrarLista() {
		String cad="";
		Nodo i=inicio;
		while(i!=null) {
			cad+=i.getInfo()+"--->\n";
			i=i.getSig();
		}
		return cad;
	}

}
