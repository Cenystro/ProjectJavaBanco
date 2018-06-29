//Subclasse
public class CorrentistaVip extends Correntista {
	private static int proxCodigo = 1;
	private int codigo;
	private String nome;
	private String nomeResposavel;
	
	public CorrentistaVip (String nome, String nomeResponsavel){
		this.codigo = getProxCodigo();
		this.nome = nome;
		
	}
	
	public String getNomeResposavel() {
		return nomeResposavel;
	}

	public void setNomeResposavel(String nomeResposavel) {
		this.nomeResposavel = nomeResposavel;
	}

	public static int getProxCodigo() {
		return proxCodigo++;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}



}
