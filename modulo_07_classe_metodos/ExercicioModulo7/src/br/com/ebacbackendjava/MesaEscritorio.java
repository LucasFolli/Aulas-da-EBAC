package br.com.ebacbackendjava;

/**
 * Mesa de madeira
 * 
 * @author lucasfolli
 */
public class MesaEscritorio {
	
	public static void main (String args[]) {
		
		// Criando a mesa
		FabricaMesa mesinha = new FabricaMesa();
		
		// Define madeira que será utilizada
		mesinha.escolheMadeira("Pinheiro");
		
		// Define o tamanho da mesa
		mesinha.setMetros(2);
		
		System.out.println(mesinha.getMetros());
		System.out.println(mesinha.retornarNomeMesinha());		
	}

}
