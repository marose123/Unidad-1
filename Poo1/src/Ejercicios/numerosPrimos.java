package Ejercicios;

import javax.swing.JOptionPane;

public class numerosPrimos {
	public static int numPrimo(int valor) {
		int contador=0;
		if (valor==1) {
			contador=0;
		}
		else {
			for(int i=1;i<=valor;i++) {
				if(valor%i==0) {
					contador++;
				}
			}
		}
		return contador;
	}
	public static void main(String[] args) {
		int ent = Integer.parseInt(JOptionPane.showInputDialog("Introduce un entero: "));
		if(numerosPrimos.numPrimo(ent)==2) {
			JOptionPane.showMessageDialog(null, "El entero "+ent+" es un numero primo.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El entero "+ent+" no es un numero primo.");
		}
	}
}