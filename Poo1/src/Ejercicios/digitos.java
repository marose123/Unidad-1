package Ejercicios;

import javax.swing.JOptionPane;

public class digitos {
	public static int numDigitos(int valor) {
		int contador=0; int num=valor;
		while(num>0) {
			contador=contador+1;
			num=num/10;
		}
		return contador;
	}
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
		JOptionPane.showMessageDialog(null, "Numero de digitos "+numDigitos(valor));
	}
}