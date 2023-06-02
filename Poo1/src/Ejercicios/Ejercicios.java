package Ejercicios;

import EntradaSalida.Tools;

public class Ejercicios {
		//DiseÃ±ar un metodo que reciba como parametro un valor entero
		// y realice la suma de sus digitos
		public static void sumaDigitos(int valor) {
			int suma=0;
			while(valor!=0) {
				suma+=valor%10;
				valor/=10;
			}
			Tools.imprimePantalla("Suma de digitos: "+suma);
		}
}