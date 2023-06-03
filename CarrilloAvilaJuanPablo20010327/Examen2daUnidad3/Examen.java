package MemoriaDinamica;

import DobleLiga.Nodito;

public class Examen<T> {

	private Noditos inicio;
	private Noditos f;
	
	
	public boolean isListaVacia(){
		return (inicio==null);
	}
	
	public String generarCorr(String nombre, String folio) {
		String correo = nombre.charAt(0)+nombre.charAt(1)+"_"+folio+"@gmail.com";
		return correo;
	}
	
	public int generaRandom (int min, int max) {
		return (int)((max - min + 1) * Math.random()+ min);
	}
	
	public void insertarFinal(String nombre, String apellido, int edad, String correo, String folio) {
		Noditos u = new Noditos(nombre, apellido, edad, correo, folio);
		if(isListaVacia()) {
			inicio = u;
			f=u;
		}else {
			f.sig=u;
		}
		f=u;
	}
	
	public String mostrarLista() {
		String cad="";
		Noditos i=inicio;
		while(i!=null) {
			cad+="Nombre completo: "+i.getNombre()+" "+i.getApellido()+". Edad: "+i.getEdad()+" Correo: "+i.getCorreo()+" Folio: "+i.getFolio();
			i=i.getSig();
		}
		return cad;
	}
	
	public void eliminar(Noditos dato) {
		if(dato==inicio) {
			inicio=inicio.sig;
			dato=null;
		}else {
			Noditos antes=buscarAnterior(dato);
			if(dato==f) {
				f=antes;
				f.sig=null;
				dato=null;
			}else {
				antes.sig=dato.sig;
				dato=null;
			}
		}
	}
	
	public Noditos buscarAnterior(Noditos dato) {
		Noditos i=inicio;
		if(dato!=inicio) {
			while(dato!=i.getSig() && i.getSig()!=null) {
				i=i.getSig();
			}
		}else {
			i=null;
		}
		return (Noditos) i;
	}
	
	public Noditos buscarLista(T dato) {
		Noditos i=inicio;
		while(i!=null && dato.equals(i.getNombre())) {
			i=i.getSig();
		}
		return (i!=null)? (Noditos)i:null;
	}
	
}
