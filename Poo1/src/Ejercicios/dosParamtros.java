package Ejercicios;

import javax.swing.JOptionPane;

public class dosParamtros {
		public static int sumapares(int valor) {
			int sumapar=0;
			for (int i=1;i<=valor;i++) {
				if (i%2==0) {
					sumapar=sumapar+i;
				}
			}
			return sumapar;
		}
		public static int sumaimpares(int valor,int n) {
			int sumaimpar=0;
			for (int i=0;i<=valor;i++) {
				if (i%2!=0 && i<=n) {
					sumaimpar=sumaimpar+i;
				}
			}
			return sumaimpar;
		}
		public static void main(String[] args) {
			int primvalor= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer entero: "));
			int limiteN = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite de la suma de los impares: "));
			JOptionPane.showMessageDialog(null, "El entero: "+primvalor+". La suma de sus pares es: "+sumapares(primvalor)+
					" y la suma de sus impares con el limite de "+limiteN+" es "+sumaimpares(primvalor,limiteN));
		}
}

