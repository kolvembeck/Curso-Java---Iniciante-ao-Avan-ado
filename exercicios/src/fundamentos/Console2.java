package fundamentos;

import java.util.Scanner;

public class Console2 {
	
	public static void main(String[] args) {
		
		Scanner aluno = new Scanner(System.in);
		
		System.out.print("Qual o nome do aluno? ");
		String nome = aluno.nextLine();
		
		System.out.print("Qual a idade do aluno? ");
		int idade = aluno.nextInt();
		aluno.nextLine();
		
		System.out.println("Qual mat�ria o aluno foi cadastrado? ");
		String materia = aluno.nextLine();
		
		
		System.out.printf("O aluno %s de %d est� matriculado na mat�ria %s", 
				nome, idade, materia);
		
		aluno.close();
					
				
	}

}
