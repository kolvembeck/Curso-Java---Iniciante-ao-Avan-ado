package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2); // Os n�meros est�o no formato String
		
		double numero1 = Double.parseDouble(valor1); // Convertendo "valor1" que � String para "Double"
		double numero2 = Double.parseDouble(valor2); // Convertendo "valor2" que � String para "Double"
		
		double soma = numero1 + numero2;
		System.out.println("Soma � " + soma);
		System.out.println("A m�dia do aluno � "+ soma / 2);
			
	}
}
