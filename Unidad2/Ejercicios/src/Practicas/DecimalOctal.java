package Practicas;

import Tools.ToolsPanel;

public class DecimalOctal {

	public static void Octal() {
		
		int num=0;
		num = 200;
		String octal="";
		
		while(num>0){
			
			octal=(num%8)+octal;
			num/=8;
			
		}
		
		ToolsPanel.imprimePantalla(octal);
		
	}
	
	public static int decimalToOctal(int decimal) {
	    if (decimal == 0) {
	        return 0;
	    } else {
	        return decimalToOctal(decimal / 8) * 10 + decimal % 8;
	    }
	}
	
}
