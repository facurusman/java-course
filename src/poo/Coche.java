package poo;

public class Coche {
	private int ruedas, largo, ancho, motor, peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asiento_cuero, climatizador;
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=1500;
		color="Rojo";
	}
	
	public String getPropiedades() {
		return "La plataforma del vehiculo tiene: " + ruedas + " ruedas. Un largo de " + largo + ", un ancho de " + ancho +", un peso de " + peso_plataforma + " y un motor de " + motor;
	}
	
	public void setClimatizador(boolean valor) {
		climatizador=valor;
	}
	
	public boolean getClimatizador() {
		return climatizador;
	}
	
	
}
