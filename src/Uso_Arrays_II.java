import javax.swing.JOptionPane;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises = new String[10];
		
		for(int i=0; i<10;i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce un pais " +(i+1));
		}

		for(String elemento:paises) {
			
			System.out.println(elemento);
		}
	}

}
