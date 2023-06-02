package Prinipal;

import javax.swing.JOptionPane;

public class menu3 {
	public static void menu_3(String menu) {
		String sel="";
		do {
			sel=Menu.boton(menu);
			switch(sel){
				case "Agregar":JOptionPane.showMessageDialog(null, "Caso Agregar");;break;
				case "Imprimir":JOptionPane.showMessageDialog(null, "Caso Imprimir");break;
				case "Salir":JOptionPane.showMessageDialog(null, "Caso Salir");break;
			}
		}
		while(!sel.equalsIgnoreCase("Salir"));
	}
}