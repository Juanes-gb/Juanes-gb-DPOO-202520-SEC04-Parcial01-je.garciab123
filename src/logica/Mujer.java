package logica;

public class Mujer extends Personas {
	public Mujer(int peso, double altura, int edad) {
		this.peso = peso;
        this.altura = altura;
        this.edad = edad;
	}
	
	public double calcularTMB() throws PesoNoValido, EdadNoValida, AlturaNoValida {
		if (peso < 40 || peso > 80) {
			throw new PesoNoValido("El peso debe estar entre 40 y 80 kg para calcular el TMB.");
		}
		
		if (altura < 140 || altura > 180) {
			throw new AlturaNoValida("La altura debe estar entre 140 y 180 cm para calcular el TMB.");
		}
		
		if (edad <= 15) {
			throw new EdadNoValida("La mujer debe ser mayor a 15 años para calcular el TMB.");
		}
		return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
	}
}
