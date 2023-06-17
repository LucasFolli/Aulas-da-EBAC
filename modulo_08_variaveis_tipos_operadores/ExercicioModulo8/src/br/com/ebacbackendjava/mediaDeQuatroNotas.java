package br.com.ebacbackendjava;

/**
 * @author lucasfolli
 *
 */
public class mediaDeQuatroNotas {
	
	public static void main(String args[]) {
		mediaQuatroNotas();
	}
	
	public static void mediaQuatroNotas() {
		System.out.println("Bem vindo ao cálculo de notas do semestre atual!\n"
				+ "A média é calculada somando as 4 notas das atividades e dividindo o resultado por 4.");
		
		int nota1 = 5;
		int nota2 = 7;
		int nota3 = 4;
		int nota4 = 6;
		int notaTotal = nota1 += nota2 += nota3 += nota4;
		int notaFinal = notaTotal / 4;
		
		System.out.println("A nota total do aluno é de: " + notaTotal);
		System.out.println("A média final do aluno é: " + notaFinal);
	}

}
