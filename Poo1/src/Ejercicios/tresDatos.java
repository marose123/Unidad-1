package Ejercicios;

import javax.swing.JOptionPane;

public class tresDatos {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer entero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo entero: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digita el ultimo entero: "));
		if (valor1 == valor2 && valor2 == valor3 && valor3 == valor1) {
			JOptionPane.showMessageDialog(null, "Los enteros "+valor1+", "+valor2+" y "+valor3+" son iguales");
		}	
		else if (valor1>valor2 && valor1>valor3) {
				JOptionPane.showMessageDialog(null, "El entero "+valor1+" es mayor que los enteros "+valor2+" y "+valor3);
		}	
		else if (valor1<valor2 && valor2>valor3) {
				JOptionPane.showMessageDialog(null, "El entero "+valor2+" es mayor que los enteros "+valor1+" y "+valor3);
		}	
		else if (valor1<valor3 && valor2<valor3) {
				JOptionPane.showMessageDialog(null, "El entero "+valor3+" es mayor que los enteros "+valor1+" y "+valor2);
		}
	}
}