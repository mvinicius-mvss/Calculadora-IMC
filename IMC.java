package calculadoraIMC;
import java.util.Scanner;
public class IMC {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	System.out.println("Qual sua altura?" );
	double altura = entrada.nextDouble();
	System.out.println("Qual seu peso? ");
	int peso = entrada.nextInt();
	double imc = peso/(altura*altura);		
			if (imc<25)
				System.out.println("Você está no peso certo");
			else
				System.out.println("Você está acima do peso");
		
		
	}

}
