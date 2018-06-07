
public class Retangulo implements IFormaGeometrica{
		
		@Override
		public int calcularArea(int b, int h) {
			return b *h;
		}

		@Override
		public int calcularComprimento(int b, int h) {
			return ((2*b) + (2*h));
		}
		
}
