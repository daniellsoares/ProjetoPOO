import java.util.Map;

public class Palavra {
	private String nome;
	private Map <String, Palavra> palavras;
	
	public Palavra(String nome){
		this.setNome(nome);
		this.setPalavras(getPalavras());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Map <String,Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(Map <String,Palavra> palavras) {
		this.palavras = palavras;
	}

}
