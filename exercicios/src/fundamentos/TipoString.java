package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol? pessoal".charAt(3));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = "33";
		var salario = 12354.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome  + "\n\n");
	
	
	}

}
