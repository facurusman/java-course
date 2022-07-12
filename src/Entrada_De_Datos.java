import java.util.Scanner;
public class Entrada_De_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner( System.in);
		System.out.println("Introduzca su numbre");
		String nombre = entrada.nextLine();
		System.out.println("Introduce edad, porfavor:");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombre + ". El ano que viene tendras " + (edad + 1) );
	}

}
