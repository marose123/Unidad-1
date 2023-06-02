package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
	public static int leerEntero(String msje) {
		return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura int: ",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static void imprimePantalla(String msje) {
		JOptionPane.showMessageDialog(null, msje, "Salida",JOptionPane.INFORMATION_MESSAGE);
	}
	
}