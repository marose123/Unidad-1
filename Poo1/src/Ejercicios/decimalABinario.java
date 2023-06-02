package Ejercicios;

import javax.swing.JOptionPane;

public class decimalABinario {
	public static String binario(int decimal) {
		String binario=""; int mod; int div=decimal;
		while (div>=1) {
			mod=div%2;
			div=div/2;
			binario = mod+binario;
		}
		return binario;
	}
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
		JOptionPane.showMessageDialog(null, decimalABinario.binario(valor));
	}
}