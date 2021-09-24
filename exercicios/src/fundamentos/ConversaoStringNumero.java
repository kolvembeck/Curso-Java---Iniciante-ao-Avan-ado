package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(valor1 + valor2); // Os números estão no formato String
		
		double numero1 = Double.parseDouble(valor1); // Convertendo "valor1" que é String para "Double"
		double numero2 = Double.parseDouble(valor2); // Convertendo "valor2" que é String para "Double"
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("A média do aluno é "+ soma / 2);
			
	}
}
