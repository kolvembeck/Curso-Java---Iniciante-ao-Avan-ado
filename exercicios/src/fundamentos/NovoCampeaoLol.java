package fundamentos;

import java.util.Scanner;

public class NovoCampeaoLol {
	
	public static void main(String[] args) {
		
		Scanner mid = new Scanner(System.in);
		
		System.out.print("Digite o nome do campe?o: ");
		String campeao = mid.next();
		
		System.out.print("Quantas habilidades o campe?o tem? ");
		int habilidade = mid.nextInt();
		mid.nextLine();		
		
		System.out.printf("O campe?o %s possui %d habilidades", campeao, habilidade);	
	
		mid.close();
	}

}
