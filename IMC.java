package calculadoraIMC;

public class IMC {
	public static void main(String[] args) {
		
		int peso = 110;
		double altura = 1.74;
		double imc = peso/(altura*altura);		
			if (imc<25)
				System.out.println("Você está no peso certo");
			else
				System.out.println("Você está acima do peso");
		
		
	}

}
