
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.altura = 10.5;
		primeiroQuadrado.base = 15.2;
		System.out.println("A �rea do primeiro quadrado �: "+primeiroQuadrado.Calculo()+".");
		System.out.println();
		
		Quadrado segundoQuadrado = new Quadrado();
		segundoQuadrado.altura = 22.5;
		segundoQuadrado.base = 80.2;
		System.out.println("A �rea do segundo quadrado �: "+segundoQuadrado.Calculo()+".");

	}

}
