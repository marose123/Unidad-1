package Prinipal;

import javax.swing.JOptionPane;
import Ejercicios.Amstrong;
import Ejercicios.decimalABinario;
import Ejercicios.digitos;
import Ejercicios.dosParamtros;
import Ejercicios.numerosPrimos;
import Ejercicios.productoDeDosNumeros;
import Ejercicios.tresDatos;
import EntradaSalida.ToolsPanel;
public class Menu {
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
	return(valores[n]);
	}
	public static void menu_3(String menu) {
		String sel="";
		do {
			sel=boton(menu);
			switch(sel){
				case "Armstrong":
					//Amstrong.main(null);
					int valor=Integer.parseInt(JOptionPane.showInputDialog("Introduce un Entero:"));
					if(valor==Amstrong.numArmstrong(valor))
						JOptionPane.showMessageDialog(null, "Es un numero Armstrong");
					else
						JOptionPane.showMessageDialog(null, "No es un numero Armstrong");
					break;
				case "Decimales a Binario":
					decimalABinario.main(null);
					break;
				case "Contar Digitos":
					digitos.main(null);
					break;
				case "Suma de pares":
					dosParamtros.main(null);
					break;
				case "Numeros Primos":
					numerosPrimos.main(null);
					break;
				case "Producto 2 numeros":
					productoDeDosNumeros.main(null);
					break;
				case "Dato mayor":
					tresDatos.main(null);
					break;
				case "Suma digitos":
					TestEjercicios.main(null);
					break;
				case "Salir":JOptionPane.showMessageDialog(null, "Salieno del programa");break;
				default: {ToolsPanel.salidaError(sel);
				}
		}
	}
		while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		menu_3("Armstrong,Decimales a Binario,"
				+ "Contar Digitos,Suma de pares,"
				+ "Numeros Primos,Producto 2 numeros,"
				+ "Dato mayor,Suma digitos,Salir");
	}
}
