package fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

		Integer i = 10000;
		Long l = 10000000L;

		System.out.println(b.byteValue());
		System.out.println(s.doubleValue());
		System.out.println(i);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

	}

}
