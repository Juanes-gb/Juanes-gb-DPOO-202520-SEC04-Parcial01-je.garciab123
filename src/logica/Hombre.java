package logica;

public class Hombre extends Personas {

	public Hombre(int peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
	
	public double calcularTMB() throws PesoNoValido, EdadNoValida, AlturaNoValida {
		if (peso < 60 || peso > 110) {
			throw new PesoNoValido("El peso debe estar entre 60 y 110 kg para calcular el TMB.");
		}
		if (altura < 160 || altura > 195) {
			throw new AlturaNoValida("La altura debe estar entre 160 y 195cm para calcular el TMB.");
		}
		if (edad <= 15) {
			throw new EdadNoValida("El hombre debe ser mayor a 15 años para calculat TMB.");
		}
		return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
	}

}
