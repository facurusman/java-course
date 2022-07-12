import javax.swing.*;
public class Entrada_De_Datos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String edad = JOptionPane.showInputDialog("Ingrese su edad: ");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad_usuario + " años.");
	}

}
