package Ejercicios;

import javax.swing.JOptionPane;

public class productoDeDosNumeros {
	public static int sumaDeProductos(int valor1, int valor2) {
		int producto=0;
		for(int i=1;i<=valor2;i++) {
			producto=producto+valor1;
		}
		return producto;
	}
	public static void main(String[] args) {
		int entero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer entero: "));
		int entero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo entero: "));
		JOptionPane.showMessageDialog(null, "El producto de los enteros "+entero1+" y "+entero2+
			" es "+sumaDeProductos(entero1, entero2));
	}
}
