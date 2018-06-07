
public class Circulo implements IFormaGeometrica{
	
	public int calcularArea(int b, int raio) {
		return (b * raio*raio); //pi*r^2
	}

		public int calcularComprimento(int b, int raio) {
		return (2 * b * raio ); //2piR
	}
}
