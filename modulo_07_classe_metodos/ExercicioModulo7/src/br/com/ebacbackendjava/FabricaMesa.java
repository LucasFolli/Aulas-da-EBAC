package br.com.ebacbackendjava;

/**
 * Processo de frabicaxio da teibu
 * 
 * @author lucasfolli
 */
public class FabricaMesa {
	
	private int metros;
	
	private String tipoMadeira;

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public String getTipoMadeira() {
		return tipoMadeira;
	}

	public void setTipoMadeira(String tipoMadeira) {
		this.tipoMadeira = tipoMadeira;
	}
	
	public void escolheMadeira (String tipoMadeira) {
		setTipoMadeira(tipoMadeira);
	}
	
	public String retornarNomeMesinha() {
		return "Mesinha Tabajara";
	}
	
	public void imprimeMadeira() {
		System.out.println(this.tipoMadeira);
	}
	
	

}