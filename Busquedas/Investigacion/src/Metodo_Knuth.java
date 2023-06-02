import Tools.ToolsPanel;

public class Metodo_Knuth {

	private int[] TablaPrefijo(String prefijo) {
	    int[] Tablaprefijo = new int[prefijo.length()];
	    int i = 0;
	    int j = 1;
	    
	    while (j < prefijo.length()) {
	        if (prefijo.charAt(i) == prefijo.charAt(j)) {
	        	Tablaprefijo[j] = i + 1;
	            i++;
	            j++;
	        } else {
	            if (i != 0) {
	                i = Tablaprefijo[i - 1];
	            } else {
	            	Tablaprefijo[j] = 0;
	                j++;
	            }
	        }
	    }
	    
	    return Tablaprefijo;
	}
	
	public int BuscarPatron(String texto, String patron) {
	    int[] Tablaprefijo = TablaPrefijo(patron);
	    int i = 0;
	    int j = 0;
	    
	    while (i < texto.length() && j < patron.length()) {
	    	ToolsPanel.imprimePantalla("Texto: '"+texto+"'\n\n Testo a buscar: '"+patron+"'\n\n posicion texto :"+i+" Letra: "+texto.charAt(i)+"\n\n Posicion patron: "+j+" Letra:"+patron.charAt(j));
	        if (texto.charAt(i) == patron.charAt(j)) {
	            i++;
	            j++;
	        } else {
	            if (j != 0) {
	                j = Tablaprefijo[j - 1];
	            } else {
	                i++;
	            }
	        }
	    }
	    
	    if (j == patron.length()) {
	        return i - j;
	    }
	    
	    return -1;
	}
	
}
