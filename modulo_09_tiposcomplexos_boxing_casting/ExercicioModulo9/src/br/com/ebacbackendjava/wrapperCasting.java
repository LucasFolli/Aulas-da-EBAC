package br.com.ebacbackendjava;

/**
 * @author lucasfolli
 *
 */
public class wrapperCasting {
	public static void main (String args[]) {
		primitivoWrapper();
		casting();
	}
	
	public static void primitivoWrapper() {
		int numero0 = 15;
		System.out.println("A variável (numero0) está no tipo primitivo: " + numero0);
		Integer numero1 = numero0;
		System.out.println("Agora a variável (numero0) está no tipo wrapper e armazenada na variável (número1): " + numero1);
	}
	
	public static void casting() {
		// Implícito
		int numero0 = 10;
		long numero1 = numero0;
		System.out.println("\nCasting implícito, de int para Long, usando o número '10':\n"
				+ "int 'numero0' é: " + numero0 + "\nLong 'numero0' fica: " + numero1);
		
		// Explícito
		long numero2 = 1212121212121212121l;
		int numero3 = (int) numero2;
		System.out.println("\nCasting explícito, de long para int, usando o número '1212121212121212121':\n"
				+ "long 'numero2' é: " + numero2 + "\nInt 'numero2' fica: " + numero3);		
		
	}

}
