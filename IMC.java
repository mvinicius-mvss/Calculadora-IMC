package calculadoraIMC;
import java.util.Scanner;
public class IMC {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	System.out.println("Qual sua altura em metros?" );
	double altura = entrada.nextDouble();
	System.out.println("Qual seu peso em quilogramas? ");
	int peso = entrada.nextInt();
	double imc = peso/(altura*altura);		
			if (imc<16.9) 
				System.out.println("Você está muito abaixo do peso");
			 else if (imc>16.9 && imc<=18.4) 
					System.out.println("Você está abaixo do peso");
				else if (imc>=18.5 && imc<=24.9) 
						System.out.println("Você está no peso ideal");
					 else if (imc>=25 && imc<=29.9) 
							System.out.println("Você está acima do peso");
						else if (imc>=30 && imc<=34.9) 
								System.out.println("Você está com obesidade grau I");
							 else if (imc>=35 && imc<=40) 
									System.out.println("Você está com obesidade grau II");
								 else 
			System.out.println("Você está com obesidade grau III");
		
	}

}
