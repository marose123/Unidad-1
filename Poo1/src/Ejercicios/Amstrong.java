package Ejercicios;

public class Amstrong {
	public static int numArmstrong(int valor) {
		int c=0,a;
		int n=valor;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		return c;
	}
}
