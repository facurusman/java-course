
public class Uso_Arrays_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros_aleatorios = new int[150];
		
		for(int i=0; i<numeros_aleatorios.length;i++) {
			
			numeros_aleatorios[i] = (int) Math.round(Math.random()*100);
		}
		
		for(int numero:numeros_aleatorios) {
			System.out.print(numero + " ");
		}
	}

}
