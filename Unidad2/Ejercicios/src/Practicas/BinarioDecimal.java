package Practicas;

import Tools.ToolsPanel;

public class BinarioDecimal {

	public static void BinarioDes(String num) {
		int res = 0;
        int base = 1;
        for (int i = num.length()-1; i>=0; i--) {
            if (num.charAt(i) == '1') {
               res+=base;
            }
            base *= 2;
        }
        ToolsPanel.imprimePantalla(""+res);
	}
	
	
	
}
