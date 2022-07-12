
public class Array_de_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int[4][5];
		for(int i=0; i<matriz.length; i++) {
			for(int e=0; e<5; i++) {
				matriz[i][e] = (int) Math.round(Math.random()*100);
			}
		}
		for(int[] elemento:matriz) {
			System.out.print(elemento);
		}
		
	}

}
