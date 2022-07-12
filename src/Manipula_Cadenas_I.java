
public class Manipula_Cadenas_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Lucas";
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es:  " + nombre.charAt(0));
		int ultmima_letra = nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultmima_letra -1 ));
	}

}
