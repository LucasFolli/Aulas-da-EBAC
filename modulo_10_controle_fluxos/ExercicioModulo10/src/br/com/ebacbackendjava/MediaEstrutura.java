package br.com.ebacbackendjava;
import java.util.Scanner;

/**
 * @author lucasfolli
 *
*/
public class MediaEstrutura{
	public static void main (String args[]) {
		provaFinal();
	}
	
	public static void provaFinal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = scan.next();
		
		float notaUm 		= 0;
		float notaDois 		= 0;
		float notaTres 		= 0;
		float notaQuatro 	= 0;
		
		int contador = 1;
		while (contador <= 4) {
			System.out.println("Nota 1: ");
			notaUm = scan.nextFloat();
			contador ++;
			
			System.out.println("Nota 2: ");
			notaDois = scan.nextFloat();
			contador ++;
			
			System.out.println("Nota 3: ");
			notaTres = scan.nextFloat();
			contador ++;
			
			System.out.println("Nota 4: ");
			notaQuatro = scan.nextFloat();
			contador ++;
		} 
		
		float notaFinal = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		scan.close();
		
		if (notaFinal >= 7) {
			System.out.println(nomeAluno + " aprovado(a)! Ficou com nota " + notaFinal + ".");
			
		} else if (notaFinal >= 5) {
			System.out.println(nomeAluno + " está de recuperação. Ficou com nota " + notaFinal + ".");
			
		} else {
			System.out.println(nomeAluno + " está reprovado(a), com nota " + notaFinal + ".");
		}
	}
}