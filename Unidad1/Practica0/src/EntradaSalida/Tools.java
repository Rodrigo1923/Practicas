package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {

	public static int leerEntero(String msje) {
		return(Integer.parseInt(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static byte leerByte(String msje) {
		return(Byte.parseByte(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static short leerShort(String msje) {
		return(Short.parseShort(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static char leerChar(String msje) {
		return(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE).charAt(0));
	}
	
	public static long leerLong(String msje) {
		return(Long.parseLong(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static float leerFloat(String msje) {
		return(Float.parseFloat(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static double leerDouble(String msje) {
		return(Double.parseDouble(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE)));
	}
	
	public static String leerString(String msje) {
		return(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.INFORMATION_MESSAGE));
	}
	
	public static int leerErr(String msje) {
		return(Integer.parseInt(JOptionPane.showInputDialog(null, msje, "Inserta un entero", JOptionPane.WARNING_MESSAGE)));
	}
	
}
