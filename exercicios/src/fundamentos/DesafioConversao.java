package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner  (System.in);
		
			String salario1 = JOptionPane.showInputDialog("Digite o primeiro sal�rio").replace(",", ".");
			System.out.print("O primeiro salario �  R$ " + salario1 + "\n");
			
			String salario2 = JOptionPane.showInputDialog("Digite o segundo sal�rio".replace(",", "."));
			System.out.print("O segundo salario � R$ " + salario2 + "\n");
			
			String salario3 = JOptionPane.showInputDialog("Digite o terceiro sal�rio".replace(",", "."));
			System.out.println("O terceiro salario � R$ " + salario3 + "\n");
			
			double valor1 = Float.parseFloat(salario1);
			double valor2 = Float.parseFloat(salario2);
			double valor3 = Float.parseFloat(salario3);
			
			double somaSalarios = valor1 + valor2 + valor3;
			
			
			System.out.println("A m�dia dos tr�s salarios � R$ " + somaSalarios / 3);
			
			entrada.close();
			
			
			
	}

}
