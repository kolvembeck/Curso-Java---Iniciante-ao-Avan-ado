package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{		
		// (�F - 32) x 5/9 = �C
		final int const1 = 32;
		final double const2 = 5/9.0;
		double F = 86;
		double GrausCelsius = (F - const1) * const2;
		System.out.println(GrausCelsius);				

		F = 150;
		GrausCelsius = (F - const1) * const2;
		System.out.println(GrausCelsius);				
	}
}
