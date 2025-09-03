package logica;

public abstract class Personas {
	public int peso;
	public double altura;
	public int edad;
	
	public Personas (int peso, double altura, int edad) {
		this.peso = peso;
        this.altura = altura;
        this.edad = edad;
	}
    
	public int getPeso() {
		return peso;
	}
    
	public double getAltura() {
		return altura;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public abstract double calcularTMB() throws PesoNoValido, EdadNoValida, AlturaNoValida;
	
	public static class PesoNoValido extends Exception {
	    public PesoNoValido(String msg) { 
	    	super(msg); 
	    	}
	}
	
	public static class EdadNoValida extends Exception {
		public EdadNoValida(String msg) {
			super(msg);
		}
	}
	
	public static class AlturaNoValida extends Exception {
		public AlturaNoValida(String msg) {
			super(msg);
		}
	}
}
	


