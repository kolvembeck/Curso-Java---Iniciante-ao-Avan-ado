package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor da media: ");

		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7)
			System.out.println("aprovado!");
		
		entrada.close();
	}
}
