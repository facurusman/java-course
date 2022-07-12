package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Corsa = new Coche();
		
		System.out.println(Corsa.getPropiedades());
		Corsa.setClimatizador(true);
		System.out.println(Corsa.getClimatizador());
	}
}
